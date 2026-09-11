package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
public final class u40 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.mq0 {
    public String E;
    public boolean F;
    public boolean H;
    public final boolean I;
    public TLRPC.User L;
    public TLRPC.InputFile M;
    public TLRPC.InputFile N;
    public TLRPC.VideoSize O;
    public double P;
    public final boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public int U;
    public final int V;
    public float W;
    public org.telegram.ui.ActionBar.n2 f30799a;
    public t40 f30800b;
    public vi f30801c;
    public String f30803f;
    public TLRPC.PhotoSize h;
    public TLRPC.PhotoSize f30804n;
    public Bitmap f30805r;
    public boolean f30806s;
    public String v;
    public String f30807w;
    public String f30808x;
    public MessageObject f30809y;
    public final int d = UserConfig.selectedAccount;
    public boolean G = true;
    public boolean J = true;
    public boolean K = true;
    public final ImageReceiver f30802e = new ImageReceiver(null);

    public u40(int i10, boolean z10, boolean z11) {
        this.Q = z10;
        this.I = z11;
        this.V = i10;
    }

    public static void a(u40 u40Var, ArrayList arrayList, Runnable runnable, int i10) {
        org.telegram.ui.ActionBar.n2 n2Var;
        int intValue = ((Integer) arrayList.get(i10)).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue == 4 && (n2Var = u40Var.f30799a) != null && n2Var.getParentActivity() != null) {
                            try {
                                int i11 = Build.VERSION.SDK_INT;
                                if (i11 >= 23 && u40Var.f30799a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                    u40Var.f30799a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                                    return;
                                }
                                Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                                File generateVideoPath = AndroidUtilities.generateVideoPath();
                                if (generateVideoPath != null) {
                                    if (i11 >= 24) {
                                        Activity parentActivity = u40Var.f30799a.getParentActivity();
                                        intent.putExtra("output", FileProvider.d(parentActivity, ApplicationLoader.getApplicationId() + ".provider", generateVideoPath));
                                        intent.addFlags(2);
                                        intent.addFlags(1);
                                    } else {
                                        intent.putExtra("output", Uri.fromFile(generateVideoPath));
                                    }
                                    intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
                                    intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
                                    intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
                                    intent.putExtra("android.intent.extra.durationLimit", 10);
                                    u40Var.f30803f = generateVideoPath.getAbsolutePath();
                                }
                                u40Var.f30799a.startActivityForResult(intent, 15);
                                return;
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                return;
                            }
                        }
                        return;
                    }
                    runnable.run();
                    return;
                }
                u40Var.r();
                return;
            }
            u40Var.n();
            return;
        }
        u40Var.m();
    }

    public static void b(u40 u40Var, boolean z10, ArrayList arrayList) {
        MessageObject messageObject;
        Bitmap loadBitmap;
        ImageReceiver imageReceiver = u40Var.f30802e;
        int i10 = u40Var.d;
        if (!arrayList.isEmpty()) {
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList.get(0);
            Bitmap bitmap = null;
            if ((sendingMediaInfo.isVideo || sendingMediaInfo.videoEditedInfo != null) && !sendingMediaInfo.isLivePhoto) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f19890id = 0;
                tL_message.message = "";
                tL_message.media = new TLRPC.TL_messageMediaEmpty();
                tL_message.action = new TLRPC.TL_messageActionEmpty();
                tL_message.dialog_id = 0L;
                messageObject = new MessageObject(UserConfig.selectedAccount, tL_message, false, false);
                messageObject.messageOwner.attachPath = new File(FileLoader.getDirectory(4), SharedConfig.getLastLocalId() + "_avatar.mp4").getAbsolutePath();
                messageObject.videoEditedInfo = sendingMediaInfo.videoEditedInfo;
                messageObject.emojiMarkup = sendingMediaInfo.emojiMarkup;
                bitmap = ImageLoader.loadBitmap(sendingMediaInfo.thumbPath, null, 800.0f, 800.0f, true);
            } else {
                String str = sendingMediaInfo.path;
                if (str != null) {
                    loadBitmap = ImageLoader.loadBitmap(str, null, 800.0f, 800.0f, true);
                } else {
                    MediaController.SearchImage searchImage = sendingMediaInfo.searchImage;
                    if (searchImage != null) {
                        TLRPC.Photo photo = searchImage.photo;
                        if (photo != null) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                            if (closestPhotoSizeWithSize != null) {
                                File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(closestPhotoSizeWithSize, true);
                                u40Var.E = pathToAttach.getAbsolutePath();
                                if (!pathToAttach.exists()) {
                                    pathToAttach = FileLoader.getInstance(i10).getPathToAttach(closestPhotoSizeWithSize, false);
                                    if (!pathToAttach.exists()) {
                                        pathToAttach = null;
                                    }
                                }
                                if (pathToAttach != null) {
                                    loadBitmap = ImageLoader.loadBitmap(pathToAttach.getAbsolutePath(), null, 800.0f, 800.0f, true);
                                } else {
                                    NotificationCenter.getInstance(i10).addObserver(u40Var, NotificationCenter.fileLoaded);
                                    NotificationCenter.getInstance(i10).addObserver(u40Var, NotificationCenter.fileLoadFailed);
                                    u40Var.v = FileLoader.getAttachFileName(closestPhotoSizeWithSize.location);
                                    imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, sendingMediaInfo.searchImage.photo), null, null, "jpg", null, 1);
                                }
                            }
                            loadBitmap = null;
                        } else if (searchImage.imageUrl != null) {
                            File file = new File(FileLoader.getDirectory(4), Utilities.MD5(sendingMediaInfo.searchImage.imageUrl) + "." + ImageLoader.getHttpUrlExtension(sendingMediaInfo.searchImage.imageUrl, "jpg"));
                            u40Var.E = file.getAbsolutePath();
                            if (file.exists() && file.length() != 0) {
                                loadBitmap = ImageLoader.loadBitmap(file.getAbsolutePath(), null, 800.0f, 800.0f, true);
                            } else {
                                u40Var.v = sendingMediaInfo.searchImage.imageUrl;
                                NotificationCenter.getInstance(i10).addObserver(u40Var, NotificationCenter.httpFileDidLoad);
                                NotificationCenter.getInstance(i10).addObserver(u40Var, NotificationCenter.httpFileDidFailedLoad);
                                imageReceiver.setImage(sendingMediaInfo.searchImage.imageUrl, null, null, "jpg", 1L);
                            }
                        }
                    }
                    messageObject = null;
                }
                messageObject = null;
                bitmap = loadBitmap;
            }
            u40Var.s(z10, bitmap, messageObject);
        }
    }

    public final void c() {
        this.T = true;
        String str = this.v;
        int i10 = this.d;
        if (str != null) {
            FileLoader.getInstance(i10).cancelFileUpload(this.v, false);
        }
        if (this.f30807w != null) {
            FileLoader.getInstance(i10).cancelFileUpload(this.f30807w, false);
        }
        t40 t40Var = this.f30800b;
        if (t40Var != null) {
            t40Var.P();
        }
    }

    public final void d() {
        this.v = null;
        this.f30807w = null;
        this.f30808x = null;
        this.f30809y = null;
        if (this.F) {
            this.f30802e.setImageBitmap((Drawable) null);
            this.f30799a = null;
            this.f30800b = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        t40 t40Var;
        org.telegram.ui.ActionBar.n2 n2Var;
        String str;
        int i12 = NotificationCenter.fileUploaded;
        int i13 = this.d;
        if (i10 != i12 && i10 != NotificationCenter.fileUploadFailed) {
            if (i10 == NotificationCenter.fileUploadProgressChanged) {
                String str2 = (String) objArr[0];
                if (this.f30809y != null) {
                    str = this.f30807w;
                } else {
                    str = this.v;
                }
                if (this.f30800b != null && str2.equals(str)) {
                    float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
                    t40 t40Var2 = this.f30800b;
                    this.W = min;
                    t40Var2.C(min);
                    return;
                }
                return;
            }
            int i14 = NotificationCenter.fileLoaded;
            if (i10 != i14 && i10 != NotificationCenter.fileLoadFailed && i10 != NotificationCenter.httpFileDidLoad && i10 != NotificationCenter.httpFileDidFailedLoad) {
                int i15 = NotificationCenter.filePreparingFailed;
                if (i10 == i15) {
                    if (((MessageObject) objArr[0]) == this.f30809y && this.f30799a != null) {
                        NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.filePreparingStarted);
                        NotificationCenter.getInstance(i13).removeObserver(this, i15);
                        NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
                        d();
                        return;
                    }
                    return;
                } else if (i10 == NotificationCenter.fileNewChunkAvailable) {
                    if (((MessageObject) objArr[0]) == this.f30809y && this.f30799a != null) {
                        String str3 = (String) objArr[1];
                        long longValue = ((Long) objArr[2]).longValue();
                        long longValue2 = ((Long) objArr[3]).longValue();
                        this.f30799a.getFileLoader().checkUploadNewDataAvailable(str3, false, longValue, longValue2);
                        if (longValue2 != 0) {
                            double longValue3 = ((Long) objArr[5]).longValue() / 1000000.0d;
                            if (this.P > longValue3) {
                                this.P = longValue3;
                            }
                            Bitmap createVideoThumbnailAtTime = SendMessagesHelper.createVideoThumbnailAtTime(str3, (long) (this.P * 1000.0d), null, true);
                            if (createVideoThumbnailAtTime != null) {
                                File pathToAttach = FileLoader.getInstance(i13).getPathToAttach(this.f30804n, true);
                                if (pathToAttach != null) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.e("delete file " + pathToAttach);
                                    }
                                    pathToAttach.delete();
                                }
                                File pathToAttach2 = FileLoader.getInstance(i13).getPathToAttach(this.h, true);
                                if (pathToAttach2 != null) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.e("delete file " + pathToAttach2);
                                    }
                                    pathToAttach2.delete();
                                }
                                this.h = ImageLoader.scaleAndSaveImage(createVideoThumbnailAtTime, 800.0f, 800.0f, 80, false, 320, 320);
                                TLRPC.PhotoSize scaleAndSaveImage = ImageLoader.scaleAndSaveImage(createVideoThumbnailAtTime, 150.0f, 150.0f, 80, false, 150, 150);
                                this.f30804n = scaleAndSaveImage;
                                if (scaleAndSaveImage != null) {
                                    try {
                                        Bitmap decodeFile = BitmapFactory.decodeFile(FileLoader.getInstance(i13).getPathToAttach(this.f30804n, true).getAbsolutePath());
                                        ImageLoader.getInstance().putImageToCache(new BitmapDrawable(decodeFile), this.f30804n.location.volume_id + "_" + this.f30804n.location.local_id + "@50_50", true);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.filePreparingStarted);
                            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.filePreparingFailed);
                            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
                            this.f30808x = str3;
                            this.f30807w = str3;
                            this.f30809y = null;
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == NotificationCenter.filePreparingStarted && ((MessageObject) objArr[0]) == this.f30809y && (n2Var = this.f30799a) != null) {
                    this.f30807w = (String) objArr[1];
                    n2Var.getFileLoader().uploadFile(this.f30807w, false, false, (int) this.f30809y.videoEditedInfo.estimatedSize, 33554432, false);
                    return;
                } else {
                    return;
                }
            }
            this.W = 1.0f;
            if (((String) objArr[0]).equals(this.v)) {
                NotificationCenter.getInstance(i13).removeObserver(this, i14);
                NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileLoadFailed);
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i13);
                int i16 = NotificationCenter.httpFileDidLoad;
                notificationCenter.removeObserver(this, i16);
                NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.httpFileDidFailedLoad);
                this.v = null;
                if (i10 != i14 && i10 != i16) {
                    this.f30802e.setImageBitmap((Drawable) null);
                    t40 t40Var3 = this.f30800b;
                    if (t40Var3 != null) {
                        t40Var3.P();
                        return;
                    }
                    return;
                }
                s(false, ImageLoader.loadBitmap(this.E, null, 800.0f, 800.0f, true), null);
                return;
            }
            return;
        }
        String str4 = (String) objArr[0];
        if (str4.equals(this.v)) {
            this.v = null;
            if (i10 == i12) {
                this.M = (TLRPC.InputFile) objArr[1];
            }
        } else if (str4.equals(this.f30807w)) {
            this.f30807w = null;
            if (i10 == i12) {
                this.N = (TLRPC.InputFile) objArr[1];
            }
        } else {
            return;
        }
        if (this.v == null && this.f30807w == null && this.f30809y == null) {
            NotificationCenter.getInstance(i13).removeObserver(this, i12);
            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileUploadFailed);
            if (i10 == i12 && (t40Var = this.f30800b) != null) {
                t40Var.Q(this.M, this.N, this.P, this.f30808x, this.h, this.f30804n, this.f30806s, this.O);
            }
            d();
        }
    }

    public final void e() {
        this.T = false;
        if (this.v == null && this.f30807w == null && this.f30809y == null) {
            this.f30799a = null;
            this.f30800b = null;
        } else {
            this.F = true;
        }
        vi viVar = this.f30801c;
        if (viVar != null) {
            viVar.dismissInternal();
            this.f30801c.v1();
        }
    }

    public final void f() {
        int i10;
        ot otVar;
        boolean z10;
        org.telegram.ui.ActionBar.n2 n2Var = this.f30799a;
        if (n2Var != null && n2Var.getParentActivity() != null) {
            if (this.f30801c == null) {
                vi viVar = new vi(this.f30799a.getParentActivity(), this.f30799a, this.R, this.S);
                this.f30801c = viVar;
                if (this.Q) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                t40 t40Var = this.f30800b;
                if (t40Var != null && t40Var.t()) {
                    t40 t40Var2 = this.f30800b;
                    Objects.requireNonNull(t40Var2);
                    otVar = new ot(t40Var2, 1);
                } else {
                    otVar = null;
                }
                viVar.Q0 = i10;
                viVar.R0 = otVar;
                viVar.S0 = false;
                ni niVar = viVar.f31340y0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.f31291j0;
                if (niVar == null || niVar == chatAttachAlertPhotoLayout) {
                    viVar.f31337x1.setVisibility(8);
                }
                int i11 = viVar.Q0;
                TextView textView = viVar.f31292j1;
                if (i11 == 2) {
                    textView.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
                } else {
                    textView.setText(LocaleController.getString(R.string.ChoosePhoto));
                }
                if (chatAttachAlertPhotoLayout != null) {
                    vi viVar2 = chatAttachAlertPhotoLayout.f28753b;
                    if (viVar2.Q0 != 0 && !viVar2.F) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    chatAttachAlertPhotoLayout.f23849g1 = z10;
                }
                vi viVar3 = this.f30801c;
                viVar3.Z1 = new p40(this);
                viVar3.U = this;
            }
            int i12 = this.U;
            if (i12 == 1) {
                this.f30801c.f31292j1.setText(LocaleController.formatString("SetPhotoFor", R.string.SetPhotoFor, this.L.first_name));
            } else if (i12 == 2) {
                this.f30801c.f31292j1.setText(LocaleController.formatString("SuggestPhotoFor", R.string.SuggestPhotoFor, this.L.first_name));
            }
        }
    }

    public final boolean g(Dialog dialog) {
        vi viVar = this.f30801c;
        if (viVar == null || dialog != viVar) {
            return false;
        }
        viVar.f31291j0.a0(false);
        this.f30801c.dismissInternal();
        this.f30801c.f31291j0.d0(true);
        return true;
    }

    public final boolean h() {
        if (this.v == null && this.f30807w == null && this.f30809y == null) {
            return false;
        }
        return true;
    }

    public final void i(int i10, int i11, Intent intent) {
        if (i11 == -1) {
            if (i10 != 0 && i10 != 2) {
                if (i10 == 13) {
                    this.f30799a.getParentActivity().overridePendingTransition(R.anim.alpha_in, R.anim.alpha_out);
                    PhotoViewer.t1().K2(null, this.f30799a, null);
                    p(this.f30803f, null, AndroidUtilities.getImageOrientation(this.f30803f), false);
                    AndroidUtilities.addMediaToGallery(this.f30803f);
                    this.f30803f = null;
                    return;
                } else if (i10 == 14) {
                    if (intent != null && intent.getData() != null) {
                        AndroidUtilities.runOnUIThread(new zu(12, this, intent.getData()));
                        return;
                    }
                    return;
                } else if (i10 == 15) {
                    q(this.f30803f, null, true);
                    AndroidUtilities.addMediaToGallery(this.f30803f);
                    this.f30803f = null;
                    return;
                } else {
                    return;
                }
            }
            f();
            vi viVar = this.f30801c;
            if (viVar != null) {
                viVar.f31291j0.g0(i10, intent, this.f30803f);
            }
            this.f30803f = null;
        }
    }

    public final void j() {
        vi viVar = this.f30801c;
        if (viVar != null) {
            viVar.x1();
        }
    }

    public final void k(int i10, String[] strArr, int[] iArr) {
        vi viVar = this.f30801c;
        if (viVar != null) {
            if (i10 == 17) {
                viVar.f31291j0.U(false);
                this.f30801c.f31291j0.Y();
            } else if (i10 == 4) {
                viVar.f31291j0.Y();
            }
        }
    }

    public final void l() {
        vi viVar = this.f30801c;
        if (viVar != null) {
            viVar.y1();
        }
    }

    public final void m() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f30799a;
        if (n2Var != null && n2Var.getParentActivity() != null) {
            try {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 23 && this.f30799a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    this.f30799a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                    return;
                }
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File generatePicturePath = AndroidUtilities.generatePicturePath();
                if (generatePicturePath != null) {
                    if (i10 >= 24) {
                        Activity parentActivity = this.f30799a.getParentActivity();
                        intent.putExtra("output", FileProvider.d(parentActivity, ApplicationLoader.getApplicationId() + ".provider", generatePicturePath));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(generatePicturePath));
                    }
                    this.f30803f = generatePicturePath.getAbsolutePath();
                }
                this.f30799a.startActivityForResult(intent, 13);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    public final void n() {
        int i10;
        org.telegram.ui.ActionBar.n2 n2Var = this.f30799a;
        if (n2Var == null) {
            return;
        }
        Activity parentActivity = n2Var.getParentActivity();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33 && parentActivity != null) {
            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 151);
                return;
            }
        } else if (i11 >= 23 && parentActivity != null && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 151);
            return;
        }
        if (this.Q) {
            i10 = 3;
        } else {
            i10 = 1;
        }
        org.telegram.ui.kq0 kq0Var = new org.telegram.ui.kq0(i10, false, false, null);
        kq0Var.f38113x = this.J;
        kq0Var.V = new q40(this);
        this.f30799a.presentFragment(kq0Var);
    }

    public final void o(boolean z10, final Runnable runnable, DialogInterface.OnDismissListener onDismissListener, int i10) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f30799a;
        if (n2Var != null && n2Var.getParentActivity() != null) {
            this.T = false;
            this.U = i10;
            if (this.G) {
                org.telegram.ui.ActionBar.n2 n2Var2 = this.f30799a;
                if (n2Var2 != null && n2Var2.getParentActivity() != null) {
                    f();
                    vi viVar = this.f30801c;
                    viVar.U1 = this.H;
                    viVar.J1(1, false);
                    this.f30801c.f31291j0.f0();
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 == 21 || i11 == 22) {
                        AndroidUtilities.hideKeyboard(this.f30799a.getFragmentView().findFocus());
                    }
                    this.f30801c.r1();
                    this.f30801c.setOnHideListener(onDismissListener);
                    int i12 = this.U;
                    if (i12 != 0) {
                        this.f30801c.Q = new s40(i12, this.L);
                    }
                    vi viVar2 = this.f30801c;
                    viVar2.getClass();
                    this.f30799a.showDialog(viVar2);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) this.f30799a.getParentActivity(), (org.telegram.ui.ActionBar.f6) null, false);
            f3Var.fixNavigationBar();
            if (i10 == 1) {
                f3Var.title = LocaleController.formatString("SetPhotoFor", R.string.SetPhotoFor, this.L.first_name);
                f3Var.bigTitle = true;
            } else if (i10 == 2) {
                f3Var.title = LocaleController.formatString("SuggestPhotoFor", R.string.SuggestPhotoFor, this.L.first_name);
                f3Var.bigTitle = true;
            } else {
                f3Var.title = LocaleController.getString(R.string.ChoosePhoto);
                f3Var.bigTitle = true;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            final ArrayList arrayList3 = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.ChooseTakePhoto));
            org.telegram.ui.Cells.p6.n(R.drawable.msg_camera, 0, arrayList2, arrayList3);
            if (this.Q) {
                arrayList.add(LocaleController.getString(R.string.ChooseRecordVideo));
                org.telegram.ui.Cells.p6.n(R.drawable.msg_video, 4, arrayList2, arrayList3);
            }
            arrayList.add(LocaleController.getString(R.string.ChooseFromGallery));
            org.telegram.ui.Cells.p6.n(R.drawable.msg_photos, 1, arrayList2, arrayList3);
            if (this.J) {
                arrayList.add(LocaleController.getString(R.string.ChooseFromSearch));
                org.telegram.ui.Cells.p6.n(R.drawable.msg_search, 2, arrayList2, arrayList3);
            }
            if (z10) {
                arrayList.add(LocaleController.getString(R.string.DeletePhoto));
                org.telegram.ui.Cells.p6.n(R.drawable.msg_delete, 3, arrayList2, arrayList3);
            }
            int[] iArr = new int[arrayList2.size()];
            int size = arrayList2.size();
            for (int i13 = 0; i13 < size; i13++) {
                iArr[i13] = ((Integer) arrayList2.get(i13)).intValue();
            }
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i14) {
                    u40.a(u40.this, arrayList3, runnable, i14);
                }
            };
            f3Var.items = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
            f3Var.itemIcons = iArr;
            f3Var.onClickListener = onClickListener;
            f3Var.setOnHideListener(onDismissListener);
            this.f30799a.showDialog(f3Var);
            if (z10) {
                f3Var.setItemColor(arrayList.size() - 1, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20898q7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20880p7, false));
            }
        }
    }

    public final void p(String str, String str2, Pair pair, boolean z10) {
        ArrayList arrayList = new ArrayList();
        MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, 0, 0L, str, ((Integer) pair.first).intValue(), false, 0, 0, 0L).setOrientation(pair);
        orientation.isVideo = z10;
        orientation.thumbPath = str2;
        arrayList.add(orientation);
        PhotoViewer.t1().K2(null, this.f30799a, null);
        PhotoViewer.t1().f2(arrayList, 0, 1, false, new r40(this, arrayList), null);
        PhotoViewer.t1().P = true;
    }

    public final void q(String str, String str2, boolean z10) {
        p(str, str2, new Pair(0, 0), z10);
    }

    public final void r() {
        if (this.f30799a == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.br0 br0Var = new org.telegram.ui.br0(0, null, hashMap, arrayList, 1, false, null, this.R);
        br0Var.f34906s0 = new o40(this, hashMap, arrayList);
        br0Var.f0(1, false);
        br0Var.f34901p0 = this.f30800b.getInitialSearchString();
        if (this.S) {
            this.f30799a.showAsSheet(br0Var);
        } else {
            this.f30799a.presentFragment(br0Var);
        }
    }

    public final void s(boolean z10, Bitmap bitmap, MessageObject messageObject) {
        TLRPC.VideoSize videoSize;
        if (bitmap != null) {
            this.N = null;
            this.M = null;
            this.f30809y = null;
            this.f30808x = null;
            if (messageObject == null) {
                videoSize = null;
            } else {
                videoSize = messageObject.emojiMarkup;
            }
            this.O = videoSize;
            this.h = ImageLoader.scaleAndSaveImage(bitmap, 800.0f, 800.0f, 80, false, 320, 320);
            TLRPC.PhotoSize scaleAndSaveImage = ImageLoader.scaleAndSaveImage(bitmap, 150.0f, 150.0f, 80, false, 150, 150);
            this.f30804n = scaleAndSaveImage;
            int i10 = this.d;
            if (scaleAndSaveImage != null) {
                try {
                    Bitmap decodeFile = BitmapFactory.decodeFile(FileLoader.getInstance(i10).getPathToAttach(this.f30804n, true).getAbsolutePath());
                    this.f30805r = decodeFile;
                    ImageLoader.getInstance().putImageToCache(new BitmapDrawable(decodeFile), this.f30804n.location.volume_id + "_" + this.f30804n.location.local_id + "@50_50", true);
                } catch (Throwable unused) {
                }
            }
            bitmap.recycle();
            if (this.h != null) {
                UserConfig.getInstance(i10).saveConfig(false);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(FileLoader.getDirectory(4));
                sb2.append("/");
                sb2.append(this.h.location.volume_id);
                sb2.append("_");
                this.v = a4.a.n(this.h.location.local_id, ".jpg", sb2);
                if (this.K) {
                    if (messageObject != null && messageObject.videoEditedInfo != null) {
                        if (this.I && !MessagesController.getInstance(i10).uploadMarkupVideo) {
                            t40 t40Var = this.f30800b;
                            if (t40Var != null) {
                                t40Var.L(z10, true);
                            }
                            t40 t40Var2 = this.f30800b;
                            if (t40Var2 != null) {
                                t40Var2.Q(null, null, 0.0d, null, this.h, this.f30804n, this.f30806s, null);
                                this.f30800b.Q(null, null, this.P, this.f30808x, this.h, this.f30804n, this.f30806s, this.O);
                                d();
                                return;
                            }
                            return;
                        }
                        this.f30809y = messageObject;
                        VideoEditedInfo videoEditedInfo = messageObject.videoEditedInfo;
                        long j3 = videoEditedInfo.startTime;
                        if (j3 < 0) {
                            j3 = 0;
                        }
                        this.P = (videoEditedInfo.avatarStartTime - j3) / 1000000.0d;
                        videoEditedInfo.shouldLimitFps = false;
                        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingStarted);
                        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingFailed);
                        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileNewChunkAvailable);
                        MediaController.getInstance().scheduleVideoConvert(messageObject, true, true, false);
                        this.v = null;
                        t40 t40Var3 = this.f30800b;
                        if (t40Var3 != null) {
                            t40Var3.L(z10, true);
                        }
                        this.f30806s = true;
                    } else {
                        t40 t40Var4 = this.f30800b;
                        if (t40Var4 != null) {
                            t40Var4.L(z10, false);
                        }
                        this.f30806s = false;
                    }
                    NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
                    NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploadProgressChanged);
                    NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploadFailed);
                    if (this.v != null) {
                        FileLoader.getInstance(i10).uploadFile(this.v, false, true, 16777216);
                    }
                }
                t40 t40Var5 = this.f30800b;
                if (t40Var5 != null) {
                    t40Var5.Q(null, null, 0.0d, null, this.h, this.f30804n, this.f30806s, null);
                }
            }
        }
    }

    public final void t(MediaController.PhotoEntry photoEntry) {
        Bitmap loadBitmap;
        String str = photoEntry.imagePath;
        if (str == null) {
            str = photoEntry.path;
        }
        MessageObject messageObject = null;
        if ((photoEntry.isVideo || photoEntry.editedInfo != null) && !photoEntry.isLivePhoto()) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f19890id = 0;
            tL_message.message = "";
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.action = new TLRPC.TL_messageActionEmpty();
            tL_message.dialog_id = 0L;
            MessageObject messageObject2 = new MessageObject(UserConfig.selectedAccount, tL_message, false, false);
            TLRPC.Message message = messageObject2.messageOwner;
            File directory = FileLoader.getDirectory(4);
            message.attachPath = new File(directory, SharedConfig.getLastLocalId() + "_avatar.mp4").getAbsolutePath();
            messageObject2.videoEditedInfo = photoEntry.editedInfo;
            messageObject2.emojiMarkup = photoEntry.emojiMarkup;
            loadBitmap = ImageLoader.loadBitmap(photoEntry.thumbPath, null, 800.0f, 800.0f, true);
            messageObject = messageObject2;
        } else {
            loadBitmap = ImageLoader.loadBitmap(str, null, 800.0f, 800.0f, true);
        }
        s(false, loadBitmap, messageObject);
    }
}
