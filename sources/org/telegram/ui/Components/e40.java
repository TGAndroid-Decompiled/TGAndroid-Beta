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
public final class e40 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.kp0 {
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
    public org.telegram.ui.ActionBar.o2 f27909a;
    public d40 f27910b;
    public ki f27911c;
    public String f27913f;
    public TLRPC.PhotoSize h;
    public TLRPC.PhotoSize f27914n;
    public Bitmap f27915r;
    public boolean f27916s;
    public String v;
    public String f27917w;
    public String f27918x;
    public MessageObject f27919y;
    public final int d = UserConfig.selectedAccount;
    public boolean C = true;
    public boolean F = true;
    public boolean G = true;
    public final ImageReceiver f27912e = new ImageReceiver(null);

    public e40(int i9, boolean z10, boolean z11) {
        this.M = z10;
        this.E = z11;
        this.R = i9;
    }

    public static void a(e40 e40Var, ArrayList arrayList, Runnable runnable, int i9) {
        org.telegram.ui.ActionBar.o2 o2Var;
        int intValue = ((Integer) arrayList.get(i9)).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue == 4 && (o2Var = e40Var.f27909a) != null && o2Var.getParentActivity() != null) {
                            try {
                                int i10 = Build.VERSION.SDK_INT;
                                if (i10 >= 23 && e40Var.f27909a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                    e40Var.f27909a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                                    return;
                                }
                                Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                                File generateVideoPath = AndroidUtilities.generateVideoPath();
                                if (generateVideoPath != null) {
                                    if (i10 >= 24) {
                                        Activity parentActivity = e40Var.f27909a.getParentActivity();
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
                                    e40Var.f27913f = generateVideoPath.getAbsolutePath();
                                }
                                e40Var.f27909a.startActivityForResult(intent, 15);
                                return;
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                return;
                            }
                        }
                        return;
                    }
                    runnable.run();
                    return;
                }
                e40Var.r();
                return;
            }
            e40Var.n();
            return;
        }
        e40Var.m();
    }

    public static void b(e40 e40Var, boolean z10, ArrayList arrayList) {
        MessageObject messageObject;
        Bitmap loadBitmap;
        ImageReceiver imageReceiver = e40Var.f27912e;
        int i9 = e40Var.d;
        if (!arrayList.isEmpty()) {
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList.get(0);
            Bitmap bitmap = null;
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
                                File pathToAttach = FileLoader.getInstance(i9).getPathToAttach(closestPhotoSizeWithSize, true);
                                e40Var.A = pathToAttach.getAbsolutePath();
                                if (!pathToAttach.exists()) {
                                    pathToAttach = FileLoader.getInstance(i9).getPathToAttach(closestPhotoSizeWithSize, false);
                                    if (!pathToAttach.exists()) {
                                        pathToAttach = null;
                                    }
                                }
                                if (pathToAttach != null) {
                                    loadBitmap = ImageLoader.loadBitmap(pathToAttach.getAbsolutePath(), null, 800.0f, 800.0f, true);
                                } else {
                                    NotificationCenter.getInstance(i9).addObserver(e40Var, NotificationCenter.fileLoaded);
                                    NotificationCenter.getInstance(i9).addObserver(e40Var, NotificationCenter.fileLoadFailed);
                                    e40Var.v = FileLoader.getAttachFileName(closestPhotoSizeWithSize.location);
                                    imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, sendingMediaInfo.searchImage.photo), null, null, "jpg", null, 1);
                                }
                            }
                            loadBitmap = null;
                        } else if (searchImage.imageUrl != null) {
                            File file = new File(FileLoader.getDirectory(4), Utilities.MD5(sendingMediaInfo.searchImage.imageUrl) + "." + ImageLoader.getHttpUrlExtension(sendingMediaInfo.searchImage.imageUrl, "jpg"));
                            e40Var.A = file.getAbsolutePath();
                            if (file.exists() && file.length() != 0) {
                                loadBitmap = ImageLoader.loadBitmap(file.getAbsolutePath(), null, 800.0f, 800.0f, true);
                            } else {
                                e40Var.v = sendingMediaInfo.searchImage.imageUrl;
                                NotificationCenter.getInstance(i9).addObserver(e40Var, NotificationCenter.httpFileDidLoad);
                                NotificationCenter.getInstance(i9).addObserver(e40Var, NotificationCenter.httpFileDidFailedLoad);
                                imageReceiver.setImage(sendingMediaInfo.searchImage.imageUrl, null, null, "jpg", 1L);
                            }
                        }
                    }
                    messageObject = null;
                }
                messageObject = null;
                bitmap = loadBitmap;
            }
            e40Var.s(z10, bitmap, messageObject);
        }
    }

    public final void c() {
        this.P = true;
        String str = this.v;
        int i9 = this.d;
        if (str != null) {
            FileLoader.getInstance(i9).cancelFileUpload(this.v, false);
        }
        if (this.f27917w != null) {
            FileLoader.getInstance(i9).cancelFileUpload(this.f27917w, false);
        }
        d40 d40Var = this.f27910b;
        if (d40Var != null) {
            d40Var.O();
        }
    }

    public final void d() {
        this.v = null;
        this.f27917w = null;
        this.f27918x = null;
        this.f27919y = null;
        if (this.B) {
            this.f27912e.setImageBitmap((Drawable) null);
            this.f27909a = null;
            this.f27910b = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        d40 d40Var;
        org.telegram.ui.ActionBar.o2 o2Var;
        String str;
        int i11 = NotificationCenter.fileUploaded;
        int i12 = this.d;
        if (i9 != i11 && i9 != NotificationCenter.fileUploadFailed) {
            if (i9 == NotificationCenter.fileUploadProgressChanged) {
                String str2 = (String) objArr[0];
                if (this.f27919y != null) {
                    str = this.f27917w;
                } else {
                    str = this.v;
                }
                if (this.f27910b != null && str2.equals(str)) {
                    float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
                    d40 d40Var2 = this.f27910b;
                    this.S = min;
                    d40Var2.D(min);
                    return;
                }
                return;
            }
            int i13 = NotificationCenter.fileLoaded;
            if (i9 != i13 && i9 != NotificationCenter.fileLoadFailed && i9 != NotificationCenter.httpFileDidLoad && i9 != NotificationCenter.httpFileDidFailedLoad) {
                int i14 = NotificationCenter.filePreparingFailed;
                if (i9 == i14) {
                    if (((MessageObject) objArr[0]) == this.f27919y && this.f27909a != null) {
                        NotificationCenter.getInstance(i12).removeObserver(this, NotificationCenter.filePreparingStarted);
                        NotificationCenter.getInstance(i12).removeObserver(this, i14);
                        NotificationCenter.getInstance(i12).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
                        d();
                        return;
                    }
                    return;
                } else if (i9 == NotificationCenter.fileNewChunkAvailable) {
                    if (((MessageObject) objArr[0]) == this.f27919y && this.f27909a != null) {
                        String str3 = (String) objArr[1];
                        long longValue = ((Long) objArr[2]).longValue();
                        long longValue2 = ((Long) objArr[3]).longValue();
                        this.f27909a.getFileLoader().checkUploadNewDataAvailable(str3, false, longValue, longValue2);
                        if (longValue2 != 0) {
                            double longValue3 = ((Long) objArr[5]).longValue() / 1000000.0d;
                            if (this.L > longValue3) {
                                this.L = longValue3;
                            }
                            Bitmap createVideoThumbnailAtTime = SendMessagesHelper.createVideoThumbnailAtTime(str3, (long) (this.L * 1000.0d), null, true);
                            if (createVideoThumbnailAtTime != null) {
                                File pathToAttach = FileLoader.getInstance(i12).getPathToAttach(this.f27914n, true);
                                if (pathToAttach != null) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.e("delete file " + pathToAttach);
                                    }
                                    pathToAttach.delete();
                                }
                                File pathToAttach2 = FileLoader.getInstance(i12).getPathToAttach(this.h, true);
                                if (pathToAttach2 != null) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.e("delete file " + pathToAttach2);
                                    }
                                    pathToAttach2.delete();
                                }
                                this.h = ImageLoader.scaleAndSaveImage(createVideoThumbnailAtTime, 800.0f, 800.0f, 80, false, 320, 320);
                                TLRPC.PhotoSize scaleAndSaveImage = ImageLoader.scaleAndSaveImage(createVideoThumbnailAtTime, 150.0f, 150.0f, 80, false, 150, 150);
                                this.f27914n = scaleAndSaveImage;
                                if (scaleAndSaveImage != null) {
                                    try {
                                        Bitmap decodeFile = BitmapFactory.decodeFile(FileLoader.getInstance(i12).getPathToAttach(this.f27914n, true).getAbsolutePath());
                                        ImageLoader.getInstance().putImageToCache(new BitmapDrawable(decodeFile), this.f27914n.location.volume_id + "_" + this.f27914n.location.local_id + "@50_50", true);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                            NotificationCenter.getInstance(i12).removeObserver(this, NotificationCenter.filePreparingStarted);
                            NotificationCenter.getInstance(i12).removeObserver(this, NotificationCenter.filePreparingFailed);
                            NotificationCenter.getInstance(i12).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
                            this.f27918x = str3;
                            this.f27917w = str3;
                            this.f27919y = null;
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i9 == NotificationCenter.filePreparingStarted && ((MessageObject) objArr[0]) == this.f27919y && (o2Var = this.f27909a) != null) {
                    this.f27917w = (String) objArr[1];
                    o2Var.getFileLoader().uploadFile(this.f27917w, false, false, (int) this.f27919y.videoEditedInfo.estimatedSize, 33554432, false);
                    return;
                } else {
                    return;
                }
            }
            this.S = 1.0f;
            if (((String) objArr[0]).equals(this.v)) {
                NotificationCenter.getInstance(i12).removeObserver(this, i13);
                NotificationCenter.getInstance(i12).removeObserver(this, NotificationCenter.fileLoadFailed);
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i12);
                int i15 = NotificationCenter.httpFileDidLoad;
                notificationCenter.removeObserver(this, i15);
                NotificationCenter.getInstance(i12).removeObserver(this, NotificationCenter.httpFileDidFailedLoad);
                this.v = null;
                if (i9 != i13 && i9 != i15) {
                    this.f27912e.setImageBitmap((Drawable) null);
                    d40 d40Var3 = this.f27910b;
                    if (d40Var3 != null) {
                        d40Var3.O();
                        return;
                    }
                    return;
                }
                s(false, ImageLoader.loadBitmap(this.A, null, 800.0f, 800.0f, true), null);
                return;
            }
            return;
        }
        String str4 = (String) objArr[0];
        if (str4.equals(this.v)) {
            this.v = null;
            if (i9 == i11) {
                this.I = (TLRPC.InputFile) objArr[1];
            }
        } else if (str4.equals(this.f27917w)) {
            this.f27917w = null;
            if (i9 == i11) {
                this.J = (TLRPC.InputFile) objArr[1];
            }
        } else {
            return;
        }
        if (this.v == null && this.f27917w == null && this.f27919y == null) {
            NotificationCenter.getInstance(i12).removeObserver(this, i11);
            NotificationCenter.getInstance(i12).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
            NotificationCenter.getInstance(i12).removeObserver(this, NotificationCenter.fileUploadFailed);
            if (i9 == i11 && (d40Var = this.f27910b) != null) {
                d40Var.P(this.I, this.J, this.L, this.f27918x, this.h, this.f27914n, this.f27916s, this.K);
            }
            d();
        }
    }

    public final void e() {
        this.P = false;
        if (this.v == null && this.f27917w == null && this.f27919y == null) {
            this.f27909a = null;
            this.f27910b = null;
        } else {
            this.B = true;
        }
        ki kiVar = this.f27911c;
        if (kiVar != null) {
            kiVar.dismissInternal();
            this.f27911c.v1();
        }
    }

    public final void f() {
        int i9;
        ct ctVar;
        boolean z10;
        org.telegram.ui.ActionBar.o2 o2Var = this.f27909a;
        if (o2Var != null && o2Var.getParentActivity() != null) {
            if (this.f27911c == null) {
                ki kiVar = new ki(this.f27909a.getParentActivity(), this.f27909a, this.N, this.O);
                this.f27911c = kiVar;
                if (this.M) {
                    i9 = 2;
                } else {
                    i9 = 1;
                }
                d40 d40Var = this.f27910b;
                if (d40Var != null && d40Var.u()) {
                    d40 d40Var2 = this.f27910b;
                    Objects.requireNonNull(d40Var2);
                    ctVar = new ct(d40Var2, 1);
                } else {
                    ctVar = null;
                }
                kiVar.M0 = i9;
                kiVar.N0 = ctVar;
                kiVar.O0 = false;
                ci ciVar = kiVar.f30160u0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar.f30114f0;
                if (ciVar == null || ciVar == chatAttachAlertPhotoLayout) {
                    kiVar.f30158t1.setVisibility(8);
                }
                int i10 = kiVar.M0;
                TextView textView = kiVar.f30115f1;
                if (i10 == 2) {
                    textView.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
                } else {
                    textView.setText(LocaleController.getString(R.string.ChoosePhoto));
                }
                if (chatAttachAlertPhotoLayout != null) {
                    ki kiVar2 = chatAttachAlertPhotoLayout.f27493b;
                    if (kiVar2.M0 != 0 && !kiVar2.B) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    chatAttachAlertPhotoLayout.f26251c1 = z10;
                }
                ki kiVar3 = this.f27911c;
                kiVar3.V1 = new z30(this);
                kiVar3.Q = this;
            }
            int i11 = this.Q;
            if (i11 == 1) {
                this.f27911c.f30115f1.setText(LocaleController.formatString("SetPhotoFor", R.string.SetPhotoFor, this.H.first_name));
            } else if (i11 == 2) {
                this.f27911c.f30115f1.setText(LocaleController.formatString("SuggestPhotoFor", R.string.SuggestPhotoFor, this.H.first_name));
            }
        }
    }

    public final boolean g(Dialog dialog) {
        ki kiVar = this.f27911c;
        if (kiVar == null || dialog != kiVar) {
            return false;
        }
        kiVar.f30114f0.Z(false);
        this.f27911c.dismissInternal();
        this.f27911c.f30114f0.c0(true);
        return true;
    }

    public final boolean h() {
        if (this.v == null && this.f27917w == null && this.f27919y == null) {
            return false;
        }
        return true;
    }

    public final void i(int i9, int i10, Intent intent) {
        if (i10 == -1) {
            if (i9 != 0 && i9 != 2) {
                if (i9 == 13) {
                    this.f27909a.getParentActivity().overridePendingTransition(R.anim.alpha_in, R.anim.alpha_out);
                    PhotoViewer.t1().K2(null, this.f27909a, null);
                    p(this.f27913f, null, AndroidUtilities.getImageOrientation(this.f27913f), false);
                    AndroidUtilities.addMediaToGallery(this.f27913f);
                    this.f27913f = null;
                    return;
                } else if (i9 == 14) {
                    if (intent != null && intent.getData() != null) {
                        AndroidUtilities.runOnUIThread(new zq(18, this, intent.getData()));
                        return;
                    }
                    return;
                } else if (i9 == 15) {
                    q(this.f27913f, null, true);
                    AndroidUtilities.addMediaToGallery(this.f27913f);
                    this.f27913f = null;
                    return;
                } else {
                    return;
                }
            }
            f();
            ki kiVar = this.f27911c;
            if (kiVar != null) {
                kiVar.f30114f0.f0(i9, intent, this.f27913f);
            }
            this.f27913f = null;
        }
    }

    public final void j() {
        ki kiVar = this.f27911c;
        if (kiVar != null) {
            kiVar.x1();
        }
    }

    public final void k(int i9, String[] strArr, int[] iArr) {
        ki kiVar = this.f27911c;
        if (kiVar != null) {
            if (i9 == 17) {
                kiVar.f30114f0.T(false);
                this.f27911c.f30114f0.X();
            } else if (i9 == 4) {
                kiVar.f30114f0.X();
            }
        }
    }

    public final void l() {
        ki kiVar = this.f27911c;
        if (kiVar != null) {
            kiVar.y1();
        }
    }

    public final void m() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f27909a;
        if (o2Var != null && o2Var.getParentActivity() != null) {
            try {
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 23 && this.f27909a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    this.f27909a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                    return;
                }
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File generatePicturePath = AndroidUtilities.generatePicturePath();
                if (generatePicturePath != null) {
                    if (i9 >= 24) {
                        Activity parentActivity = this.f27909a.getParentActivity();
                        intent.putExtra("output", FileProvider.d(parentActivity, ApplicationLoader.getApplicationId() + ".provider", generatePicturePath));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(generatePicturePath));
                    }
                    this.f27913f = generatePicturePath.getAbsolutePath();
                }
                this.f27909a.startActivityForResult(intent, 13);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    public final void n() {
        int i9;
        org.telegram.ui.ActionBar.o2 o2Var = this.f27909a;
        if (o2Var == null) {
            return;
        }
        Activity parentActivity = o2Var.getParentActivity();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 && parentActivity != null) {
            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 151);
                return;
            }
        } else if (i10 >= 23 && parentActivity != null && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 151);
            return;
        }
        if (this.M) {
            i9 = 3;
        } else {
            i9 = 1;
        }
        org.telegram.ui.ip0 ip0Var = new org.telegram.ui.ip0(i9, false, false, null);
        ip0Var.f39248x = this.F;
        ip0Var.R = new a40(this);
        this.f27909a.presentFragment(ip0Var);
    }

    public final void o(boolean z10, final Runnable runnable, DialogInterface.OnDismissListener onDismissListener, int i9) {
        org.telegram.ui.ActionBar.o2 o2Var = this.f27909a;
        if (o2Var != null && o2Var.getParentActivity() != null) {
            this.P = false;
            this.Q = i9;
            if (this.C) {
                org.telegram.ui.ActionBar.o2 o2Var2 = this.f27909a;
                if (o2Var2 != null && o2Var2.getParentActivity() != null) {
                    f();
                    ki kiVar = this.f27911c;
                    kiVar.Q1 = this.D;
                    kiVar.J1(1, false);
                    this.f27911c.f30114f0.e0();
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 == 21 || i10 == 22) {
                        AndroidUtilities.hideKeyboard(this.f27909a.getFragmentView().findFocus());
                    }
                    this.f27911c.r1();
                    this.f27911c.setOnHideListener(onDismissListener);
                    int i11 = this.Q;
                    if (i11 != 0) {
                        this.f27911c.M = new c40(i11, this.H);
                    }
                    ki kiVar2 = this.f27911c;
                    kiVar2.getClass();
                    this.f27909a.showDialog(kiVar2);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(this.f27909a.getParentActivity(), null, false, false);
            f3Var.fixNavigationBar();
            if (i9 == 1) {
                f3Var.title = LocaleController.formatString("SetPhotoFor", R.string.SetPhotoFor, this.H.first_name);
                f3Var.bigTitle = true;
            } else if (i9 == 2) {
                f3Var.title = LocaleController.formatString("SuggestPhotoFor", R.string.SuggestPhotoFor, this.H.first_name);
                f3Var.bigTitle = true;
            } else {
                f3Var.title = LocaleController.getString(R.string.ChoosePhoto);
                f3Var.bigTitle = true;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            final ArrayList arrayList3 = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.ChooseTakePhoto));
            org.telegram.ui.Cells.j2.j(R.drawable.msg_camera, 0, arrayList2, arrayList3);
            if (this.M) {
                arrayList.add(LocaleController.getString(R.string.ChooseRecordVideo));
                org.telegram.ui.Cells.j2.j(R.drawable.msg_video, 4, arrayList2, arrayList3);
            }
            arrayList.add(LocaleController.getString(R.string.ChooseFromGallery));
            org.telegram.ui.Cells.j2.j(R.drawable.msg_photos, 1, arrayList2, arrayList3);
            if (this.F) {
                arrayList.add(LocaleController.getString(R.string.ChooseFromSearch));
                org.telegram.ui.Cells.j2.j(R.drawable.msg_search, 2, arrayList2, arrayList3);
            }
            if (z10) {
                arrayList.add(LocaleController.getString(R.string.DeletePhoto));
                org.telegram.ui.Cells.j2.j(R.drawable.msg_delete, 3, arrayList2, arrayList3);
            }
            int[] iArr = new int[arrayList2.size()];
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                iArr[i12] = ((Integer) arrayList2.get(i12)).intValue();
            }
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i13) {
                    e40.a(e40.this, arrayList3, runnable, i13);
                }
            };
            f3Var.items = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
            f3Var.itemIcons = iArr;
            f3Var.onClickListener = onClickListener;
            f3Var.setOnHideListener(onDismissListener);
            this.f27909a.showDialog(f3Var);
            if (z10) {
                f3Var.setItemColor(arrayList.size() - 1, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23212p7, false));
            }
        }
    }

    public final void p(String str, String str2, Pair pair, boolean z10) {
        ArrayList arrayList = new ArrayList();
        MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, 0, 0L, str, ((Integer) pair.first).intValue(), false, 0, 0, 0L).setOrientation(pair);
        orientation.isVideo = z10;
        orientation.thumbPath = str2;
        arrayList.add(orientation);
        PhotoViewer.t1().K2(null, this.f27909a, null);
        PhotoViewer.t1().f2(arrayList, 0, 1, false, new b40(this, arrayList), null);
        PhotoViewer.t1().L = true;
    }

    public final void q(String str, String str2, boolean z10) {
        p(str, str2, new Pair(0, 0), z10);
    }

    public final void r() {
        if (this.f27909a == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.zp0 zp0Var = new org.telegram.ui.zp0(0, null, hashMap, arrayList, 1, false, null, this.N);
        zp0Var.f45225o0 = new y30(this, hashMap, arrayList);
        zp0Var.e0(1, false);
        zp0Var.f45222l0 = this.f27910b.getInitialSearchString();
        if (this.O) {
            this.f27909a.showAsSheet(zp0Var);
        } else {
            this.f27909a.presentFragment(zp0Var);
        }
    }

    public final void s(boolean z10, Bitmap bitmap, MessageObject messageObject) {
        TLRPC.VideoSize videoSize;
        if (bitmap != null) {
            this.J = null;
            this.I = null;
            this.f27919y = null;
            this.f27918x = null;
            if (messageObject == null) {
                videoSize = null;
            } else {
                videoSize = messageObject.emojiMarkup;
            }
            this.K = videoSize;
            this.h = ImageLoader.scaleAndSaveImage(bitmap, 800.0f, 800.0f, 80, false, 320, 320);
            TLRPC.PhotoSize scaleAndSaveImage = ImageLoader.scaleAndSaveImage(bitmap, 150.0f, 150.0f, 80, false, 150, 150);
            this.f27914n = scaleAndSaveImage;
            int i9 = this.d;
            if (scaleAndSaveImage != null) {
                try {
                    Bitmap decodeFile = BitmapFactory.decodeFile(FileLoader.getInstance(i9).getPathToAttach(this.f27914n, true).getAbsolutePath());
                    this.f27915r = decodeFile;
                    ImageLoader.getInstance().putImageToCache(new BitmapDrawable(decodeFile), this.f27914n.location.volume_id + "_" + this.f27914n.location.local_id + "@50_50", true);
                } catch (Throwable unused) {
                }
            }
            bitmap.recycle();
            if (this.h != null) {
                UserConfig.getInstance(i9).saveConfig(false);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(FileLoader.getDirectory(4));
                sb2.append("/");
                sb2.append(this.h.location.volume_id);
                sb2.append("_");
                this.v = aa.d.l(this.h.location.local_id, ".jpg", sb2);
                if (this.G) {
                    if (messageObject != null && messageObject.videoEditedInfo != null) {
                        if (this.E && !MessagesController.getInstance(i9).uploadMarkupVideo) {
                            d40 d40Var = this.f27910b;
                            if (d40Var != null) {
                                d40Var.J(z10, true);
                            }
                            d40 d40Var2 = this.f27910b;
                            if (d40Var2 != null) {
                                d40Var2.P(null, null, 0.0d, null, this.h, this.f27914n, this.f27916s, null);
                                this.f27910b.P(null, null, this.L, this.f27918x, this.h, this.f27914n, this.f27916s, this.K);
                                d();
                                return;
                            }
                            return;
                        }
                        this.f27919y = messageObject;
                        VideoEditedInfo videoEditedInfo = messageObject.videoEditedInfo;
                        long j10 = videoEditedInfo.startTime;
                        if (j10 < 0) {
                            j10 = 0;
                        }
                        this.L = (videoEditedInfo.avatarStartTime - j10) / 1000000.0d;
                        videoEditedInfo.shouldLimitFps = false;
                        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.filePreparingStarted);
                        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.filePreparingFailed);
                        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.fileNewChunkAvailable);
                        MediaController.getInstance().scheduleVideoConvert(messageObject, true, true, false);
                        this.v = null;
                        d40 d40Var3 = this.f27910b;
                        if (d40Var3 != null) {
                            d40Var3.J(z10, true);
                        }
                        this.f27916s = true;
                    } else {
                        d40 d40Var4 = this.f27910b;
                        if (d40Var4 != null) {
                            d40Var4.J(z10, false);
                        }
                        this.f27916s = false;
                    }
                    NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.fileUploaded);
                    NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.fileUploadProgressChanged);
                    NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.fileUploadFailed);
                    if (this.v != null) {
                        FileLoader.getInstance(i9).uploadFile(this.v, false, true, 16777216);
                    }
                }
                d40 d40Var5 = this.f27910b;
                if (d40Var5 != null) {
                    d40Var5.P(null, null, 0.0d, null, this.h, this.f27914n, this.f27916s, null);
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
            tL_message.f22401id = 0;
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
