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
import java.io.FileNotFoundException;
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

public final class j40 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.lp0 {
    public String A;
    public boolean B;
    public boolean D;
    public final boolean E;
    public TLRPC.User H;
    public TLRPC.InputFile I;
    public TLRPC.InputFile J;
    public TLRPC.VideoSize K;
    public double L;
    public final boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public final int R;
    public float S;

    public org.telegram.ui.ActionBar.n2 f29569a;

    public i40 f29570b;

    public gi f29571c;

    public String f29573f;
    public TLRPC.PhotoSize h;

    public TLRPC.PhotoSize f29574n;

    public Bitmap f29575r;

    public boolean f29576s;
    public String v;

    public String f29577w;

    public String f29578x;

    public MessageObject f29579y;
    public final int d = UserConfig.selectedAccount;
    public boolean C = true;
    public boolean F = true;
    public boolean G = true;

    public final ImageReceiver f29572e = new ImageReceiver(null);

    public j40(int i10, boolean z10, boolean z11) {
        this.M = z10;
        this.E = z11;
        this.R = i10;
    }

    public static void a(j40 j40Var, ArrayList arrayList, Runnable runnable, int i10) {
        org.telegram.ui.ActionBar.n2 n2Var;
        int iIntValue = ((Integer) arrayList.get(i10)).intValue();
        if (iIntValue == 0) {
            j40Var.m();
            return;
        }
        if (iIntValue == 1) {
            j40Var.n();
            return;
        }
        if (iIntValue == 2) {
            j40Var.r();
            return;
        }
        if (iIntValue == 3) {
            runnable.run();
            return;
        }
        if (iIntValue != 4 || (n2Var = j40Var.f29569a) == null || n2Var.getParentActivity() == null) {
            return;
        }
        try {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 23 && j40Var.f29569a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                j40Var.f29569a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                return;
            }
            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
            File fileGenerateVideoPath = AndroidUtilities.generateVideoPath();
            if (fileGenerateVideoPath != null) {
                if (i11 >= 24) {
                    intent.putExtra("output", FileProvider.d(j40Var.f29569a.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", fileGenerateVideoPath));
                    intent.addFlags(2);
                    intent.addFlags(1);
                } else {
                    intent.putExtra("output", Uri.fromFile(fileGenerateVideoPath));
                }
                intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
                intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
                intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
                intent.putExtra("android.intent.extra.durationLimit", 10);
                j40Var.f29573f = fileGenerateVideoPath.getAbsolutePath();
            }
            j40Var.f29569a.startActivityForResult(intent, 15);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static void b(j40 j40Var, boolean z10, ArrayList arrayList) throws FileNotFoundException {
        MessageObject messageObject;
        Bitmap bitmapLoadBitmap;
        ImageReceiver imageReceiver = j40Var.f29572e;
        int i10 = j40Var.d;
        if (arrayList.isEmpty()) {
            return;
        }
        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList.get(0);
        Bitmap bitmapLoadBitmap2 = null;
        if ((sendingMediaInfo.isVideo || sendingMediaInfo.videoEditedInfo != null) && !sendingMediaInfo.isLivePhoto) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f22401id = 0;
            tL_message.message = "";
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.action = new TLRPC.TL_messageActionEmpty();
            tL_message.dialog_id = 0L;
            messageObject = new MessageObject(UserConfig.selectedAccount, tL_message, false, false);
            messageObject.messageOwner.attachPath = new File(FileLoader.getDirectory(4), SharedConfig.getLastLocalId() + "_avatar.mp4").getAbsolutePath();
            messageObject.videoEditedInfo = sendingMediaInfo.videoEditedInfo;
            messageObject.emojiMarkup = sendingMediaInfo.emojiMarkup;
            bitmapLoadBitmap2 = ImageLoader.loadBitmap(sendingMediaInfo.thumbPath, null, 800.0f, 800.0f, true);
        } else {
            String str = sendingMediaInfo.path;
            if (str != null) {
                bitmapLoadBitmap = ImageLoader.loadBitmap(str, null, 800.0f, 800.0f, true);
            } else {
                MediaController.SearchImage searchImage = sendingMediaInfo.searchImage;
                if (searchImage != null) {
                    TLRPC.Photo photo = searchImage.photo;
                    if (photo != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                        if (closestPhotoSizeWithSize != null) {
                            File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(closestPhotoSizeWithSize, true);
                            j40Var.A = pathToAttach.getAbsolutePath();
                            if (!pathToAttach.exists()) {
                                pathToAttach = FileLoader.getInstance(i10).getPathToAttach(closestPhotoSizeWithSize, false);
                                if (!pathToAttach.exists()) {
                                    pathToAttach = null;
                                }
                            }
                            if (pathToAttach != null) {
                                bitmapLoadBitmap = ImageLoader.loadBitmap(pathToAttach.getAbsolutePath(), null, 800.0f, 800.0f, true);
                            } else {
                                NotificationCenter.getInstance(i10).addObserver(j40Var, NotificationCenter.fileLoaded);
                                NotificationCenter.getInstance(i10).addObserver(j40Var, NotificationCenter.fileLoadFailed);
                                j40Var.v = FileLoader.getAttachFileName(closestPhotoSizeWithSize.location);
                                imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, sendingMediaInfo.searchImage.photo), null, null, "jpg", null, 1);
                                bitmapLoadBitmap = null;
                            }
                        } else {
                            bitmapLoadBitmap = null;
                        }
                    } else if (searchImage.imageUrl != null) {
                        File file = new File(FileLoader.getDirectory(4), Utilities.MD5(sendingMediaInfo.searchImage.imageUrl) + "." + ImageLoader.getHttpUrlExtension(sendingMediaInfo.searchImage.imageUrl, "jpg"));
                        j40Var.A = file.getAbsolutePath();
                        if (!file.exists() || file.length() == 0) {
                            j40Var.v = sendingMediaInfo.searchImage.imageUrl;
                            NotificationCenter.getInstance(i10).addObserver(j40Var, NotificationCenter.httpFileDidLoad);
                            NotificationCenter.getInstance(i10).addObserver(j40Var, NotificationCenter.httpFileDidFailedLoad);
                            imageReceiver.setImage(sendingMediaInfo.searchImage.imageUrl, null, null, "jpg", 1L);
                        } else {
                            bitmapLoadBitmap = ImageLoader.loadBitmap(file.getAbsolutePath(), null, 800.0f, 800.0f, true);
                        }
                    }
                }
                messageObject = null;
            }
            messageObject = null;
            bitmapLoadBitmap2 = bitmapLoadBitmap;
        }
        j40Var.s(z10, bitmapLoadBitmap2, messageObject);
    }

    public final void c() {
        this.P = true;
        String str = this.v;
        int i10 = this.d;
        if (str != null) {
            FileLoader.getInstance(i10).cancelFileUpload(this.v, false);
        }
        if (this.f29577w != null) {
            FileLoader.getInstance(i10).cancelFileUpload(this.f29577w, false);
        }
        i40 i40Var = this.f29570b;
        if (i40Var != null) {
            i40Var.P();
        }
    }

    public final void d() {
        this.v = null;
        this.f29577w = null;
        this.f29578x = null;
        this.f29579y = null;
        if (this.B) {
            this.f29572e.setImageBitmap((Drawable) null);
            this.f29569a = null;
            this.f29570b = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        i40 i40Var;
        org.telegram.ui.ActionBar.n2 n2Var;
        int i12 = NotificationCenter.fileUploaded;
        int i13 = this.d;
        if (i10 == i12 || i10 == NotificationCenter.fileUploadFailed) {
            String str = (String) objArr[0];
            if (str.equals(this.v)) {
                this.v = null;
                if (i10 == i12) {
                    this.I = (TLRPC.InputFile) objArr[1];
                }
            } else {
                if (!str.equals(this.f29577w)) {
                    return;
                }
                this.f29577w = null;
                if (i10 == i12) {
                    this.J = (TLRPC.InputFile) objArr[1];
                }
            }
            if (this.v == null && this.f29577w == null && this.f29579y == null) {
                NotificationCenter.getInstance(i13).removeObserver(this, i12);
                NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
                NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileUploadFailed);
                if (i10 == i12 && (i40Var = this.f29570b) != null) {
                    i40Var.Q(this.I, this.J, this.L, this.f29578x, this.h, this.f29574n, this.f29576s, this.K);
                }
                d();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.fileUploadProgressChanged) {
            String str2 = (String) objArr[0];
            String str3 = this.f29579y != null ? this.f29577w : this.v;
            if (this.f29570b == null || !str2.equals(str3)) {
                return;
            }
            float fMin = Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue());
            i40 i40Var2 = this.f29570b;
            this.S = fMin;
            i40Var2.E(fMin);
            return;
        }
        int i14 = NotificationCenter.fileLoaded;
        if (i10 == i14 || i10 == NotificationCenter.fileLoadFailed || i10 == NotificationCenter.httpFileDidLoad || i10 == NotificationCenter.httpFileDidFailedLoad) {
            String str4 = (String) objArr[0];
            this.S = 1.0f;
            if (str4.equals(this.v)) {
                NotificationCenter.getInstance(i13).removeObserver(this, i14);
                NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileLoadFailed);
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i13);
                int i15 = NotificationCenter.httpFileDidLoad;
                notificationCenter.removeObserver(this, i15);
                NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.httpFileDidFailedLoad);
                this.v = null;
                if (i10 == i14 || i10 == i15) {
                    s(false, ImageLoader.loadBitmap(this.A, null, 800.0f, 800.0f, true), null);
                    return;
                }
                this.f29572e.setImageBitmap((Drawable) null);
                i40 i40Var3 = this.f29570b;
                if (i40Var3 != null) {
                    i40Var3.P();
                    return;
                }
                return;
            }
            return;
        }
        int i16 = NotificationCenter.filePreparingFailed;
        if (i10 == i16) {
            if (((MessageObject) objArr[0]) != this.f29579y || this.f29569a == null) {
                return;
            }
            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.filePreparingStarted);
            NotificationCenter.getInstance(i13).removeObserver(this, i16);
            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
            d();
            return;
        }
        if (i10 != NotificationCenter.fileNewChunkAvailable) {
            if (i10 == NotificationCenter.filePreparingStarted && ((MessageObject) objArr[0]) == this.f29579y && (n2Var = this.f29569a) != null) {
                this.f29577w = (String) objArr[1];
                n2Var.getFileLoader().uploadFile(this.f29577w, false, false, (int) this.f29579y.videoEditedInfo.estimatedSize, 33554432, false);
                return;
            }
            return;
        }
        if (((MessageObject) objArr[0]) != this.f29579y || this.f29569a == null) {
            return;
        }
        String str5 = (String) objArr[1];
        long jLongValue = ((Long) objArr[2]).longValue();
        long jLongValue2 = ((Long) objArr[3]).longValue();
        this.f29569a.getFileLoader().checkUploadNewDataAvailable(str5, false, jLongValue, jLongValue2);
        if (jLongValue2 != 0) {
            double dLongValue = ((Long) objArr[5]).longValue() / 1000000.0d;
            if (this.L > dLongValue) {
                this.L = dLongValue;
            }
            Bitmap bitmapCreateVideoThumbnailAtTime = SendMessagesHelper.createVideoThumbnailAtTime(str5, (long) (this.L * 1000.0d), null, true);
            if (bitmapCreateVideoThumbnailAtTime != null) {
                File pathToAttach = FileLoader.getInstance(i13).getPathToAttach(this.f29574n, true);
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
                this.h = ImageLoader.scaleAndSaveImage(bitmapCreateVideoThumbnailAtTime, 800.0f, 800.0f, 80, false, 320, 320);
                TLRPC.PhotoSize photoSizeScaleAndSaveImage = ImageLoader.scaleAndSaveImage(bitmapCreateVideoThumbnailAtTime, 150.0f, 150.0f, 80, false, 150, 150);
                this.f29574n = photoSizeScaleAndSaveImage;
                if (photoSizeScaleAndSaveImage != null) {
                    try {
                        ImageLoader.getInstance().putImageToCache(new BitmapDrawable(BitmapFactory.decodeFile(FileLoader.getInstance(i13).getPathToAttach(this.f29574n, true).getAbsolutePath())), this.f29574n.location.volume_id + "_" + this.f29574n.location.local_id + "@50_50", true);
                    } catch (Throwable unused) {
                    }
                }
            }
            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.filePreparingStarted);
            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.filePreparingFailed);
            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
            this.f29578x = str5;
            this.f29577w = str5;
            this.f29579y = null;
        }
    }

    public final void e() {
        this.P = false;
        if (this.v == null && this.f29577w == null && this.f29579y == null) {
            this.f29569a = null;
            this.f29570b = null;
        } else {
            this.B = true;
        }
        gi giVar = this.f29571c;
        if (giVar != null) {
            giVar.dismissInternal();
            this.f29571c.v1();
        }
    }

    public final void f() {
        bt btVar;
        org.telegram.ui.ActionBar.n2 n2Var = this.f29569a;
        if (n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        if (this.f29571c == null) {
            gi giVar = new gi(this.f29569a.getParentActivity(), this.f29569a, this.N, this.O);
            this.f29571c = giVar;
            int i10 = this.M ? 2 : 1;
            i40 i40Var = this.f29570b;
            if (i40Var == null || !i40Var.v()) {
                btVar = null;
            } else {
                i40 i40Var2 = this.f29570b;
                Objects.requireNonNull(i40Var2);
                btVar = new bt(i40Var2, 1);
            }
            giVar.M0 = i10;
            giVar.N0 = btVar;
            giVar.O0 = false;
            yh yhVar = giVar.f28696u0;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = giVar.f28650f0;
            if (yhVar == null || yhVar == chatAttachAlertPhotoLayout) {
                giVar.f28694t1.setVisibility(8);
            }
            int i11 = giVar.M0;
            TextView textView = giVar.f28651f1;
            if (i11 == 2) {
                textView.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
            } else {
                textView.setText(LocaleController.getString(R.string.ChoosePhoto));
            }
            if (chatAttachAlertPhotoLayout != null) {
                gi giVar2 = chatAttachAlertPhotoLayout.f34900b;
                chatAttachAlertPhotoLayout.f26247c1 = (giVar2.M0 == 0 || giVar2.B) ? false : true;
            }
            gi giVar3 = this.f29571c;
            giVar3.V1 = new e40(this);
            giVar3.Q = this;
        }
        int i12 = this.Q;
        if (i12 == 1) {
            this.f29571c.f28651f1.setText(LocaleController.formatString("SetPhotoFor", R.string.SetPhotoFor, this.H.first_name));
        } else if (i12 == 2) {
            this.f29571c.f28651f1.setText(LocaleController.formatString("SuggestPhotoFor", R.string.SuggestPhotoFor, this.H.first_name));
        }
    }

    public final boolean g(Dialog dialog) {
        gi giVar = this.f29571c;
        if (giVar == null || dialog != giVar) {
            return false;
        }
        giVar.f28650f0.a0(false);
        this.f29571c.dismissInternal();
        this.f29571c.f28650f0.d0(true);
        return true;
    }

    public final boolean h() {
        return (this.v == null && this.f29577w == null && this.f29579y == null) ? false : true;
    }

    public final void i(int i10, int i11, Intent intent) {
        if (i11 == -1) {
            if (i10 == 0 || i10 == 2) {
                f();
                gi giVar = this.f29571c;
                if (giVar != null) {
                    giVar.f28650f0.g0(i10, intent, this.f29573f);
                }
                this.f29573f = null;
                return;
            }
            if (i10 == 13) {
                this.f29569a.getParentActivity().overridePendingTransition(R.anim.alpha_in, R.anim.alpha_out);
                PhotoViewer.t1().K2(null, this.f29569a, null);
                p(this.f29573f, null, AndroidUtilities.getImageOrientation(this.f29573f), false);
                AndroidUtilities.addMediaToGallery(this.f29573f);
                this.f29573f = null;
                return;
            }
            if (i10 == 14) {
                if (intent == null || intent.getData() == null) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new xq(18, this, intent.getData()));
                return;
            }
            if (i10 == 15) {
                q(this.f29573f, null, true);
                AndroidUtilities.addMediaToGallery(this.f29573f);
                this.f29573f = null;
            }
        }
    }

    public final void j() {
        gi giVar = this.f29571c;
        if (giVar != null) {
            giVar.x1();
        }
    }

    public final void k(int i10, String[] strArr, int[] iArr) {
        gi giVar = this.f29571c;
        if (giVar != null) {
            if (i10 == 17) {
                giVar.f28650f0.U(false);
                this.f29571c.f28650f0.Y();
            } else if (i10 == 4) {
                giVar.f28650f0.Y();
            }
        }
    }

    public final void l() {
        gi giVar = this.f29571c;
        if (giVar != null) {
            giVar.y1();
        }
    }

    public final void m() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f29569a;
        if (n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 23 && this.f29569a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                this.f29569a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                return;
            }
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            File fileGeneratePicturePath = AndroidUtilities.generatePicturePath();
            if (fileGeneratePicturePath != null) {
                if (i10 >= 24) {
                    intent.putExtra("output", FileProvider.d(this.f29569a.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", fileGeneratePicturePath));
                    intent.addFlags(2);
                    intent.addFlags(1);
                } else {
                    intent.putExtra("output", Uri.fromFile(fileGeneratePicturePath));
                }
                this.f29573f = fileGeneratePicturePath.getAbsolutePath();
            }
            this.f29569a.startActivityForResult(intent, 13);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public final void n() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f29569a;
        if (n2Var == null) {
            return;
        }
        Activity parentActivity = n2Var.getParentActivity();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33 || parentActivity == null) {
            if (i10 >= 23 && parentActivity != null && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 151);
                return;
            }
        } else if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 151);
            return;
        }
        org.telegram.ui.jp0 jp0Var = new org.telegram.ui.jp0(this.M ? 3 : 1, false, false, null);
        jp0Var.f39470x = this.F;
        jp0Var.R = new f40(this);
        this.f29569a.presentFragment(jp0Var);
    }

    public final void o(boolean z10, final Runnable runnable, DialogInterface.OnDismissListener onDismissListener, int i10) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f29569a;
        if (n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        this.P = false;
        this.Q = i10;
        if (this.C) {
            org.telegram.ui.ActionBar.n2 n2Var2 = this.f29569a;
            if (n2Var2 == null || n2Var2.getParentActivity() == null) {
                return;
            }
            f();
            gi giVar = this.f29571c;
            giVar.Q1 = this.D;
            giVar.J1(1, false);
            this.f29571c.f28650f0.f0();
            int i11 = Build.VERSION.SDK_INT;
            if (i11 == 21 || i11 == 22) {
                AndroidUtilities.hideKeyboard(this.f29569a.getFragmentView().findFocus());
            }
            this.f29571c.r1();
            this.f29571c.setOnHideListener(onDismissListener);
            int i12 = this.Q;
            if (i12 != 0) {
                this.f29571c.M = new h40(i12, this.H);
            }
            gi giVar2 = this.f29571c;
            giVar2.getClass();
            this.f29569a.showDialog(giVar2);
            return;
        }
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(this.f29569a.getParentActivity(), null, false, false);
        e3Var.fixNavigationBar();
        if (i10 == 1) {
            e3Var.title = LocaleController.formatString("SetPhotoFor", R.string.SetPhotoFor, this.H.first_name);
            e3Var.bigTitle = true;
        } else if (i10 == 2) {
            e3Var.title = LocaleController.formatString("SuggestPhotoFor", R.string.SuggestPhotoFor, this.H.first_name);
            e3Var.bigTitle = true;
        } else {
            e3Var.title = LocaleController.getString(R.string.ChoosePhoto);
            e3Var.bigTitle = true;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        arrayList.add(LocaleController.getString(R.string.ChooseTakePhoto));
        org.telegram.ui.Cells.pa.n(R.drawable.msg_camera, 0, arrayList2, arrayList3);
        if (this.M) {
            arrayList.add(LocaleController.getString(R.string.ChooseRecordVideo));
            org.telegram.ui.Cells.pa.n(R.drawable.msg_video, 4, arrayList2, arrayList3);
        }
        arrayList.add(LocaleController.getString(R.string.ChooseFromGallery));
        org.telegram.ui.Cells.pa.n(R.drawable.msg_photos, 1, arrayList2, arrayList3);
        if (this.F) {
            arrayList.add(LocaleController.getString(R.string.ChooseFromSearch));
            org.telegram.ui.Cells.pa.n(R.drawable.msg_search, 2, arrayList2, arrayList3);
        }
        if (z10) {
            arrayList.add(LocaleController.getString(R.string.DeletePhoto));
            org.telegram.ui.Cells.pa.n(R.drawable.msg_delete, 3, arrayList2, arrayList3);
        }
        int[] iArr = new int[arrayList2.size()];
        int size = arrayList2.size();
        for (int i13 = 0; i13 < size; i13++) {
            iArr[i13] = ((Integer) arrayList2.get(i13)).intValue();
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i14) {
                j40.a(this.f27317a, arrayList3, runnable, i14);
            }
        };
        e3Var.items = charSequenceArr;
        e3Var.itemIcons = iArr;
        e3Var.onClickListener = onClickListener;
        e3Var.setOnHideListener(onDismissListener);
        this.f29569a.showDialog(e3Var);
        if (z10) {
            e3Var.setItemColor(arrayList.size() - 1, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23269p7, false));
        }
    }

    public final void p(String str, String str2, Pair pair, boolean z10) {
        ArrayList arrayList = new ArrayList();
        MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, 0, 0L, str, ((Integer) pair.first).intValue(), false, 0, 0, 0L).setOrientation(pair);
        orientation.isVideo = z10;
        orientation.thumbPath = str2;
        arrayList.add(orientation);
        PhotoViewer.t1().K2(null, this.f29569a, null);
        PhotoViewer.t1().f2(arrayList, 0, 1, false, new g40(this, arrayList), null);
        PhotoViewer.t1().L = true;
    }

    public final void q(String str, String str2, boolean z10) {
        p(str, str2, new Pair(0, 0), z10);
    }

    public final void r() {
        if (this.f29569a == null) {
            return;
        }
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.aq0 aq0Var = new org.telegram.ui.aq0(0, null, map, arrayList, 1, false, null, this.N);
        aq0Var.f36615o0 = new d40(this, map, arrayList);
        aq0Var.f0(1, false);
        aq0Var.f36612l0 = this.f29570b.getInitialSearchString();
        if (this.O) {
            this.f29569a.showAsSheet(aq0Var);
        } else {
            this.f29569a.presentFragment(aq0Var);
        }
    }

    public final void s(boolean z10, Bitmap bitmap, MessageObject messageObject) {
        if (bitmap == null) {
            return;
        }
        this.J = null;
        this.I = null;
        this.f29579y = null;
        this.f29578x = null;
        this.K = messageObject == null ? null : messageObject.emojiMarkup;
        this.h = ImageLoader.scaleAndSaveImage(bitmap, 800.0f, 800.0f, 80, false, 320, 320);
        TLRPC.PhotoSize photoSizeScaleAndSaveImage = ImageLoader.scaleAndSaveImage(bitmap, 150.0f, 150.0f, 80, false, 150, 150);
        this.f29574n = photoSizeScaleAndSaveImage;
        int i10 = this.d;
        if (photoSizeScaleAndSaveImage != null) {
            try {
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(FileLoader.getInstance(i10).getPathToAttach(this.f29574n, true).getAbsolutePath());
                this.f29575r = bitmapDecodeFile;
                ImageLoader.getInstance().putImageToCache(new BitmapDrawable(bitmapDecodeFile), this.f29574n.location.volume_id + "_" + this.f29574n.location.local_id + "@50_50", true);
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
            this.v = a9.p.k(this.h.location.local_id, ".jpg", sb2);
            if (this.G) {
                if (messageObject == null || messageObject.videoEditedInfo == null) {
                    i40 i40Var = this.f29570b;
                    if (i40Var != null) {
                        i40Var.J(z10, false);
                    }
                    this.f29576s = false;
                } else {
                    if (this.E && !MessagesController.getInstance(i10).uploadMarkupVideo) {
                        i40 i40Var2 = this.f29570b;
                        if (i40Var2 != null) {
                            i40Var2.J(z10, true);
                        }
                        i40 i40Var3 = this.f29570b;
                        if (i40Var3 != null) {
                            i40Var3.Q(null, null, 0.0d, null, this.h, this.f29574n, this.f29576s, null);
                            this.f29570b.Q(null, null, this.L, this.f29578x, this.h, this.f29574n, this.f29576s, this.K);
                            d();
                            return;
                        }
                        return;
                    }
                    this.f29579y = messageObject;
                    VideoEditedInfo videoEditedInfo = messageObject.videoEditedInfo;
                    long j10 = videoEditedInfo.startTime;
                    if (j10 < 0) {
                        j10 = 0;
                    }
                    this.L = (videoEditedInfo.avatarStartTime - j10) / 1000000.0d;
                    videoEditedInfo.shouldLimitFps = false;
                    NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingStarted);
                    NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingFailed);
                    NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileNewChunkAvailable);
                    MediaController.getInstance().scheduleVideoConvert(messageObject, true, true, false);
                    this.v = null;
                    i40 i40Var4 = this.f29570b;
                    if (i40Var4 != null) {
                        i40Var4.J(z10, true);
                    }
                    this.f29576s = true;
                }
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploadProgressChanged);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploadFailed);
                if (this.v != null) {
                    FileLoader.getInstance(i10).uploadFile(this.v, false, true, 16777216);
                }
            }
            i40 i40Var5 = this.f29570b;
            if (i40Var5 != null) {
                i40Var5.Q(null, null, 0.0d, null, this.h, this.f29574n, this.f29576s, null);
            }
        }
    }

    public final void t(MediaController.PhotoEntry photoEntry) throws FileNotFoundException {
        Bitmap bitmapLoadBitmap;
        String str = photoEntry.imagePath;
        if (str == null) {
            str = photoEntry.path;
        }
        MessageObject messageObject = null;
        if ((photoEntry.isVideo || photoEntry.editedInfo != null) && !photoEntry.isLivePhoto()) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f22401id = 0;
            tL_message.message = "";
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.action = new TLRPC.TL_messageActionEmpty();
            tL_message.dialog_id = 0L;
            MessageObject messageObject2 = new MessageObject(UserConfig.selectedAccount, tL_message, false, false);
            messageObject2.messageOwner.attachPath = new File(FileLoader.getDirectory(4), SharedConfig.getLastLocalId() + "_avatar.mp4").getAbsolutePath();
            messageObject2.videoEditedInfo = photoEntry.editedInfo;
            messageObject2.emojiMarkup = photoEntry.emojiMarkup;
            bitmapLoadBitmap = ImageLoader.loadBitmap(photoEntry.thumbPath, null, 800.0f, 800.0f, true);
            messageObject = messageObject2;
        } else {
            bitmapLoadBitmap = ImageLoader.loadBitmap(str, null, 800.0f, 800.0f, true);
        }
        s(false, bitmapLoadBitmap, messageObject);
    }
}
