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
public final class s40 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.jp0 {
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
    public org.telegram.ui.ActionBar.o2 f32469a;
    public r40 f32470b;
    public ni f32471c;
    public String f32473f;
    public TLRPC.PhotoSize h;
    public TLRPC.PhotoSize f32474n;
    public Bitmap f32475r;
    public boolean f32476s;
    public String v;
    public String f32477w;
    public String f32478x;
    public MessageObject f32479y;
    public final int d = UserConfig.selectedAccount;
    public boolean C = true;
    public boolean F = true;
    public boolean G = true;
    public final ImageReceiver f32472e = new ImageReceiver(null);

    public s40(int i10, boolean z10, boolean z11) {
        this.M = z10;
        this.E = z11;
        this.R = i10;
    }

    public static void a(s40 s40Var, ArrayList arrayList, Runnable runnable, int i10) {
        org.telegram.ui.ActionBar.o2 o2Var;
        int intValue = ((Integer) arrayList.get(i10)).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue == 4 && (o2Var = s40Var.f32469a) != null && o2Var.getParentActivity() != null) {
                            try {
                                int i11 = Build.VERSION.SDK_INT;
                                if (i11 >= 23 && s40Var.f32469a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                    s40Var.f32469a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                                    return;
                                }
                                Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                                File generateVideoPath = AndroidUtilities.generateVideoPath();
                                if (generateVideoPath != null) {
                                    if (i11 >= 24) {
                                        Activity parentActivity = s40Var.f32469a.getParentActivity();
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
                                    s40Var.f32473f = generateVideoPath.getAbsolutePath();
                                }
                                s40Var.f32469a.startActivityForResult(intent, 15);
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
                s40Var.r();
                return;
            }
            s40Var.n();
            return;
        }
        s40Var.m();
    }

    public static void b(s40 s40Var, boolean z10, ArrayList arrayList) {
        MessageObject messageObject;
        Bitmap loadBitmap;
        ImageReceiver imageReceiver = s40Var.f32472e;
        int i10 = s40Var.d;
        if (!arrayList.isEmpty()) {
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList.get(0);
            Bitmap bitmap = null;
            if ((sendingMediaInfo.isVideo || sendingMediaInfo.videoEditedInfo != null) && !sendingMediaInfo.isLivePhoto) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f22413id = 0;
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
                                s40Var.A = pathToAttach.getAbsolutePath();
                                if (!pathToAttach.exists()) {
                                    pathToAttach = FileLoader.getInstance(i10).getPathToAttach(closestPhotoSizeWithSize, false);
                                    if (!pathToAttach.exists()) {
                                        pathToAttach = null;
                                    }
                                }
                                if (pathToAttach != null) {
                                    loadBitmap = ImageLoader.loadBitmap(pathToAttach.getAbsolutePath(), null, 800.0f, 800.0f, true);
                                } else {
                                    NotificationCenter.getInstance(i10).addObserver(s40Var, NotificationCenter.fileLoaded);
                                    NotificationCenter.getInstance(i10).addObserver(s40Var, NotificationCenter.fileLoadFailed);
                                    s40Var.v = FileLoader.getAttachFileName(closestPhotoSizeWithSize.location);
                                    imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, sendingMediaInfo.searchImage.photo), null, null, "jpg", null, 1);
                                }
                            }
                            loadBitmap = null;
                        } else if (searchImage.imageUrl != null) {
                            File file = new File(FileLoader.getDirectory(4), Utilities.MD5(sendingMediaInfo.searchImage.imageUrl) + "." + ImageLoader.getHttpUrlExtension(sendingMediaInfo.searchImage.imageUrl, "jpg"));
                            s40Var.A = file.getAbsolutePath();
                            if (file.exists() && file.length() != 0) {
                                loadBitmap = ImageLoader.loadBitmap(file.getAbsolutePath(), null, 800.0f, 800.0f, true);
                            } else {
                                s40Var.v = sendingMediaInfo.searchImage.imageUrl;
                                NotificationCenter.getInstance(i10).addObserver(s40Var, NotificationCenter.httpFileDidLoad);
                                NotificationCenter.getInstance(i10).addObserver(s40Var, NotificationCenter.httpFileDidFailedLoad);
                                imageReceiver.setImage(sendingMediaInfo.searchImage.imageUrl, null, null, "jpg", 1L);
                            }
                        }
                    }
                    messageObject = null;
                }
                messageObject = null;
                bitmap = loadBitmap;
            }
            s40Var.s(z10, bitmap, messageObject);
        }
    }

    public final void c() {
        this.P = true;
        String str = this.v;
        int i10 = this.d;
        if (str != null) {
            FileLoader.getInstance(i10).cancelFileUpload(this.v, false);
        }
        if (this.f32477w != null) {
            FileLoader.getInstance(i10).cancelFileUpload(this.f32477w, false);
        }
        r40 r40Var = this.f32470b;
        if (r40Var != null) {
            r40Var.P();
        }
    }

    public final void d() {
        this.v = null;
        this.f32477w = null;
        this.f32478x = null;
        this.f32479y = null;
        if (this.B) {
            this.f32472e.setImageBitmap((Drawable) null);
            this.f32469a = null;
            this.f32470b = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        r40 r40Var;
        org.telegram.ui.ActionBar.o2 o2Var;
        String str;
        int i12 = NotificationCenter.fileUploaded;
        int i13 = this.d;
        if (i10 != i12 && i10 != NotificationCenter.fileUploadFailed) {
            if (i10 == NotificationCenter.fileUploadProgressChanged) {
                String str2 = (String) objArr[0];
                if (this.f32479y != null) {
                    str = this.f32477w;
                } else {
                    str = this.v;
                }
                if (this.f32470b != null && str2.equals(str)) {
                    float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
                    r40 r40Var2 = this.f32470b;
                    this.S = min;
                    r40Var2.D(min);
                    return;
                }
                return;
            }
            int i14 = NotificationCenter.fileLoaded;
            if (i10 != i14 && i10 != NotificationCenter.fileLoadFailed && i10 != NotificationCenter.httpFileDidLoad && i10 != NotificationCenter.httpFileDidFailedLoad) {
                int i15 = NotificationCenter.filePreparingFailed;
                if (i10 == i15) {
                    if (((MessageObject) objArr[0]) == this.f32479y && this.f32469a != null) {
                        NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.filePreparingStarted);
                        NotificationCenter.getInstance(i13).removeObserver(this, i15);
                        NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
                        d();
                        return;
                    }
                    return;
                } else if (i10 == NotificationCenter.fileNewChunkAvailable) {
                    if (((MessageObject) objArr[0]) == this.f32479y && this.f32469a != null) {
                        String str3 = (String) objArr[1];
                        long longValue = ((Long) objArr[2]).longValue();
                        long longValue2 = ((Long) objArr[3]).longValue();
                        this.f32469a.getFileLoader().checkUploadNewDataAvailable(str3, false, longValue, longValue2);
                        if (longValue2 != 0) {
                            double longValue3 = ((Long) objArr[5]).longValue() / 1000000.0d;
                            if (this.L > longValue3) {
                                this.L = longValue3;
                            }
                            Bitmap createVideoThumbnailAtTime = SendMessagesHelper.createVideoThumbnailAtTime(str3, (long) (this.L * 1000.0d), null, true);
                            if (createVideoThumbnailAtTime != null) {
                                File pathToAttach = FileLoader.getInstance(i13).getPathToAttach(this.f32474n, true);
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
                                this.f32474n = scaleAndSaveImage;
                                if (scaleAndSaveImage != null) {
                                    try {
                                        Bitmap decodeFile = BitmapFactory.decodeFile(FileLoader.getInstance(i13).getPathToAttach(this.f32474n, true).getAbsolutePath());
                                        ImageLoader.getInstance().putImageToCache(new BitmapDrawable(decodeFile), this.f32474n.location.volume_id + "_" + this.f32474n.location.local_id + "@50_50", true);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.filePreparingStarted);
                            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.filePreparingFailed);
                            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
                            this.f32478x = str3;
                            this.f32477w = str3;
                            this.f32479y = null;
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == NotificationCenter.filePreparingStarted && ((MessageObject) objArr[0]) == this.f32479y && (o2Var = this.f32469a) != null) {
                    this.f32477w = (String) objArr[1];
                    o2Var.getFileLoader().uploadFile(this.f32477w, false, false, (int) this.f32479y.videoEditedInfo.estimatedSize, 33554432, false);
                    return;
                } else {
                    return;
                }
            }
            this.S = 1.0f;
            if (((String) objArr[0]).equals(this.v)) {
                NotificationCenter.getInstance(i13).removeObserver(this, i14);
                NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileLoadFailed);
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i13);
                int i16 = NotificationCenter.httpFileDidLoad;
                notificationCenter.removeObserver(this, i16);
                NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.httpFileDidFailedLoad);
                this.v = null;
                if (i10 != i14 && i10 != i16) {
                    this.f32472e.setImageBitmap((Drawable) null);
                    r40 r40Var3 = this.f32470b;
                    if (r40Var3 != null) {
                        r40Var3.P();
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
            if (i10 == i12) {
                this.I = (TLRPC.InputFile) objArr[1];
            }
        } else if (str4.equals(this.f32477w)) {
            this.f32477w = null;
            if (i10 == i12) {
                this.J = (TLRPC.InputFile) objArr[1];
            }
        } else {
            return;
        }
        if (this.v == null && this.f32477w == null && this.f32479y == null) {
            NotificationCenter.getInstance(i13).removeObserver(this, i12);
            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileUploadFailed);
            if (i10 == i12 && (r40Var = this.f32470b) != null) {
                r40Var.Q(this.I, this.J, this.L, this.f32478x, this.h, this.f32474n, this.f32476s, this.K);
            }
            d();
        }
    }

    public final void e() {
        this.P = false;
        if (this.v == null && this.f32477w == null && this.f32479y == null) {
            this.f32469a = null;
            this.f32470b = null;
        } else {
            this.B = true;
        }
        ni niVar = this.f32471c;
        if (niVar != null) {
            niVar.dismissInternal();
            this.f32471c.v1();
        }
    }

    public final void f() {
        int i10;
        jt jtVar;
        boolean z10;
        org.telegram.ui.ActionBar.o2 o2Var = this.f32469a;
        if (o2Var != null && o2Var.getParentActivity() != null) {
            if (this.f32471c == null) {
                ni niVar = new ni(this.f32469a.getParentActivity(), this.f32469a, this.N, this.O);
                this.f32471c = niVar;
                if (this.M) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                r40 r40Var = this.f32470b;
                if (r40Var != null && r40Var.u()) {
                    r40 r40Var2 = this.f32470b;
                    Objects.requireNonNull(r40Var2);
                    jtVar = new jt(r40Var2, 1);
                } else {
                    jtVar = null;
                }
                niVar.M0 = i10;
                niVar.N0 = jtVar;
                niVar.O0 = false;
                fi fiVar = niVar.f31051u0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = niVar.f31005f0;
                if (fiVar == null || fiVar == chatAttachAlertPhotoLayout) {
                    niVar.f31049t1.setVisibility(8);
                }
                int i11 = niVar.M0;
                TextView textView = niVar.f31006f1;
                if (i11 == 2) {
                    textView.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
                } else {
                    textView.setText(LocaleController.getString(R.string.ChoosePhoto));
                }
                if (chatAttachAlertPhotoLayout != null) {
                    ni niVar2 = chatAttachAlertPhotoLayout.f28403b;
                    if (niVar2.M0 != 0 && !niVar2.B) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    chatAttachAlertPhotoLayout.f26262c1 = z10;
                }
                ni niVar3 = this.f32471c;
                niVar3.V1 = new n40(this);
                niVar3.Q = this;
            }
            int i12 = this.Q;
            if (i12 == 1) {
                this.f32471c.f31006f1.setText(LocaleController.formatString("SetPhotoFor", R.string.SetPhotoFor, this.H.first_name));
            } else if (i12 == 2) {
                this.f32471c.f31006f1.setText(LocaleController.formatString("SuggestPhotoFor", R.string.SuggestPhotoFor, this.H.first_name));
            }
        }
    }

    public final boolean g(Dialog dialog) {
        ni niVar = this.f32471c;
        if (niVar == null || dialog != niVar) {
            return false;
        }
        niVar.f31005f0.a0(false);
        this.f32471c.dismissInternal();
        this.f32471c.f31005f0.d0(true);
        return true;
    }

    public final boolean h() {
        if (this.v == null && this.f32477w == null && this.f32479y == null) {
            return false;
        }
        return true;
    }

    public final void i(int i10, int i11, Intent intent) {
        if (i11 == -1) {
            if (i10 != 0 && i10 != 2) {
                if (i10 == 13) {
                    this.f32469a.getParentActivity().overridePendingTransition(R.anim.alpha_in, R.anim.alpha_out);
                    PhotoViewer.t1().K2(null, this.f32469a, null);
                    p(this.f32473f, null, AndroidUtilities.getImageOrientation(this.f32473f), false);
                    AndroidUtilities.addMediaToGallery(this.f32473f);
                    this.f32473f = null;
                    return;
                } else if (i10 == 14) {
                    if (intent != null && intent.getData() != null) {
                        AndroidUtilities.runOnUIThread(new gt(15, this, intent.getData()));
                        return;
                    }
                    return;
                } else if (i10 == 15) {
                    q(this.f32473f, null, true);
                    AndroidUtilities.addMediaToGallery(this.f32473f);
                    this.f32473f = null;
                    return;
                } else {
                    return;
                }
            }
            f();
            ni niVar = this.f32471c;
            if (niVar != null) {
                niVar.f31005f0.g0(i10, intent, this.f32473f);
            }
            this.f32473f = null;
        }
    }

    public final void j() {
        ni niVar = this.f32471c;
        if (niVar != null) {
            niVar.x1();
        }
    }

    public final void k(int i10, String[] strArr, int[] iArr) {
        ni niVar = this.f32471c;
        if (niVar != null) {
            if (i10 == 17) {
                niVar.f31005f0.U(false);
                this.f32471c.f31005f0.Y();
            } else if (i10 == 4) {
                niVar.f31005f0.Y();
            }
        }
    }

    public final void l() {
        ni niVar = this.f32471c;
        if (niVar != null) {
            niVar.y1();
        }
    }

    public final void m() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f32469a;
        if (o2Var != null && o2Var.getParentActivity() != null) {
            try {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 23 && this.f32469a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    this.f32469a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                    return;
                }
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File generatePicturePath = AndroidUtilities.generatePicturePath();
                if (generatePicturePath != null) {
                    if (i10 >= 24) {
                        Activity parentActivity = this.f32469a.getParentActivity();
                        intent.putExtra("output", FileProvider.d(parentActivity, ApplicationLoader.getApplicationId() + ".provider", generatePicturePath));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(generatePicturePath));
                    }
                    this.f32473f = generatePicturePath.getAbsolutePath();
                }
                this.f32469a.startActivityForResult(intent, 13);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    public final void n() {
        int i10;
        org.telegram.ui.ActionBar.o2 o2Var = this.f32469a;
        if (o2Var == null) {
            return;
        }
        Activity parentActivity = o2Var.getParentActivity();
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
        if (this.M) {
            i10 = 3;
        } else {
            i10 = 1;
        }
        org.telegram.ui.hp0 hp0Var = new org.telegram.ui.hp0(i10, false, false, null);
        hp0Var.f38993x = this.F;
        hp0Var.R = new o40(this);
        this.f32469a.presentFragment(hp0Var);
    }

    public final void o(boolean z10, final Runnable runnable, DialogInterface.OnDismissListener onDismissListener, int i10) {
        org.telegram.ui.ActionBar.o2 o2Var = this.f32469a;
        if (o2Var != null && o2Var.getParentActivity() != null) {
            this.P = false;
            this.Q = i10;
            if (this.C) {
                org.telegram.ui.ActionBar.o2 o2Var2 = this.f32469a;
                if (o2Var2 != null && o2Var2.getParentActivity() != null) {
                    f();
                    ni niVar = this.f32471c;
                    niVar.Q1 = this.D;
                    niVar.J1(1, false);
                    this.f32471c.f31005f0.f0();
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 == 21 || i11 == 22) {
                        AndroidUtilities.hideKeyboard(this.f32469a.getFragmentView().findFocus());
                    }
                    this.f32471c.r1();
                    this.f32471c.setOnHideListener(onDismissListener);
                    int i12 = this.Q;
                    if (i12 != 0) {
                        this.f32471c.M = new q40(i12, this.H);
                    }
                    ni niVar2 = this.f32471c;
                    niVar2.getClass();
                    this.f32469a.showDialog(niVar2);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(this.f32469a.getParentActivity(), null, false, false);
            f3Var.fixNavigationBar();
            if (i10 == 1) {
                f3Var.title = LocaleController.formatString("SetPhotoFor", R.string.SetPhotoFor, this.H.first_name);
                f3Var.bigTitle = true;
            } else if (i10 == 2) {
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
            org.telegram.ui.b.h(R.drawable.msg_camera, 0, arrayList2, arrayList3);
            if (this.M) {
                arrayList.add(LocaleController.getString(R.string.ChooseRecordVideo));
                org.telegram.ui.b.h(R.drawable.msg_video, 4, arrayList2, arrayList3);
            }
            arrayList.add(LocaleController.getString(R.string.ChooseFromGallery));
            org.telegram.ui.b.h(R.drawable.msg_photos, 1, arrayList2, arrayList3);
            if (this.F) {
                arrayList.add(LocaleController.getString(R.string.ChooseFromSearch));
                org.telegram.ui.b.h(R.drawable.msg_search, 2, arrayList2, arrayList3);
            }
            if (z10) {
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
                    s40.a(s40.this, arrayList3, runnable, i14);
                }
            };
            f3Var.items = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
            f3Var.itemIcons = iArr;
            f3Var.onClickListener = onClickListener;
            f3Var.setOnHideListener(onDismissListener);
            this.f32469a.showDialog(f3Var);
            if (z10) {
                f3Var.setItemColor(arrayList.size() - 1, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23279p7, false));
            }
        }
    }

    public final void p(String str, String str2, Pair pair, boolean z10) {
        ArrayList arrayList = new ArrayList();
        MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, 0, 0L, str, ((Integer) pair.first).intValue(), false, 0, 0, 0L).setOrientation(pair);
        orientation.isVideo = z10;
        orientation.thumbPath = str2;
        arrayList.add(orientation);
        PhotoViewer.t1().K2(null, this.f32469a, null);
        PhotoViewer.t1().f2(arrayList, 0, 1, false, new p40(this, arrayList), null);
        PhotoViewer.t1().L = true;
    }

    public final void q(String str, String str2, boolean z10) {
        p(str, str2, new Pair(0, 0), z10);
    }

    public final void r() {
        if (this.f32469a == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.zp0 zp0Var = new org.telegram.ui.zp0(0, null, hashMap, arrayList, 1, false, null, this.N);
        zp0Var.f45290o0 = new m40(this, hashMap, arrayList);
        zp0Var.f0(1, false);
        zp0Var.f45287l0 = this.f32470b.getInitialSearchString();
        if (this.O) {
            this.f32469a.showAsSheet(zp0Var);
        } else {
            this.f32469a.presentFragment(zp0Var);
        }
    }

    public final void s(boolean z10, Bitmap bitmap, MessageObject messageObject) {
        TLRPC.VideoSize videoSize;
        if (bitmap != null) {
            this.J = null;
            this.I = null;
            this.f32479y = null;
            this.f32478x = null;
            if (messageObject == null) {
                videoSize = null;
            } else {
                videoSize = messageObject.emojiMarkup;
            }
            this.K = videoSize;
            this.h = ImageLoader.scaleAndSaveImage(bitmap, 800.0f, 800.0f, 80, false, 320, 320);
            TLRPC.PhotoSize scaleAndSaveImage = ImageLoader.scaleAndSaveImage(bitmap, 150.0f, 150.0f, 80, false, 150, 150);
            this.f32474n = scaleAndSaveImage;
            int i10 = this.d;
            if (scaleAndSaveImage != null) {
                try {
                    Bitmap decodeFile = BitmapFactory.decodeFile(FileLoader.getInstance(i10).getPathToAttach(this.f32474n, true).getAbsolutePath());
                    this.f32475r = decodeFile;
                    ImageLoader.getInstance().putImageToCache(new BitmapDrawable(decodeFile), this.f32474n.location.volume_id + "_" + this.f32474n.location.local_id + "@50_50", true);
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
                this.v = a4.w.l(this.h.location.local_id, ".jpg", sb2);
                if (this.G) {
                    if (messageObject != null && messageObject.videoEditedInfo != null) {
                        if (this.E && !MessagesController.getInstance(i10).uploadMarkupVideo) {
                            r40 r40Var = this.f32470b;
                            if (r40Var != null) {
                                r40Var.K(z10, true);
                            }
                            r40 r40Var2 = this.f32470b;
                            if (r40Var2 != null) {
                                r40Var2.Q(null, null, 0.0d, null, this.h, this.f32474n, this.f32476s, null);
                                this.f32470b.Q(null, null, this.L, this.f32478x, this.h, this.f32474n, this.f32476s, this.K);
                                d();
                                return;
                            }
                            return;
                        }
                        this.f32479y = messageObject;
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
                        r40 r40Var3 = this.f32470b;
                        if (r40Var3 != null) {
                            r40Var3.K(z10, true);
                        }
                        this.f32476s = true;
                    } else {
                        r40 r40Var4 = this.f32470b;
                        if (r40Var4 != null) {
                            r40Var4.K(z10, false);
                        }
                        this.f32476s = false;
                    }
                    NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
                    NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploadProgressChanged);
                    NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploadFailed);
                    if (this.v != null) {
                        FileLoader.getInstance(i10).uploadFile(this.v, false, true, 16777216);
                    }
                }
                r40 r40Var5 = this.f32470b;
                if (r40Var5 != null) {
                    r40Var5.Q(null, null, 0.0d, null, this.h, this.f32474n, this.f32476s, null);
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
            tL_message.f22413id = 0;
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
