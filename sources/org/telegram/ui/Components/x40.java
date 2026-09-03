package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Dialog;
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
public final class x40 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.yp0 {
    public String B;
    public boolean C;
    public boolean E;
    public final boolean F;
    public TLRPC.User I;
    public TLRPC.InputFile J;
    public TLRPC.InputFile K;
    public TLRPC.VideoSize L;
    public double M;
    public final boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public final int S;
    public float T;
    public org.telegram.ui.ActionBar.p2 f30466a;
    public w40 f30467b;
    public li f30468c;
    public String f30469f;
    public TLRPC.PhotoSize h;
    public TLRPC.PhotoSize f30470n;
    public Bitmap f30471r;
    public boolean f30472s;
    public String v;
    public String f30473w;
    public String f30474x;
    public MessageObject f30475y;
    public final int d = UserConfig.selectedAccount;
    public boolean D = true;
    public boolean G = true;
    public boolean H = true;
    public final ImageReceiver e = new ImageReceiver(null);

    public x40(int i10, boolean z4, boolean z10) {
        this.N = z4;
        this.F = z10;
        this.S = i10;
    }

    public static void a(x40 x40Var, ArrayList arrayList, Runnable runnable, int i10) {
        org.telegram.ui.ActionBar.p2 p2Var;
        int intValue = ((Integer) arrayList.get(i10)).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue == 4 && (p2Var = x40Var.f30466a) != null && p2Var.getParentActivity() != null) {
                            try {
                                int i11 = Build.VERSION.SDK_INT;
                                if (i11 >= 23 && x40Var.f30466a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                    x40Var.f30466a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                                    return;
                                }
                                Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                                File generateVideoPath = AndroidUtilities.generateVideoPath();
                                if (generateVideoPath != null) {
                                    if (i11 >= 24) {
                                        Activity parentActivity = x40Var.f30466a.getParentActivity();
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
                                    x40Var.f30469f = generateVideoPath.getAbsolutePath();
                                }
                                x40Var.f30466a.startActivityForResult(intent, 15);
                                return;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        }
                        return;
                    }
                    runnable.run();
                    return;
                }
                x40Var.r();
                return;
            }
            x40Var.n();
            return;
        }
        x40Var.m();
    }

    public static void b(x40 x40Var, boolean z4, ArrayList arrayList) {
        MessageObject messageObject;
        Bitmap loadBitmap;
        ImageReceiver imageReceiver = x40Var.e;
        int i10 = x40Var.d;
        if (!arrayList.isEmpty()) {
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList.get(0);
            Bitmap bitmap = null;
            if ((sendingMediaInfo.isVideo || sendingMediaInfo.videoEditedInfo != null) && !sendingMediaInfo.isLivePhoto) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f19180id = 0;
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
                                x40Var.B = pathToAttach.getAbsolutePath();
                                if (!pathToAttach.exists()) {
                                    pathToAttach = FileLoader.getInstance(i10).getPathToAttach(closestPhotoSizeWithSize, false);
                                    if (!pathToAttach.exists()) {
                                        pathToAttach = null;
                                    }
                                }
                                if (pathToAttach != null) {
                                    loadBitmap = ImageLoader.loadBitmap(pathToAttach.getAbsolutePath(), null, 800.0f, 800.0f, true);
                                } else {
                                    NotificationCenter.getInstance(i10).addObserver(x40Var, NotificationCenter.fileLoaded);
                                    NotificationCenter.getInstance(i10).addObserver(x40Var, NotificationCenter.fileLoadFailed);
                                    x40Var.v = FileLoader.getAttachFileName(closestPhotoSizeWithSize.location);
                                    imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, sendingMediaInfo.searchImage.photo), null, null, "jpg", null, 1);
                                }
                            }
                            loadBitmap = null;
                        } else if (searchImage.imageUrl != null) {
                            File file = new File(FileLoader.getDirectory(4), Utilities.MD5(sendingMediaInfo.searchImage.imageUrl) + "." + ImageLoader.getHttpUrlExtension(sendingMediaInfo.searchImage.imageUrl, "jpg"));
                            x40Var.B = file.getAbsolutePath();
                            if (file.exists() && file.length() != 0) {
                                loadBitmap = ImageLoader.loadBitmap(file.getAbsolutePath(), null, 800.0f, 800.0f, true);
                            } else {
                                x40Var.v = sendingMediaInfo.searchImage.imageUrl;
                                NotificationCenter.getInstance(i10).addObserver(x40Var, NotificationCenter.httpFileDidLoad);
                                NotificationCenter.getInstance(i10).addObserver(x40Var, NotificationCenter.httpFileDidFailedLoad);
                                imageReceiver.setImage(sendingMediaInfo.searchImage.imageUrl, null, null, "jpg", 1L);
                            }
                        }
                    }
                    messageObject = null;
                }
                messageObject = null;
                bitmap = loadBitmap;
            }
            x40Var.s(z4, bitmap, messageObject);
        }
    }

    public final void c() {
        this.Q = true;
        String str = this.v;
        int i10 = this.d;
        if (str != null) {
            FileLoader.getInstance(i10).cancelFileUpload(this.v, false);
        }
        if (this.f30473w != null) {
            FileLoader.getInstance(i10).cancelFileUpload(this.f30473w, false);
        }
        w40 w40Var = this.f30467b;
        if (w40Var != null) {
            w40Var.P();
        }
    }

    public final void d() {
        this.v = null;
        this.f30473w = null;
        this.f30474x = null;
        this.f30475y = null;
        if (this.C) {
            this.e.setImageBitmap((Drawable) null);
            this.f30466a = null;
            this.f30467b = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        w40 w40Var;
        org.telegram.ui.ActionBar.p2 p2Var;
        String str;
        int i12 = NotificationCenter.fileUploaded;
        int i13 = this.d;
        if (i10 != i12 && i10 != NotificationCenter.fileUploadFailed) {
            if (i10 == NotificationCenter.fileUploadProgressChanged) {
                String str2 = (String) objArr[0];
                if (this.f30475y != null) {
                    str = this.f30473w;
                } else {
                    str = this.v;
                }
                if (this.f30467b != null && str2.equals(str)) {
                    float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
                    w40 w40Var2 = this.f30467b;
                    this.T = min;
                    w40Var2.D(min);
                    return;
                }
                return;
            }
            int i14 = NotificationCenter.fileLoaded;
            if (i10 != i14 && i10 != NotificationCenter.fileLoadFailed && i10 != NotificationCenter.httpFileDidLoad && i10 != NotificationCenter.httpFileDidFailedLoad) {
                int i15 = NotificationCenter.filePreparingFailed;
                if (i10 == i15) {
                    if (((MessageObject) objArr[0]) == this.f30475y && this.f30466a != null) {
                        NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.filePreparingStarted);
                        NotificationCenter.getInstance(i13).removeObserver(this, i15);
                        NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
                        d();
                        return;
                    }
                    return;
                } else if (i10 == NotificationCenter.fileNewChunkAvailable) {
                    if (((MessageObject) objArr[0]) == this.f30475y && this.f30466a != null) {
                        String str3 = (String) objArr[1];
                        long longValue = ((Long) objArr[2]).longValue();
                        long longValue2 = ((Long) objArr[3]).longValue();
                        this.f30466a.getFileLoader().checkUploadNewDataAvailable(str3, false, longValue, longValue2);
                        if (longValue2 != 0) {
                            double longValue3 = ((Long) objArr[5]).longValue() / 1000000.0d;
                            if (this.M > longValue3) {
                                this.M = longValue3;
                            }
                            Bitmap createVideoThumbnailAtTime = SendMessagesHelper.createVideoThumbnailAtTime(str3, (long) (this.M * 1000.0d), null, true);
                            if (createVideoThumbnailAtTime != null) {
                                File pathToAttach = FileLoader.getInstance(i13).getPathToAttach(this.f30470n, true);
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
                                this.f30470n = scaleAndSaveImage;
                                if (scaleAndSaveImage != null) {
                                    try {
                                        Bitmap decodeFile = BitmapFactory.decodeFile(FileLoader.getInstance(i13).getPathToAttach(this.f30470n, true).getAbsolutePath());
                                        ImageLoader.getInstance().putImageToCache(new BitmapDrawable(decodeFile), this.f30470n.location.volume_id + "_" + this.f30470n.location.local_id + "@50_50", true);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.filePreparingStarted);
                            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.filePreparingFailed);
                            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
                            this.f30474x = str3;
                            this.f30473w = str3;
                            this.f30475y = null;
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == NotificationCenter.filePreparingStarted && ((MessageObject) objArr[0]) == this.f30475y && (p2Var = this.f30466a) != null) {
                    this.f30473w = (String) objArr[1];
                    p2Var.getFileLoader().uploadFile(this.f30473w, false, false, (int) this.f30475y.videoEditedInfo.estimatedSize, 33554432, false);
                    return;
                } else {
                    return;
                }
            }
            this.T = 1.0f;
            if (((String) objArr[0]).equals(this.v)) {
                NotificationCenter.getInstance(i13).removeObserver(this, i14);
                NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileLoadFailed);
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i13);
                int i16 = NotificationCenter.httpFileDidLoad;
                notificationCenter.removeObserver(this, i16);
                NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.httpFileDidFailedLoad);
                this.v = null;
                if (i10 != i14 && i10 != i16) {
                    this.e.setImageBitmap((Drawable) null);
                    w40 w40Var3 = this.f30467b;
                    if (w40Var3 != null) {
                        w40Var3.P();
                        return;
                    }
                    return;
                }
                s(false, ImageLoader.loadBitmap(this.B, null, 800.0f, 800.0f, true), null);
                return;
            }
            return;
        }
        String str4 = (String) objArr[0];
        if (str4.equals(this.v)) {
            this.v = null;
            if (i10 == i12) {
                this.J = (TLRPC.InputFile) objArr[1];
            }
        } else if (str4.equals(this.f30473w)) {
            this.f30473w = null;
            if (i10 == i12) {
                this.K = (TLRPC.InputFile) objArr[1];
            }
        } else {
            return;
        }
        if (this.v == null && this.f30473w == null && this.f30475y == null) {
            NotificationCenter.getInstance(i13).removeObserver(this, i12);
            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileUploadFailed);
            if (i10 == i12 && (w40Var = this.f30467b) != null) {
                w40Var.Q(this.J, this.K, this.M, this.f30474x, this.h, this.f30470n, this.f30472s, this.L);
            }
            d();
        }
    }

    public final void e() {
        this.Q = false;
        if (this.v == null && this.f30473w == null && this.f30475y == null) {
            this.f30466a = null;
            this.f30467b = null;
        } else {
            this.C = true;
        }
        li liVar = this.f30468c;
        if (liVar != null) {
            liVar.dismissInternal();
            this.f30468c.v1();
        }
    }

    public final void f() {
        int i10;
        lt ltVar;
        boolean z4;
        org.telegram.ui.ActionBar.p2 p2Var = this.f30466a;
        if (p2Var != null && p2Var.getParentActivity() != null) {
            if (this.f30468c == null) {
                li liVar = new li(this.f30466a.getParentActivity(), this.f30466a, this.O, this.P);
                this.f30468c = liVar;
                if (this.N) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                w40 w40Var = this.f30467b;
                if (w40Var != null && w40Var.u()) {
                    w40 w40Var2 = this.f30467b;
                    Objects.requireNonNull(w40Var2);
                    ltVar = new lt(w40Var2, 1);
                } else {
                    ltVar = null;
                }
                liVar.N0 = i10;
                liVar.O0 = ltVar;
                liVar.P0 = false;
                di diVar = liVar.f26744v0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = liVar.f26698g0;
                if (diVar == null || diVar == chatAttachAlertPhotoLayout) {
                    liVar.f26742u1.setVisibility(8);
                }
                int i11 = liVar.N0;
                TextView textView = liVar.f26699g1;
                if (i11 == 2) {
                    textView.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
                } else {
                    textView.setText(LocaleController.getString(R.string.ChoosePhoto));
                }
                if (chatAttachAlertPhotoLayout != null) {
                    li liVar2 = chatAttachAlertPhotoLayout.f24282b;
                    if (liVar2.N0 != 0 && !liVar2.C) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    chatAttachAlertPhotoLayout.f22879d1 = z4;
                }
                li liVar3 = this.f30468c;
                liVar3.W1 = new s40(this);
                liVar3.R = this;
            }
            int i12 = this.R;
            if (i12 == 1) {
                this.f30468c.f26699g1.setText(LocaleController.formatString("SetPhotoFor", R.string.SetPhotoFor, this.I.first_name));
            } else if (i12 == 2) {
                this.f30468c.f26699g1.setText(LocaleController.formatString("SuggestPhotoFor", R.string.SuggestPhotoFor, this.I.first_name));
            }
        }
    }

    public final boolean g(Dialog dialog) {
        li liVar = this.f30468c;
        if (liVar == null || dialog != liVar) {
            return false;
        }
        liVar.f26698g0.a0(false);
        this.f30468c.dismissInternal();
        this.f30468c.f26698g0.d0(true);
        return true;
    }

    public final boolean h() {
        if (this.v == null && this.f30473w == null && this.f30475y == null) {
            return false;
        }
        return true;
    }

    public final void i(int i10, int i11, Intent intent) {
        if (i11 == -1) {
            if (i10 != 0 && i10 != 2) {
                if (i10 == 13) {
                    this.f30466a.getParentActivity().overridePendingTransition(R.anim.alpha_in, R.anim.alpha_out);
                    PhotoViewer.t1().K2(null, this.f30466a, null);
                    p(this.f30469f, null, AndroidUtilities.getImageOrientation(this.f30469f), false);
                    AndroidUtilities.addMediaToGallery(this.f30469f);
                    this.f30469f = null;
                    return;
                } else if (i10 == 14) {
                    if (intent != null && intent.getData() != null) {
                        AndroidUtilities.runOnUIThread(new em(23, this, intent.getData()));
                        return;
                    }
                    return;
                } else if (i10 == 15) {
                    q(this.f30469f, null, true);
                    AndroidUtilities.addMediaToGallery(this.f30469f);
                    this.f30469f = null;
                    return;
                } else {
                    return;
                }
            }
            f();
            li liVar = this.f30468c;
            if (liVar != null) {
                liVar.f26698g0.g0(i10, intent, this.f30469f);
            }
            this.f30469f = null;
        }
    }

    public final void j() {
        li liVar = this.f30468c;
        if (liVar != null) {
            liVar.x1();
        }
    }

    public final void k(int i10, String[] strArr, int[] iArr) {
        li liVar = this.f30468c;
        if (liVar != null) {
            if (i10 == 17) {
                liVar.f26698g0.U(false);
                this.f30468c.f26698g0.Y();
            } else if (i10 == 4) {
                liVar.f26698g0.Y();
            }
        }
    }

    public final void l() {
        li liVar = this.f30468c;
        if (liVar != null) {
            liVar.y1();
        }
    }

    public final void m() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f30466a;
        if (p2Var != null && p2Var.getParentActivity() != null) {
            try {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 23 && this.f30466a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    this.f30466a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                    return;
                }
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File generatePicturePath = AndroidUtilities.generatePicturePath();
                if (generatePicturePath != null) {
                    if (i10 >= 24) {
                        Activity parentActivity = this.f30466a.getParentActivity();
                        intent.putExtra("output", FileProvider.d(parentActivity, ApplicationLoader.getApplicationId() + ".provider", generatePicturePath));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(generatePicturePath));
                    }
                    this.f30469f = generatePicturePath.getAbsolutePath();
                }
                this.f30466a.startActivityForResult(intent, 13);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void n() {
        int i10;
        org.telegram.ui.ActionBar.p2 p2Var = this.f30466a;
        if (p2Var == null) {
            return;
        }
        Activity parentActivity = p2Var.getParentActivity();
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
        if (this.N) {
            i10 = 3;
        } else {
            i10 = 1;
        }
        org.telegram.ui.wp0 wp0Var = new org.telegram.ui.wp0(i10, false, false, null);
        wp0Var.f39755x = this.G;
        wp0Var.S = new t40(this);
        this.f30466a.presentFragment(wp0Var);
    }

    public final void o(boolean z4, final Runnable runnable, DialogInterface.OnDismissListener onDismissListener, int i10) {
        org.telegram.ui.ActionBar.p2 p2Var = this.f30466a;
        if (p2Var != null && p2Var.getParentActivity() != null) {
            this.Q = false;
            this.R = i10;
            if (this.D) {
                org.telegram.ui.ActionBar.p2 p2Var2 = this.f30466a;
                if (p2Var2 != null && p2Var2.getParentActivity() != null) {
                    f();
                    li liVar = this.f30468c;
                    liVar.R1 = this.E;
                    liVar.J1(1, false);
                    this.f30468c.f26698g0.f0();
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 == 21 || i11 == 22) {
                        AndroidUtilities.hideKeyboard(this.f30466a.getFragmentView().findFocus());
                    }
                    this.f30468c.r1();
                    this.f30468c.setOnHideListener(onDismissListener);
                    int i12 = this.R;
                    if (i12 != 0) {
                        this.f30468c.N = new v40(i12, this.I);
                    }
                    li liVar2 = this.f30468c;
                    liVar2.getClass();
                    this.f30466a.showDialog(liVar2);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(this.f30466a.getParentActivity(), null, false, false);
            g3Var.fixNavigationBar();
            if (i10 == 1) {
                g3Var.title = LocaleController.formatString("SetPhotoFor", R.string.SetPhotoFor, this.I.first_name);
                g3Var.bigTitle = true;
            } else if (i10 == 2) {
                g3Var.title = LocaleController.formatString("SuggestPhotoFor", R.string.SuggestPhotoFor, this.I.first_name);
                g3Var.bigTitle = true;
            } else {
                g3Var.title = LocaleController.getString(R.string.ChoosePhoto);
                g3Var.bigTitle = true;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            final ArrayList arrayList3 = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.ChooseTakePhoto));
            org.telegram.ui.b.h(R.drawable.msg_camera, 0, arrayList2, arrayList3);
            if (this.N) {
                arrayList.add(LocaleController.getString(R.string.ChooseRecordVideo));
                org.telegram.ui.b.h(R.drawable.msg_video, 4, arrayList2, arrayList3);
            }
            arrayList.add(LocaleController.getString(R.string.ChooseFromGallery));
            org.telegram.ui.b.h(R.drawable.msg_photos, 1, arrayList2, arrayList3);
            if (this.G) {
                arrayList.add(LocaleController.getString(R.string.ChooseFromSearch));
                org.telegram.ui.b.h(R.drawable.msg_search, 2, arrayList2, arrayList3);
            }
            if (z4) {
                arrayList.add(LocaleController.getString(R.string.DeletePhoto));
                org.telegram.ui.b.h(R.drawable.msg_delete, 3, arrayList2, arrayList3);
            }
            int[] iArr = new int[arrayList2.size()];
            int size = arrayList2.size();
            for (int i13 = 0; i13 < size; i13++) {
                iArr[i13] = ((Integer) arrayList2.get(i13)).intValue();
            }
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i14) {
                    x40.a(x40.this, arrayList3, runnable, i14);
                }
            };
            g3Var.items = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
            g3Var.itemIcons = iArr;
            g3Var.onClickListener = onClickListener;
            g3Var.setOnHideListener(onDismissListener);
            this.f30466a.showDialog(g3Var);
            if (z4) {
                g3Var.setItemColor(arrayList.size() - 1, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20097p7, false));
            }
        }
    }

    public final void p(String str, String str2, Pair pair, boolean z4) {
        ArrayList arrayList = new ArrayList();
        MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, 0, 0L, str, ((Integer) pair.first).intValue(), false, 0, 0, 0L).setOrientation(pair);
        orientation.isVideo = z4;
        orientation.thumbPath = str2;
        arrayList.add(orientation);
        PhotoViewer.t1().K2(null, this.f30466a, null);
        PhotoViewer.t1().f2(arrayList, 0, 1, false, new u40(this, arrayList), null);
        PhotoViewer.t1().M = true;
    }

    public final void q(String str, String str2, boolean z4) {
        p(str, str2, new Pair(0, 0), z4);
    }

    public final void r() {
        if (this.f30466a == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.mq0 mq0Var = new org.telegram.ui.mq0(0, null, hashMap, arrayList, 1, false, null, this.O);
        mq0Var.f36180p0 = new r40(this, hashMap, arrayList);
        mq0Var.f0(1, false);
        mq0Var.m0 = this.f30467b.getInitialSearchString();
        if (this.P) {
            this.f30466a.showAsSheet(mq0Var);
        } else {
            this.f30466a.presentFragment(mq0Var);
        }
    }

    public final void s(boolean z4, Bitmap bitmap, MessageObject messageObject) {
        TLRPC.VideoSize videoSize;
        if (bitmap != null) {
            this.K = null;
            this.J = null;
            this.f30475y = null;
            this.f30474x = null;
            if (messageObject == null) {
                videoSize = null;
            } else {
                videoSize = messageObject.emojiMarkup;
            }
            this.L = videoSize;
            this.h = ImageLoader.scaleAndSaveImage(bitmap, 800.0f, 800.0f, 80, false, 320, 320);
            TLRPC.PhotoSize scaleAndSaveImage = ImageLoader.scaleAndSaveImage(bitmap, 150.0f, 150.0f, 80, false, 150, 150);
            this.f30470n = scaleAndSaveImage;
            int i10 = this.d;
            if (scaleAndSaveImage != null) {
                try {
                    Bitmap decodeFile = BitmapFactory.decodeFile(FileLoader.getInstance(i10).getPathToAttach(this.f30470n, true).getAbsolutePath());
                    this.f30471r = decodeFile;
                    ImageLoader.getInstance().putImageToCache(new BitmapDrawable(decodeFile), this.f30470n.location.volume_id + "_" + this.f30470n.location.local_id + "@50_50", true);
                } catch (Throwable unused) {
                }
            }
            bitmap.recycle();
            if (this.h != null) {
                UserConfig.getInstance(i10).saveConfig(false);
                StringBuilder sb = new StringBuilder();
                sb.append(FileLoader.getDirectory(4));
                sb.append("/");
                sb.append(this.h.location.volume_id);
                sb.append("_");
                this.v = android.support.v4.media.a.m(this.h.location.local_id, ".jpg", sb);
                if (this.H) {
                    if (messageObject != null && messageObject.videoEditedInfo != null) {
                        if (this.F && !MessagesController.getInstance(i10).uploadMarkupVideo) {
                            w40 w40Var = this.f30467b;
                            if (w40Var != null) {
                                w40Var.K(z4, true);
                            }
                            w40 w40Var2 = this.f30467b;
                            if (w40Var2 != null) {
                                w40Var2.Q(null, null, 0.0d, null, this.h, this.f30470n, this.f30472s, null);
                                this.f30467b.Q(null, null, this.M, this.f30474x, this.h, this.f30470n, this.f30472s, this.L);
                                d();
                                return;
                            }
                            return;
                        }
                        this.f30475y = messageObject;
                        VideoEditedInfo videoEditedInfo = messageObject.videoEditedInfo;
                        long j10 = videoEditedInfo.startTime;
                        if (j10 < 0) {
                            j10 = 0;
                        }
                        this.M = (videoEditedInfo.avatarStartTime - j10) / 1000000.0d;
                        videoEditedInfo.shouldLimitFps = false;
                        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingStarted);
                        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingFailed);
                        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileNewChunkAvailable);
                        MediaController.getInstance().scheduleVideoConvert(messageObject, true, true, false);
                        this.v = null;
                        w40 w40Var3 = this.f30467b;
                        if (w40Var3 != null) {
                            w40Var3.K(z4, true);
                        }
                        this.f30472s = true;
                    } else {
                        w40 w40Var4 = this.f30467b;
                        if (w40Var4 != null) {
                            w40Var4.K(z4, false);
                        }
                        this.f30472s = false;
                    }
                    NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
                    NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploadProgressChanged);
                    NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploadFailed);
                    if (this.v != null) {
                        FileLoader.getInstance(i10).uploadFile(this.v, false, true, 16777216);
                    }
                }
                w40 w40Var5 = this.f30467b;
                if (w40Var5 != null) {
                    w40Var5.Q(null, null, 0.0d, null, this.h, this.f30470n, this.f30472s, null);
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
            tL_message.f19180id = 0;
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
