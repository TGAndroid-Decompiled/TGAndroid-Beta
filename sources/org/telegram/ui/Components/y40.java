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
public final class y40 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.hq0 {
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
    public org.telegram.ui.ActionBar.n2 f33170a;
    public x40 f33171b;
    public xi f33172c;
    public String f33174f;
    public TLRPC.PhotoSize h;
    public TLRPC.PhotoSize f33175n;
    public Bitmap f33176r;
    public boolean f33177s;
    public String v;
    public String f33178w;
    public String f33179x;
    public MessageObject f33180y;
    public final int d = UserConfig.selectedAccount;
    public boolean G = true;
    public boolean J = true;
    public boolean K = true;
    public final ImageReceiver f33173e = new ImageReceiver(null);

    public y40(int i10, boolean z10, boolean z11) {
        this.Q = z10;
        this.I = z11;
        this.V = i10;
    }

    public static void a(y40 y40Var, ArrayList arrayList, Runnable runnable, int i10) {
        org.telegram.ui.ActionBar.n2 n2Var;
        int intValue = ((Integer) arrayList.get(i10)).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue == 4 && (n2Var = y40Var.f33170a) != null && n2Var.getParentActivity() != null) {
                            try {
                                int i11 = Build.VERSION.SDK_INT;
                                if (i11 >= 23 && y40Var.f33170a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                    y40Var.f33170a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                                    return;
                                }
                                Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                                File generateVideoPath = AndroidUtilities.generateVideoPath();
                                if (generateVideoPath != null) {
                                    if (i11 >= 24) {
                                        Activity parentActivity = y40Var.f33170a.getParentActivity();
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
                                    y40Var.f33174f = generateVideoPath.getAbsolutePath();
                                }
                                y40Var.f33170a.startActivityForResult(intent, 15);
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
                y40Var.r();
                return;
            }
            y40Var.n();
            return;
        }
        y40Var.m();
    }

    public static void b(y40 y40Var, boolean z10, ArrayList arrayList) {
        MessageObject messageObject;
        Bitmap loadBitmap;
        ImageReceiver imageReceiver = y40Var.f33173e;
        int i10 = y40Var.d;
        if (!arrayList.isEmpty()) {
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList.get(0);
            Bitmap bitmap = null;
            if ((sendingMediaInfo.isVideo || sendingMediaInfo.videoEditedInfo != null) && !sendingMediaInfo.isLivePhoto) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f20068id = 0;
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
                                y40Var.E = pathToAttach.getAbsolutePath();
                                if (!pathToAttach.exists()) {
                                    pathToAttach = FileLoader.getInstance(i10).getPathToAttach(closestPhotoSizeWithSize, false);
                                    if (!pathToAttach.exists()) {
                                        pathToAttach = null;
                                    }
                                }
                                if (pathToAttach != null) {
                                    loadBitmap = ImageLoader.loadBitmap(pathToAttach.getAbsolutePath(), null, 800.0f, 800.0f, true);
                                } else {
                                    NotificationCenter.getInstance(i10).addObserver(y40Var, NotificationCenter.fileLoaded);
                                    NotificationCenter.getInstance(i10).addObserver(y40Var, NotificationCenter.fileLoadFailed);
                                    y40Var.v = FileLoader.getAttachFileName(closestPhotoSizeWithSize.location);
                                    imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, sendingMediaInfo.searchImage.photo), null, null, "jpg", null, 1);
                                }
                            }
                            loadBitmap = null;
                        } else if (searchImage.imageUrl != null) {
                            File file = new File(FileLoader.getDirectory(4), Utilities.MD5(sendingMediaInfo.searchImage.imageUrl) + "." + ImageLoader.getHttpUrlExtension(sendingMediaInfo.searchImage.imageUrl, "jpg"));
                            y40Var.E = file.getAbsolutePath();
                            if (file.exists() && file.length() != 0) {
                                loadBitmap = ImageLoader.loadBitmap(file.getAbsolutePath(), null, 800.0f, 800.0f, true);
                            } else {
                                y40Var.v = sendingMediaInfo.searchImage.imageUrl;
                                NotificationCenter.getInstance(i10).addObserver(y40Var, NotificationCenter.httpFileDidLoad);
                                NotificationCenter.getInstance(i10).addObserver(y40Var, NotificationCenter.httpFileDidFailedLoad);
                                imageReceiver.setImage(sendingMediaInfo.searchImage.imageUrl, null, null, "jpg", 1L);
                            }
                        }
                    }
                    messageObject = null;
                }
                messageObject = null;
                bitmap = loadBitmap;
            }
            y40Var.s(z10, bitmap, messageObject);
        }
    }

    public final void c() {
        this.T = true;
        String str = this.v;
        int i10 = this.d;
        if (str != null) {
            FileLoader.getInstance(i10).cancelFileUpload(this.v, false);
        }
        if (this.f33178w != null) {
            FileLoader.getInstance(i10).cancelFileUpload(this.f33178w, false);
        }
        x40 x40Var = this.f33171b;
        if (x40Var != null) {
            x40Var.N();
        }
    }

    public final void d() {
        this.v = null;
        this.f33178w = null;
        this.f33179x = null;
        this.f33180y = null;
        if (this.F) {
            this.f33173e.setImageBitmap((Drawable) null);
            this.f33170a = null;
            this.f33171b = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        x40 x40Var;
        org.telegram.ui.ActionBar.n2 n2Var;
        String str;
        int i12 = NotificationCenter.fileUploaded;
        int i13 = this.d;
        if (i10 != i12 && i10 != NotificationCenter.fileUploadFailed) {
            if (i10 == NotificationCenter.fileUploadProgressChanged) {
                String str2 = (String) objArr[0];
                if (this.f33180y != null) {
                    str = this.f33178w;
                } else {
                    str = this.v;
                }
                if (this.f33171b != null && str2.equals(str)) {
                    float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
                    x40 x40Var2 = this.f33171b;
                    this.W = min;
                    x40Var2.B(min);
                    return;
                }
                return;
            }
            int i14 = NotificationCenter.fileLoaded;
            if (i10 != i14 && i10 != NotificationCenter.fileLoadFailed && i10 != NotificationCenter.httpFileDidLoad && i10 != NotificationCenter.httpFileDidFailedLoad) {
                int i15 = NotificationCenter.filePreparingFailed;
                if (i10 == i15) {
                    if (((MessageObject) objArr[0]) == this.f33180y && this.f33170a != null) {
                        NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.filePreparingStarted);
                        NotificationCenter.getInstance(i13).removeObserver(this, i15);
                        NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
                        d();
                        return;
                    }
                    return;
                } else if (i10 == NotificationCenter.fileNewChunkAvailable) {
                    if (((MessageObject) objArr[0]) == this.f33180y && this.f33170a != null) {
                        String str3 = (String) objArr[1];
                        long longValue = ((Long) objArr[2]).longValue();
                        long longValue2 = ((Long) objArr[3]).longValue();
                        this.f33170a.getFileLoader().checkUploadNewDataAvailable(str3, false, longValue, longValue2);
                        if (longValue2 != 0) {
                            double longValue3 = ((Long) objArr[5]).longValue() / 1000000.0d;
                            if (this.P > longValue3) {
                                this.P = longValue3;
                            }
                            Bitmap createVideoThumbnailAtTime = SendMessagesHelper.createVideoThumbnailAtTime(str3, (long) (this.P * 1000.0d), null, true);
                            if (createVideoThumbnailAtTime != null) {
                                File pathToAttach = FileLoader.getInstance(i13).getPathToAttach(this.f33175n, true);
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
                                this.f33175n = scaleAndSaveImage;
                                if (scaleAndSaveImage != null) {
                                    try {
                                        Bitmap decodeFile = BitmapFactory.decodeFile(FileLoader.getInstance(i13).getPathToAttach(this.f33175n, true).getAbsolutePath());
                                        ImageLoader.getInstance().putImageToCache(new BitmapDrawable(decodeFile), this.f33175n.location.volume_id + "_" + this.f33175n.location.local_id + "@50_50", true);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.filePreparingStarted);
                            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.filePreparingFailed);
                            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
                            this.f33179x = str3;
                            this.f33178w = str3;
                            this.f33180y = null;
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == NotificationCenter.filePreparingStarted && ((MessageObject) objArr[0]) == this.f33180y && (n2Var = this.f33170a) != null) {
                    this.f33178w = (String) objArr[1];
                    n2Var.getFileLoader().uploadFile(this.f33178w, false, false, (int) this.f33180y.videoEditedInfo.estimatedSize, 33554432, false);
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
                    this.f33173e.setImageBitmap((Drawable) null);
                    x40 x40Var3 = this.f33171b;
                    if (x40Var3 != null) {
                        x40Var3.N();
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
        } else if (str4.equals(this.f33178w)) {
            this.f33178w = null;
            if (i10 == i12) {
                this.N = (TLRPC.InputFile) objArr[1];
            }
        } else {
            return;
        }
        if (this.v == null && this.f33178w == null && this.f33180y == null) {
            NotificationCenter.getInstance(i13).removeObserver(this, i12);
            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileUploadFailed);
            if (i10 == i12 && (x40Var = this.f33171b) != null) {
                x40Var.O(this.M, this.N, this.P, this.f33179x, this.h, this.f33175n, this.f33177s, this.O);
            }
            d();
        }
    }

    public final void e() {
        this.T = false;
        if (this.v == null && this.f33178w == null && this.f33180y == null) {
            this.f33170a = null;
            this.f33171b = null;
        } else {
            this.F = true;
        }
        xi xiVar = this.f33172c;
        if (xiVar != null) {
            xiVar.dismissInternal();
            this.f33172c.u1();
        }
    }

    public final void f() {
        int i10;
        tt ttVar;
        boolean z10;
        org.telegram.ui.ActionBar.n2 n2Var = this.f33170a;
        if (n2Var != null && n2Var.getParentActivity() != null) {
            if (this.f33172c == null) {
                xi xiVar = new xi(this.f33170a.getParentActivity(), this.f33170a, this.R, this.S);
                this.f33172c = xiVar;
                if (this.Q) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                x40 x40Var = this.f33171b;
                if (x40Var != null && x40Var.t()) {
                    x40 x40Var2 = this.f33171b;
                    Objects.requireNonNull(x40Var2);
                    ttVar = new tt(x40Var2, 1);
                } else {
                    ttVar = null;
                }
                xiVar.Q0 = i10;
                xiVar.R0 = ttVar;
                xiVar.S0 = false;
                pi piVar = xiVar.f32971y0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = xiVar.f32922j0;
                if (piVar == null || piVar == chatAttachAlertPhotoLayout) {
                    xiVar.f32968x1.setVisibility(8);
                }
                int i11 = xiVar.Q0;
                TextView textView = xiVar.f32923j1;
                if (i11 == 2) {
                    textView.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
                } else {
                    textView.setText(LocaleController.getString(R.string.ChoosePhoto));
                }
                if (chatAttachAlertPhotoLayout != null) {
                    xi xiVar2 = chatAttachAlertPhotoLayout.f29741b;
                    if (xiVar2.Q0 != 0 && !xiVar2.F) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    chatAttachAlertPhotoLayout.f24043g1 = z10;
                }
                xi xiVar3 = this.f33172c;
                xiVar3.Z1 = new t40(this);
                xiVar3.U = this;
            }
            int i12 = this.U;
            if (i12 == 1) {
                this.f33172c.f32923j1.setText(LocaleController.formatString("SetPhotoFor", R.string.SetPhotoFor, this.L.first_name));
            } else if (i12 == 2) {
                this.f33172c.f32923j1.setText(LocaleController.formatString("SuggestPhotoFor", R.string.SuggestPhotoFor, this.L.first_name));
            }
        }
    }

    public final boolean g(Dialog dialog) {
        xi xiVar = this.f33172c;
        if (xiVar == null || dialog != xiVar) {
            return false;
        }
        xiVar.f32922j0.Z(false);
        this.f33172c.dismissInternal();
        this.f33172c.f32922j0.d0(true);
        return true;
    }

    public final boolean h() {
        if (this.v == null && this.f33178w == null && this.f33180y == null) {
            return false;
        }
        return true;
    }

    public final void i(int i10, int i11, Intent intent) {
        if (i11 == -1) {
            if (i10 != 0 && i10 != 2) {
                if (i10 == 13) {
                    this.f33170a.getParentActivity().overridePendingTransition(R.anim.alpha_in, R.anim.alpha_out);
                    PhotoViewer.t1().K2(null, this.f33170a, null);
                    p(this.f33174f, null, AndroidUtilities.getImageOrientation(this.f33174f), false);
                    AndroidUtilities.addMediaToGallery(this.f33174f);
                    this.f33174f = null;
                    return;
                } else if (i10 == 14) {
                    if (intent != null && intent.getData() != null) {
                        AndroidUtilities.runOnUIThread(new yw(10, this, intent.getData()));
                        return;
                    }
                    return;
                } else if (i10 == 15) {
                    q(this.f33174f, null, true);
                    AndroidUtilities.addMediaToGallery(this.f33174f);
                    this.f33174f = null;
                    return;
                } else {
                    return;
                }
            }
            f();
            xi xiVar = this.f33172c;
            if (xiVar != null) {
                xiVar.f32922j0.g0(i10, intent, this.f33174f);
            }
            this.f33174f = null;
        }
    }

    public final void j() {
        xi xiVar = this.f33172c;
        if (xiVar != null) {
            xiVar.w1();
        }
    }

    public final void k(int i10, String[] strArr, int[] iArr) {
        xi xiVar = this.f33172c;
        if (xiVar != null) {
            if (i10 == 17) {
                xiVar.f32922j0.S(false);
                this.f33172c.f32922j0.X();
            } else if (i10 == 4) {
                xiVar.f32922j0.X();
            }
        }
    }

    public final void l() {
        xi xiVar = this.f33172c;
        if (xiVar != null) {
            xiVar.x1();
        }
    }

    public final void m() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f33170a;
        if (n2Var != null && n2Var.getParentActivity() != null) {
            try {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 23 && this.f33170a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    this.f33170a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                    return;
                }
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File generatePicturePath = AndroidUtilities.generatePicturePath();
                if (generatePicturePath != null) {
                    if (i10 >= 24) {
                        Activity parentActivity = this.f33170a.getParentActivity();
                        intent.putExtra("output", FileProvider.d(parentActivity, ApplicationLoader.getApplicationId() + ".provider", generatePicturePath));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(generatePicturePath));
                    }
                    this.f33174f = generatePicturePath.getAbsolutePath();
                }
                this.f33170a.startActivityForResult(intent, 13);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    public final void n() {
        int i10;
        org.telegram.ui.ActionBar.n2 n2Var = this.f33170a;
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
        org.telegram.ui.fq0 fq0Var = new org.telegram.ui.fq0(i10, false, false, null);
        fq0Var.f36383x = this.J;
        fq0Var.V = new u40(this);
        this.f33170a.presentFragment(fq0Var);
    }

    public final void o(boolean z10, final Runnable runnable, DialogInterface.OnDismissListener onDismissListener, int i10) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f33170a;
        if (n2Var != null && n2Var.getParentActivity() != null) {
            this.T = false;
            this.U = i10;
            if (this.G) {
                org.telegram.ui.ActionBar.n2 n2Var2 = this.f33170a;
                if (n2Var2 != null && n2Var2.getParentActivity() != null) {
                    f();
                    xi xiVar = this.f33172c;
                    xiVar.U1 = this.H;
                    xiVar.I1(1, false);
                    this.f33172c.f32922j0.f0();
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 == 21 || i11 == 22) {
                        AndroidUtilities.hideKeyboard(this.f33170a.getFragmentView().findFocus());
                    }
                    this.f33172c.q1();
                    this.f33172c.setOnHideListener(onDismissListener);
                    int i12 = this.U;
                    if (i12 != 0) {
                        this.f33172c.Q = new w40(i12, this.L);
                    }
                    xi xiVar2 = this.f33172c;
                    xiVar2.getClass();
                    this.f33170a.showDialog(xiVar2);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) this.f33170a.getParentActivity(), (org.telegram.ui.ActionBar.d6) null, false);
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
            org.telegram.ui.Cells.c1.m(R.drawable.msg_camera, 0, arrayList2, arrayList3);
            if (this.Q) {
                arrayList.add(LocaleController.getString(R.string.ChooseRecordVideo));
                org.telegram.ui.Cells.c1.m(R.drawable.msg_video, 4, arrayList2, arrayList3);
            }
            arrayList.add(LocaleController.getString(R.string.ChooseFromGallery));
            org.telegram.ui.Cells.c1.m(R.drawable.msg_photos, 1, arrayList2, arrayList3);
            if (this.J) {
                arrayList.add(LocaleController.getString(R.string.ChooseFromSearch));
                org.telegram.ui.Cells.c1.m(R.drawable.msg_search, 2, arrayList2, arrayList3);
            }
            if (z10) {
                arrayList.add(LocaleController.getString(R.string.DeletePhoto));
                org.telegram.ui.Cells.c1.m(R.drawable.msg_delete, 3, arrayList2, arrayList3);
            }
            int[] iArr = new int[arrayList2.size()];
            int size = arrayList2.size();
            for (int i13 = 0; i13 < size; i13++) {
                iArr[i13] = ((Integer) arrayList2.get(i13)).intValue();
            }
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i14) {
                    y40.a(y40.this, arrayList3, runnable, i14);
                }
            };
            f3Var.items = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
            f3Var.itemIcons = iArr;
            f3Var.onClickListener = onClickListener;
            f3Var.setOnHideListener(onDismissListener);
            this.f33170a.showDialog(f3Var);
            if (z10) {
                f3Var.setItemColor(arrayList.size() - 1, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21068q7, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21049p7, false));
            }
        }
    }

    public final void p(String str, String str2, Pair pair, boolean z10) {
        ArrayList arrayList = new ArrayList();
        MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, 0, 0L, str, ((Integer) pair.first).intValue(), false, 0, 0, 0L).setOrientation(pair);
        orientation.isVideo = z10;
        orientation.thumbPath = str2;
        arrayList.add(orientation);
        PhotoViewer.t1().K2(null, this.f33170a, null);
        PhotoViewer.t1().g2(arrayList, 0, 1, false, new v40(this, arrayList), null);
        PhotoViewer.t1().P = true;
    }

    public final void q(String str, String str2, boolean z10) {
        p(str, str2, new Pair(0, 0), z10);
    }

    public final void r() {
        if (this.f33170a == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.wq0 wq0Var = new org.telegram.ui.wq0(0, null, hashMap, arrayList, 1, false, null, this.R);
        wq0Var.f42692s0 = new s40(this, hashMap, arrayList);
        wq0Var.f0(1, false);
        wq0Var.f42687p0 = this.f33171b.getInitialSearchString();
        if (this.S) {
            this.f33170a.showAsSheet(wq0Var);
        } else {
            this.f33170a.presentFragment(wq0Var);
        }
    }

    public final void s(boolean z10, Bitmap bitmap, MessageObject messageObject) {
        TLRPC.VideoSize videoSize;
        if (bitmap != null) {
            this.N = null;
            this.M = null;
            this.f33180y = null;
            this.f33179x = null;
            if (messageObject == null) {
                videoSize = null;
            } else {
                videoSize = messageObject.emojiMarkup;
            }
            this.O = videoSize;
            this.h = ImageLoader.scaleAndSaveImage(bitmap, 800.0f, 800.0f, 80, false, 320, 320);
            TLRPC.PhotoSize scaleAndSaveImage = ImageLoader.scaleAndSaveImage(bitmap, 150.0f, 150.0f, 80, false, 150, 150);
            this.f33175n = scaleAndSaveImage;
            int i10 = this.d;
            if (scaleAndSaveImage != null) {
                try {
                    Bitmap decodeFile = BitmapFactory.decodeFile(FileLoader.getInstance(i10).getPathToAttach(this.f33175n, true).getAbsolutePath());
                    this.f33176r = decodeFile;
                    ImageLoader.getInstance().putImageToCache(new BitmapDrawable(decodeFile), this.f33175n.location.volume_id + "_" + this.f33175n.location.local_id + "@50_50", true);
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
                this.v = a4.a.o(this.h.location.local_id, ".jpg", sb2);
                if (this.K) {
                    if (messageObject != null && messageObject.videoEditedInfo != null) {
                        if (this.I && !MessagesController.getInstance(i10).uploadMarkupVideo) {
                            x40 x40Var = this.f33171b;
                            if (x40Var != null) {
                                x40Var.I(z10, true);
                            }
                            x40 x40Var2 = this.f33171b;
                            if (x40Var2 != null) {
                                x40Var2.O(null, null, 0.0d, null, this.h, this.f33175n, this.f33177s, null);
                                this.f33171b.O(null, null, this.P, this.f33179x, this.h, this.f33175n, this.f33177s, this.O);
                                d();
                                return;
                            }
                            return;
                        }
                        this.f33180y = messageObject;
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
                        x40 x40Var3 = this.f33171b;
                        if (x40Var3 != null) {
                            x40Var3.I(z10, true);
                        }
                        this.f33177s = true;
                    } else {
                        x40 x40Var4 = this.f33171b;
                        if (x40Var4 != null) {
                            x40Var4.I(z10, false);
                        }
                        this.f33177s = false;
                    }
                    NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
                    NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploadProgressChanged);
                    NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploadFailed);
                    if (this.v != null) {
                        FileLoader.getInstance(i10).uploadFile(this.v, false, true, 16777216);
                    }
                }
                x40 x40Var5 = this.f33171b;
                if (x40Var5 != null) {
                    x40Var5.O(null, null, 0.0d, null, this.h, this.f33175n, this.f33177s, null);
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
            tL_message.f20068id = 0;
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
