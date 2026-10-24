package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
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
public final class c50 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.wp0 {
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
    public org.telegram.ui.ActionBar.o2 f25185a;
    public b50 f25186b;
    public ri f25187c;
    public String f25188f;
    public TLRPC.PhotoSize h;
    public TLRPC.PhotoSize f25189n;
    public Bitmap f25190r;
    public boolean f25191s;
    public String v;
    public String f25192w;
    public String f25193x;
    public MessageObject f25194y;
    public final int d = UserConfig.selectedAccount;
    public boolean G = true;
    public boolean J = true;
    public boolean K = true;
    public final ImageReceiver e = new ImageReceiver(null);

    public c50(int i10, boolean z10, boolean z11) {
        this.Q = z10;
        this.I = z11;
        this.V = i10;
    }

    public static void a(c50 c50Var, boolean z10, ArrayList arrayList) {
        MessageObject messageObject;
        Bitmap loadBitmap;
        ImageReceiver imageReceiver = c50Var.e;
        int i10 = c50Var.d;
        if (!arrayList.isEmpty()) {
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList.get(0);
            Bitmap bitmap = null;
            if ((sendingMediaInfo.isVideo || sendingMediaInfo.videoEditedInfo != null) && !sendingMediaInfo.isLivePhoto) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f20365id = 0;
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
                                c50Var.E = pathToAttach.getAbsolutePath();
                                if (!pathToAttach.exists()) {
                                    pathToAttach = FileLoader.getInstance(i10).getPathToAttach(closestPhotoSizeWithSize, false);
                                    if (!pathToAttach.exists()) {
                                        pathToAttach = null;
                                    }
                                }
                                if (pathToAttach != null) {
                                    loadBitmap = ImageLoader.loadBitmap(pathToAttach.getAbsolutePath(), null, 800.0f, 800.0f, true);
                                } else {
                                    NotificationCenter.getInstance(i10).addObserver(c50Var, NotificationCenter.fileLoaded);
                                    NotificationCenter.getInstance(i10).addObserver(c50Var, NotificationCenter.fileLoadFailed);
                                    c50Var.v = FileLoader.getAttachFileName(closestPhotoSizeWithSize.location);
                                    imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, sendingMediaInfo.searchImage.photo), null, null, "jpg", null, 1);
                                }
                            }
                            loadBitmap = null;
                        } else if (searchImage.imageUrl != null) {
                            File file = new File(FileLoader.getDirectory(4), Utilities.MD5(sendingMediaInfo.searchImage.imageUrl) + "." + ImageLoader.getHttpUrlExtension(sendingMediaInfo.searchImage.imageUrl, "jpg"));
                            c50Var.E = file.getAbsolutePath();
                            if (file.exists() && file.length() != 0) {
                                loadBitmap = ImageLoader.loadBitmap(file.getAbsolutePath(), null, 800.0f, 800.0f, true);
                            } else {
                                c50Var.v = sendingMediaInfo.searchImage.imageUrl;
                                NotificationCenter.getInstance(i10).addObserver(c50Var, NotificationCenter.httpFileDidLoad);
                                NotificationCenter.getInstance(i10).addObserver(c50Var, NotificationCenter.httpFileDidFailedLoad);
                                imageReceiver.setImage(sendingMediaInfo.searchImage.imageUrl, null, null, "jpg", 1L);
                            }
                        }
                    }
                    messageObject = null;
                }
                messageObject = null;
                bitmap = loadBitmap;
            }
            c50Var.r(z10, bitmap, messageObject);
        }
    }

    public final void b() {
        this.T = true;
        String str = this.v;
        int i10 = this.d;
        if (str != null) {
            FileLoader.getInstance(i10).cancelFileUpload(this.v, false);
        }
        if (this.f25192w != null) {
            FileLoader.getInstance(i10).cancelFileUpload(this.f25192w, false);
        }
        b50 b50Var = this.f25186b;
        if (b50Var != null) {
            b50Var.P();
        }
    }

    public final void c() {
        this.v = null;
        this.f25192w = null;
        this.f25193x = null;
        this.f25194y = null;
        if (this.F) {
            this.e.setImageBitmap((Drawable) null);
            this.f25185a = null;
            this.f25186b = null;
        }
    }

    public final void d() {
        this.T = false;
        if (this.v == null && this.f25192w == null && this.f25194y == null) {
            this.f25185a = null;
            this.f25186b = null;
        } else {
            this.F = true;
        }
        ri riVar = this.f25187c;
        if (riVar != null) {
            riVar.dismissInternal();
            this.f25187c.B1();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        b50 b50Var;
        org.telegram.ui.ActionBar.o2 o2Var;
        String str;
        int i12 = NotificationCenter.fileUploaded;
        int i13 = this.d;
        if (i10 != i12 && i10 != NotificationCenter.fileUploadFailed) {
            if (i10 == NotificationCenter.fileUploadProgressChanged) {
                String str2 = (String) objArr[0];
                if (this.f25194y != null) {
                    str = this.f25192w;
                } else {
                    str = this.v;
                }
                if (this.f25186b != null && str2.equals(str)) {
                    float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
                    b50 b50Var2 = this.f25186b;
                    this.W = min;
                    b50Var2.E(min);
                    return;
                }
                return;
            }
            int i14 = NotificationCenter.fileLoaded;
            if (i10 != i14 && i10 != NotificationCenter.fileLoadFailed && i10 != NotificationCenter.httpFileDidLoad && i10 != NotificationCenter.httpFileDidFailedLoad) {
                int i15 = NotificationCenter.filePreparingFailed;
                if (i10 == i15) {
                    if (((MessageObject) objArr[0]) == this.f25194y && this.f25185a != null) {
                        NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.filePreparingStarted);
                        NotificationCenter.getInstance(i13).removeObserver(this, i15);
                        NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
                        c();
                        return;
                    }
                    return;
                } else if (i10 == NotificationCenter.fileNewChunkAvailable) {
                    if (((MessageObject) objArr[0]) == this.f25194y && this.f25185a != null) {
                        String str3 = (String) objArr[1];
                        long longValue = ((Long) objArr[2]).longValue();
                        long longValue2 = ((Long) objArr[3]).longValue();
                        this.f25185a.getFileLoader().checkUploadNewDataAvailable(str3, false, longValue, longValue2);
                        if (longValue2 != 0) {
                            double longValue3 = ((Long) objArr[5]).longValue() / 1000000.0d;
                            if (this.P > longValue3) {
                                this.P = longValue3;
                            }
                            Bitmap createVideoThumbnailAtTime = SendMessagesHelper.createVideoThumbnailAtTime(str3, (long) (this.P * 1000.0d), null, true);
                            if (createVideoThumbnailAtTime != null) {
                                File pathToAttach = FileLoader.getInstance(i13).getPathToAttach(this.f25189n, true);
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
                                this.f25189n = scaleAndSaveImage;
                                if (scaleAndSaveImage != null) {
                                    try {
                                        Bitmap decodeFile = BitmapFactory.decodeFile(FileLoader.getInstance(i13).getPathToAttach(this.f25189n, true).getAbsolutePath());
                                        ImageLoader.getInstance().putImageToCache(new BitmapDrawable(decodeFile), this.f25189n.location.volume_id + "_" + this.f25189n.location.local_id + "@50_50", true);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.filePreparingStarted);
                            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.filePreparingFailed);
                            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
                            this.f25193x = str3;
                            this.f25192w = str3;
                            this.f25194y = null;
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == NotificationCenter.filePreparingStarted && ((MessageObject) objArr[0]) == this.f25194y && (o2Var = this.f25185a) != null) {
                    this.f25192w = (String) objArr[1];
                    o2Var.getFileLoader().uploadFile(this.f25192w, false, false, (int) this.f25194y.videoEditedInfo.estimatedSize, 33554432, false);
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
                    this.e.setImageBitmap((Drawable) null);
                    b50 b50Var3 = this.f25186b;
                    if (b50Var3 != null) {
                        b50Var3.P();
                        return;
                    }
                    return;
                }
                r(false, ImageLoader.loadBitmap(this.E, null, 800.0f, 800.0f, true), null);
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
        } else if (str4.equals(this.f25192w)) {
            this.f25192w = null;
            if (i10 == i12) {
                this.N = (TLRPC.InputFile) objArr[1];
            }
        } else {
            return;
        }
        if (this.v == null && this.f25192w == null && this.f25194y == null) {
            NotificationCenter.getInstance(i13).removeObserver(this, i12);
            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileUploadFailed);
            if (i10 == i12 && (b50Var = this.f25186b) != null) {
                b50Var.Q(this.M, this.N, this.P, this.f25193x, this.h, this.f25189n, this.f25191s, this.O);
            }
            c();
        }
    }

    public final void e() {
        int i10;
        xt xtVar;
        boolean z10;
        org.telegram.ui.ActionBar.o2 o2Var = this.f25185a;
        if (o2Var != null && o2Var.getParentActivity() != null) {
            if (this.f25187c == null) {
                ri riVar = new ri(this.f25185a.getParentActivity(), this.f25185a, this.R, this.S);
                this.f25187c = riVar;
                if (this.Q) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                b50 b50Var = this.f25186b;
                if (b50Var != null && b50Var.v()) {
                    b50 b50Var2 = this.f25186b;
                    Objects.requireNonNull(b50Var2);
                    xtVar = new xt(b50Var2, 1);
                } else {
                    xtVar = null;
                }
                riVar.T0 = i10;
                riVar.U0 = xtVar;
                riVar.V0 = false;
                ji jiVar = riVar.B0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = riVar.f30158j0;
                if (jiVar == null || jiVar == chatAttachAlertPhotoLayout) {
                    riVar.A1.setVisibility(8);
                }
                int i11 = riVar.T0;
                TextView textView = riVar.f30166m1;
                if (i11 == 2) {
                    textView.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
                } else {
                    textView.setText(LocaleController.getString(R.string.ChoosePhoto));
                }
                if (chatAttachAlertPhotoLayout != null) {
                    ri riVar2 = chatAttachAlertPhotoLayout.f27704b;
                    if (riVar2.T0 != 0 && !riVar2.F) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    chatAttachAlertPhotoLayout.f24241g1 = z10;
                }
                ri riVar3 = this.f25187c;
                riVar3.f30138c2 = new x40(this);
                riVar3.U = this;
            }
            int i12 = this.U;
            if (i12 == 1) {
                this.f25187c.f30166m1.setText(LocaleController.formatString("SetPhotoFor", R.string.SetPhotoFor, this.L.first_name));
            } else if (i12 == 2) {
                this.f25187c.f30166m1.setText(LocaleController.formatString("SuggestPhotoFor", R.string.SuggestPhotoFor, this.L.first_name));
            }
        }
    }

    public final boolean f(Dialog dialog) {
        ri riVar = this.f25187c;
        if (riVar == null || dialog != riVar) {
            return false;
        }
        riVar.f30158j0.a0(false);
        this.f25187c.dismissInternal();
        this.f25187c.f30158j0.d0(true);
        return true;
    }

    public final boolean g() {
        if (this.v == null && this.f25192w == null && this.f25194y == null) {
            return false;
        }
        return true;
    }

    public final void h(int i10, int i11, Intent intent) {
        if (i11 == -1) {
            if (i10 != 0 && i10 != 2) {
                if (i10 == 13) {
                    this.f25185a.getParentActivity().overridePendingTransition(R.anim.alpha_in, R.anim.alpha_out);
                    PhotoViewer.u1().M2(null, this.f25185a, null);
                    o(this.f25188f, null, AndroidUtilities.getImageOrientation(this.f25188f), false);
                    AndroidUtilities.addMediaToGallery(this.f25188f);
                    this.f25188f = null;
                    return;
                } else if (i10 == 14) {
                    if (intent != null && intent.getData() != null) {
                        AndroidUtilities.runOnUIThread(new wt(13, this, intent.getData()));
                        return;
                    }
                    return;
                } else if (i10 == 15) {
                    p(this.f25188f, null, true);
                    AndroidUtilities.addMediaToGallery(this.f25188f);
                    this.f25188f = null;
                    return;
                } else {
                    return;
                }
            }
            e();
            ri riVar = this.f25187c;
            if (riVar != null) {
                riVar.f30158j0.g0(i10, intent, this.f25188f);
            }
            this.f25188f = null;
        }
    }

    public final void i() {
        ri riVar = this.f25187c;
        if (riVar != null) {
            riVar.D1();
        }
    }

    public final void j(int i10, String[] strArr, int[] iArr) {
        ri riVar = this.f25187c;
        if (riVar != null) {
            if (i10 == 17) {
                riVar.f30158j0.U(false);
                this.f25187c.f30158j0.Y();
            } else if (i10 == 4) {
                riVar.f30158j0.Y();
            }
        }
    }

    public final void k() {
        ri riVar = this.f25187c;
        if (riVar != null) {
            riVar.E1();
        }
    }

    public final void l() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f25185a;
        if (o2Var != null && o2Var.getParentActivity() != null) {
            try {
                int i10 = Build.VERSION.SDK_INT;
                if (this.f25185a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    this.f25185a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                    return;
                }
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File generatePicturePath = AndroidUtilities.generatePicturePath();
                if (generatePicturePath != null) {
                    if (i10 >= 24) {
                        Activity parentActivity = this.f25185a.getParentActivity();
                        intent.putExtra("output", FileProvider.d(parentActivity, ApplicationLoader.getApplicationId() + ".provider", generatePicturePath));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(generatePicturePath));
                    }
                    this.f25188f = generatePicturePath.getAbsolutePath();
                }
                this.f25185a.startActivityForResult(intent, 13);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void m() {
        int i10;
        org.telegram.ui.ActionBar.o2 o2Var = this.f25185a;
        if (o2Var == null) {
            return;
        }
        Activity parentActivity = o2Var.getParentActivity();
        if (Build.VERSION.SDK_INT >= 33 && parentActivity != null) {
            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 151);
                return;
            }
        } else if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 151);
            return;
        }
        if (this.Q) {
            i10 = 3;
        } else {
            i10 = 1;
        }
        org.telegram.ui.up0 up0Var = new org.telegram.ui.up0(i10, false, false, null);
        up0Var.f42471x = this.J;
        up0Var.V = new y40(this);
        this.f25185a.presentFragment(up0Var);
    }

    public final void n(boolean z10, final Runnable runnable, DialogInterface.OnDismissListener onDismissListener, int i10) {
        org.telegram.ui.ActionBar.z2 z2Var;
        org.telegram.ui.ActionBar.o2 o2Var = this.f25185a;
        if (o2Var != null && o2Var.getParentActivity() != null) {
            this.T = false;
            this.U = i10;
            if (this.G) {
                org.telegram.ui.ActionBar.o2 o2Var2 = this.f25185a;
                if (o2Var2 != null && o2Var2.getParentActivity() != null) {
                    e();
                    ri riVar = this.f25187c;
                    riVar.X1 = this.H;
                    riVar.R1(1, false);
                    this.f25187c.f30158j0.f0();
                    this.f25187c.w1();
                    this.f25187c.setOnHideListener(onDismissListener);
                    int i11 = this.U;
                    if (i11 != 0) {
                        this.f25187c.Q = new a50(i11, this.L);
                    }
                    ri riVar2 = this.f25187c;
                    riVar2.getClass();
                    this.f25185a.showDialog(riVar2);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) this.f25185a.getParentActivity(), (org.telegram.ui.ActionBar.g6) null, false);
            h3Var.fixNavigationBar();
            if (i10 == 1) {
                h3Var.title = LocaleController.formatString("SetPhotoFor", R.string.SetPhotoFor, this.L.first_name);
                h3Var.bigTitle = true;
            } else if (i10 == 2) {
                h3Var.title = LocaleController.formatString("SuggestPhotoFor", R.string.SuggestPhotoFor, this.L.first_name);
                h3Var.bigTitle = true;
            } else {
                h3Var.title = LocaleController.getString(R.string.ChoosePhoto);
                h3Var.bigTitle = true;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            final ArrayList arrayList3 = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.ChooseTakePhoto));
            org.telegram.ui.Cells.b1.n(R.drawable.msg_camera, 0, arrayList2, arrayList3);
            if (this.Q) {
                arrayList.add(LocaleController.getString(R.string.ChooseRecordVideo));
                org.telegram.ui.Cells.b1.n(R.drawable.msg_video, 4, arrayList2, arrayList3);
            }
            arrayList.add(LocaleController.getString(R.string.ChooseFromGallery));
            org.telegram.ui.Cells.b1.n(R.drawable.msg_photos, 1, arrayList2, arrayList3);
            if (this.J) {
                arrayList.add(LocaleController.getString(R.string.ChooseFromSearch));
                org.telegram.ui.Cells.b1.n(R.drawable.msg_search, 2, arrayList2, arrayList3);
            }
            if (z10) {
                arrayList.add(LocaleController.getString(R.string.DeletePhoto));
                org.telegram.ui.Cells.b1.n(R.drawable.msg_delete, 3, arrayList2, arrayList3);
            }
            int[] iArr = new int[arrayList2.size()];
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                iArr[i12] = ((Integer) arrayList2.get(i12)).intValue();
            }
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i13) {
                    org.telegram.ui.ActionBar.o2 o2Var3;
                    c50 c50Var = c50.this;
                    c50Var.getClass();
                    int intValue = ((Integer) arrayList3.get(i13)).intValue();
                    if (intValue != 0) {
                        if (intValue != 1) {
                            if (intValue != 2) {
                                if (intValue != 3) {
                                    if (intValue == 4 && (o2Var3 = c50Var.f25185a) != null && o2Var3.getParentActivity() != null) {
                                        try {
                                            int i14 = Build.VERSION.SDK_INT;
                                            if (c50Var.f25185a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                                c50Var.f25185a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                                                return;
                                            }
                                            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                                            File generateVideoPath = AndroidUtilities.generateVideoPath();
                                            if (generateVideoPath != null) {
                                                if (i14 >= 24) {
                                                    Activity parentActivity = c50Var.f25185a.getParentActivity();
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
                                                c50Var.f25188f = generateVideoPath.getAbsolutePath();
                                            }
                                            c50Var.f25185a.startActivityForResult(intent, 15);
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
                            c50Var.q();
                            return;
                        }
                        c50Var.m();
                        return;
                    }
                    c50Var.l();
                }
            };
            h3Var.items = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
            h3Var.itemIcons = iArr;
            h3Var.onClickListener = onClickListener;
            h3Var.setOnHideListener(onDismissListener);
            this.f25185a.showDialog(h3Var);
            if (z10) {
                int i13 = org.telegram.ui.ActionBar.k6.f21422q7;
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, i13, false);
                int i14 = org.telegram.ui.ActionBar.k6.f21405p7;
                h3Var.setItemColor(arrayList.size() - 1, x02, org.telegram.ui.ActionBar.k6.x0(null, i14, false));
                int size2 = arrayList.size() - 1;
                if (size2 >= 0 && size2 < h3Var.getItemViews().size() && (z2Var = h3Var.getItemViews().get(size2)) != null && z2Var.getTextView() != null && z2Var.getImageView() != null) {
                    org.telegram.ui.ActionBar.r6.W(z2Var.getTextView(), i13, null);
                    org.telegram.ui.ActionBar.r6.t(z2Var.getImageView(), i14, null, PorterDuff.Mode.MULTIPLY);
                }
            }
        }
    }

    public final void o(String str, String str2, Pair pair, boolean z10) {
        ArrayList arrayList = new ArrayList();
        MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, 0, 0L, str, ((Integer) pair.first).intValue(), false, 0, 0, 0L).setOrientation(pair);
        orientation.isVideo = z10;
        orientation.thumbPath = str2;
        arrayList.add(orientation);
        PhotoViewer.u1().M2(null, this.f25185a, null);
        PhotoViewer.u1().i2(arrayList, 0, 1, false, new z40(this, arrayList), null);
        PhotoViewer.u1().P = true;
    }

    public final void p(String str, String str2, boolean z10) {
        o(str, str2, new Pair(0, 0), z10);
    }

    public final void q() {
        if (this.f25185a == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.lq0 lq0Var = new org.telegram.ui.lq0(0, null, hashMap, arrayList, 1, false, null, this.R);
        lq0Var.f39357s0 = new w40(this, hashMap, arrayList);
        lq0Var.f0(1, false);
        lq0Var.f39352p0 = this.f25186b.getInitialSearchString();
        if (this.S) {
            this.f25185a.showAsSheet(lq0Var);
        } else {
            this.f25185a.presentFragment(lq0Var);
        }
    }

    public final void r(boolean z10, Bitmap bitmap, MessageObject messageObject) {
        TLRPC.VideoSize videoSize;
        if (bitmap != null) {
            this.N = null;
            this.M = null;
            this.f25194y = null;
            this.f25193x = null;
            if (messageObject == null) {
                videoSize = null;
            } else {
                videoSize = messageObject.emojiMarkup;
            }
            this.O = videoSize;
            this.h = ImageLoader.scaleAndSaveImage(bitmap, 800.0f, 800.0f, 80, false, 320, 320);
            TLRPC.PhotoSize scaleAndSaveImage = ImageLoader.scaleAndSaveImage(bitmap, 150.0f, 150.0f, 80, false, 150, 150);
            this.f25189n = scaleAndSaveImage;
            int i10 = this.d;
            if (scaleAndSaveImage != null) {
                try {
                    Bitmap decodeFile = BitmapFactory.decodeFile(FileLoader.getInstance(i10).getPathToAttach(this.f25189n, true).getAbsolutePath());
                    this.f25190r = decodeFile;
                    ImageLoader.getInstance().putImageToCache(new BitmapDrawable(decodeFile), this.f25189n.location.volume_id + "_" + this.f25189n.location.local_id + "@50_50", true);
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
                this.v = a1.g.n(this.h.location.local_id, ".jpg", sb2);
                if (this.K) {
                    if (messageObject != null && messageObject.videoEditedInfo != null) {
                        if (this.I && !MessagesController.getInstance(i10).uploadMarkupVideo) {
                            b50 b50Var = this.f25186b;
                            if (b50Var != null) {
                                b50Var.K(z10, true);
                            }
                            b50 b50Var2 = this.f25186b;
                            if (b50Var2 != null) {
                                b50Var2.Q(null, null, 0.0d, null, this.h, this.f25189n, this.f25191s, null);
                                this.f25186b.Q(null, null, this.P, this.f25193x, this.h, this.f25189n, this.f25191s, this.O);
                                c();
                                return;
                            }
                            return;
                        }
                        this.f25194y = messageObject;
                        VideoEditedInfo videoEditedInfo = messageObject.videoEditedInfo;
                        long j10 = videoEditedInfo.startTime;
                        if (j10 < 0) {
                            j10 = 0;
                        }
                        this.P = (videoEditedInfo.avatarStartTime - j10) / 1000000.0d;
                        videoEditedInfo.shouldLimitFps = false;
                        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingStarted);
                        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingFailed);
                        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileNewChunkAvailable);
                        MediaController.getInstance().scheduleVideoConvert(messageObject, true, true, false);
                        this.v = null;
                        b50 b50Var3 = this.f25186b;
                        if (b50Var3 != null) {
                            b50Var3.K(z10, true);
                        }
                        this.f25191s = true;
                    } else {
                        b50 b50Var4 = this.f25186b;
                        if (b50Var4 != null) {
                            b50Var4.K(z10, false);
                        }
                        this.f25191s = false;
                    }
                    NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
                    NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploadProgressChanged);
                    NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploadFailed);
                    if (this.v != null) {
                        FileLoader.getInstance(i10).uploadFile(this.v, false, true, 16777216);
                    }
                }
                b50 b50Var5 = this.f25186b;
                if (b50Var5 != null) {
                    b50Var5.Q(null, null, 0.0d, null, this.h, this.f25189n, this.f25191s, null);
                }
            }
        }
    }

    public final void s(MediaController.PhotoEntry photoEntry) {
        Bitmap loadBitmap;
        String str = photoEntry.imagePath;
        if (str == null) {
            str = photoEntry.path;
        }
        MessageObject messageObject = null;
        if ((photoEntry.isVideo || photoEntry.editedInfo != null) && !photoEntry.isLivePhoto()) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f20365id = 0;
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
        r(false, loadBitmap, messageObject);
    }
}
