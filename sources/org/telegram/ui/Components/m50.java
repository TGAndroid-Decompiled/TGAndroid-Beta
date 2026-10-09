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
public final class m50 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.mq0 {
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
    public org.telegram.ui.ActionBar.n2 f28682a;
    public l50 f28683b;
    public yi f28684c;
    public String f28686f;
    public TLRPC.PhotoSize h;
    public TLRPC.PhotoSize f28687n;
    public Bitmap f28688r;
    public boolean f28689s;
    public String v;
    public String f28690w;
    public String f28691x;
    public MessageObject f28692y;
    public final int d = UserConfig.selectedAccount;
    public boolean G = true;
    public boolean J = true;
    public boolean K = true;
    public final ImageReceiver f28685e = new ImageReceiver(null);

    public m50(int i10, boolean z10, boolean z11) {
        this.Q = z10;
        this.I = z11;
        this.V = i10;
    }

    public static void a(m50 m50Var, boolean z10, ArrayList arrayList) {
        MessageObject messageObject;
        Bitmap loadBitmap;
        ImageReceiver imageReceiver = m50Var.f28685e;
        int i10 = m50Var.d;
        if (!arrayList.isEmpty()) {
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList.get(0);
            Bitmap bitmap = null;
            if ((sendingMediaInfo.isVideo || sendingMediaInfo.videoEditedInfo != null) && !sendingMediaInfo.isLivePhoto) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f20059id = 0;
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
                                m50Var.E = pathToAttach.getAbsolutePath();
                                if (!pathToAttach.exists()) {
                                    pathToAttach = FileLoader.getInstance(i10).getPathToAttach(closestPhotoSizeWithSize, false);
                                    if (!pathToAttach.exists()) {
                                        pathToAttach = null;
                                    }
                                }
                                if (pathToAttach != null) {
                                    loadBitmap = ImageLoader.loadBitmap(pathToAttach.getAbsolutePath(), null, 800.0f, 800.0f, true);
                                } else {
                                    NotificationCenter.getInstance(i10).addObserver(m50Var, NotificationCenter.fileLoaded);
                                    NotificationCenter.getInstance(i10).addObserver(m50Var, NotificationCenter.fileLoadFailed);
                                    m50Var.v = FileLoader.getAttachFileName(closestPhotoSizeWithSize.location);
                                    imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, sendingMediaInfo.searchImage.photo), null, null, "jpg", null, 1);
                                }
                            }
                            loadBitmap = null;
                        } else if (searchImage.imageUrl != null) {
                            File file = new File(FileLoader.getDirectory(4), Utilities.MD5(sendingMediaInfo.searchImage.imageUrl) + "." + ImageLoader.getHttpUrlExtension(sendingMediaInfo.searchImage.imageUrl, "jpg"));
                            m50Var.E = file.getAbsolutePath();
                            if (file.exists() && file.length() != 0) {
                                loadBitmap = ImageLoader.loadBitmap(file.getAbsolutePath(), null, 800.0f, 800.0f, true);
                            } else {
                                m50Var.v = sendingMediaInfo.searchImage.imageUrl;
                                NotificationCenter.getInstance(i10).addObserver(m50Var, NotificationCenter.httpFileDidLoad);
                                NotificationCenter.getInstance(i10).addObserver(m50Var, NotificationCenter.httpFileDidFailedLoad);
                                imageReceiver.setImage(sendingMediaInfo.searchImage.imageUrl, null, null, "jpg", 1L);
                            }
                        }
                    }
                    messageObject = null;
                }
                messageObject = null;
                bitmap = loadBitmap;
            }
            m50Var.r(z10, bitmap, messageObject);
        }
    }

    public final void b() {
        this.T = true;
        String str = this.v;
        int i10 = this.d;
        if (str != null) {
            FileLoader.getInstance(i10).cancelFileUpload(this.v, false);
        }
        if (this.f28690w != null) {
            FileLoader.getInstance(i10).cancelFileUpload(this.f28690w, false);
        }
        l50 l50Var = this.f28683b;
        if (l50Var != null) {
            l50Var.P();
        }
    }

    public final void c() {
        this.v = null;
        this.f28690w = null;
        this.f28691x = null;
        this.f28692y = null;
        if (this.F) {
            this.f28685e.setImageBitmap((Drawable) null);
            this.f28682a = null;
            this.f28683b = null;
        }
    }

    public final void d() {
        this.T = false;
        if (this.v == null && this.f28690w == null && this.f28692y == null) {
            this.f28682a = null;
            this.f28683b = null;
        } else {
            this.F = true;
        }
        yi yiVar = this.f28684c;
        if (yiVar != null) {
            yiVar.dismissInternal();
            this.f28684c.y1();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        l50 l50Var;
        org.telegram.ui.ActionBar.n2 n2Var;
        String str;
        int i12 = NotificationCenter.fileUploaded;
        int i13 = this.d;
        if (i10 != i12 && i10 != NotificationCenter.fileUploadFailed) {
            if (i10 == NotificationCenter.fileUploadProgressChanged) {
                String str2 = (String) objArr[0];
                if (this.f28692y != null) {
                    str = this.f28690w;
                } else {
                    str = this.v;
                }
                if (this.f28683b != null && str2.equals(str)) {
                    float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
                    l50 l50Var2 = this.f28683b;
                    this.W = min;
                    l50Var2.D(min);
                    return;
                }
                return;
            }
            int i14 = NotificationCenter.fileLoaded;
            if (i10 != i14 && i10 != NotificationCenter.fileLoadFailed && i10 != NotificationCenter.httpFileDidLoad && i10 != NotificationCenter.httpFileDidFailedLoad) {
                int i15 = NotificationCenter.filePreparingFailed;
                if (i10 == i15) {
                    if (((MessageObject) objArr[0]) == this.f28692y && this.f28682a != null) {
                        NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.filePreparingStarted);
                        NotificationCenter.getInstance(i13).removeObserver(this, i15);
                        NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
                        c();
                        return;
                    }
                    return;
                } else if (i10 == NotificationCenter.fileNewChunkAvailable) {
                    if (((MessageObject) objArr[0]) == this.f28692y && this.f28682a != null) {
                        String str3 = (String) objArr[1];
                        long longValue = ((Long) objArr[2]).longValue();
                        long longValue2 = ((Long) objArr[3]).longValue();
                        this.f28682a.getFileLoader().checkUploadNewDataAvailable(str3, false, longValue, longValue2);
                        if (longValue2 != 0) {
                            double longValue3 = ((Long) objArr[5]).longValue() / 1000000.0d;
                            if (this.P > longValue3) {
                                this.P = longValue3;
                            }
                            Bitmap createVideoThumbnailAtTime = SendMessagesHelper.createVideoThumbnailAtTime(str3, (long) (this.P * 1000.0d), null, true);
                            if (createVideoThumbnailAtTime != null) {
                                File pathToAttach = FileLoader.getInstance(i13).getPathToAttach(this.f28687n, true);
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
                                this.f28687n = scaleAndSaveImage;
                                if (scaleAndSaveImage != null) {
                                    try {
                                        Bitmap decodeFile = BitmapFactory.decodeFile(FileLoader.getInstance(i13).getPathToAttach(this.f28687n, true).getAbsolutePath());
                                        ImageLoader.getInstance().putImageToCache(new BitmapDrawable(decodeFile), this.f28687n.location.volume_id + "_" + this.f28687n.location.local_id + "@50_50", true);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.filePreparingStarted);
                            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.filePreparingFailed);
                            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
                            this.f28691x = str3;
                            this.f28690w = str3;
                            this.f28692y = null;
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == NotificationCenter.filePreparingStarted && ((MessageObject) objArr[0]) == this.f28692y && (n2Var = this.f28682a) != null) {
                    this.f28690w = (String) objArr[1];
                    n2Var.getFileLoader().uploadFile(this.f28690w, false, false, (int) this.f28692y.videoEditedInfo.estimatedSize, 33554432, false);
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
                    this.f28685e.setImageBitmap((Drawable) null);
                    l50 l50Var3 = this.f28683b;
                    if (l50Var3 != null) {
                        l50Var3.P();
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
        } else if (str4.equals(this.f28690w)) {
            this.f28690w = null;
            if (i10 == i12) {
                this.N = (TLRPC.InputFile) objArr[1];
            }
        } else {
            return;
        }
        if (this.v == null && this.f28690w == null && this.f28692y == null) {
            NotificationCenter.getInstance(i13).removeObserver(this, i12);
            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileUploadFailed);
            if (i10 == i12 && (l50Var = this.f28683b) != null) {
                l50Var.Q(this.M, this.N, this.P, this.f28691x, this.h, this.f28687n, this.f28689s, this.O);
            }
            c();
        }
    }

    public final void e() {
        int i10;
        gu guVar;
        boolean z10;
        org.telegram.ui.ActionBar.n2 n2Var = this.f28682a;
        if (n2Var != null && n2Var.getParentActivity() != null) {
            if (this.f28684c == null) {
                yi yiVar = new yi(this.f28682a.getParentActivity(), this.f28682a, this.R, this.S);
                this.f28684c = yiVar;
                if (this.Q) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                l50 l50Var = this.f28683b;
                if (l50Var != null && l50Var.u()) {
                    l50 l50Var2 = this.f28683b;
                    Objects.requireNonNull(l50Var2);
                    guVar = new gu(l50Var2, 1);
                } else {
                    guVar = null;
                }
                yiVar.T0 = i10;
                yiVar.U0 = guVar;
                yiVar.V0 = false;
                qi qiVar = yiVar.B0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = yiVar.f33240j0;
                if (qiVar == null || qiVar == chatAttachAlertPhotoLayout) {
                    yiVar.A1.setVisibility(8);
                }
                int i11 = yiVar.T0;
                TextView textView = yiVar.f33248m1;
                if (i11 == 2) {
                    textView.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
                } else {
                    textView.setText(LocaleController.getString(R.string.ChoosePhoto));
                }
                if (chatAttachAlertPhotoLayout != null) {
                    yi yiVar2 = chatAttachAlertPhotoLayout.f30173b;
                    if (yiVar2.T0 != 0 && !yiVar2.F) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    chatAttachAlertPhotoLayout.f24039g1 = z10;
                }
                yi yiVar3 = this.f28684c;
                yiVar3.f33219c2 = new h50(this);
                yiVar3.U = this;
            }
            int i12 = this.U;
            if (i12 == 1) {
                this.f28684c.f33248m1.setText(LocaleController.formatString("SetPhotoFor", R.string.SetPhotoFor, this.L.first_name));
            } else if (i12 == 2) {
                this.f28684c.f33248m1.setText(LocaleController.formatString("SuggestPhotoFor", R.string.SuggestPhotoFor, this.L.first_name));
            }
        }
    }

    public final boolean f(Dialog dialog) {
        yi yiVar = this.f28684c;
        if (yiVar == null || dialog != yiVar) {
            return false;
        }
        yiVar.f33240j0.a0(false);
        this.f28684c.dismissInternal();
        this.f28684c.f33240j0.d0(true);
        return true;
    }

    public final boolean g() {
        if (this.v == null && this.f28690w == null && this.f28692y == null) {
            return false;
        }
        return true;
    }

    public final void h(int i10, int i11, Intent intent) {
        if (i11 == -1) {
            if (i10 != 0 && i10 != 2) {
                if (i10 == 13) {
                    this.f28682a.getParentActivity().overridePendingTransition(R.anim.alpha_in, R.anim.alpha_out);
                    PhotoViewer.t1().K2(null, this.f28682a, null);
                    o(this.f28686f, null, AndroidUtilities.getImageOrientation(this.f28686f), false);
                    AndroidUtilities.addMediaToGallery(this.f28686f);
                    this.f28686f = null;
                    return;
                } else if (i10 == 14) {
                    if (intent != null && intent.getData() != null) {
                        AndroidUtilities.runOnUIThread(new zr(18, this, intent.getData()));
                        return;
                    }
                    return;
                } else if (i10 == 15) {
                    p(this.f28686f, null, true);
                    AndroidUtilities.addMediaToGallery(this.f28686f);
                    this.f28686f = null;
                    return;
                } else {
                    return;
                }
            }
            e();
            yi yiVar = this.f28684c;
            if (yiVar != null) {
                yiVar.f33240j0.g0(i10, intent, this.f28686f);
            }
            this.f28686f = null;
        }
    }

    public final void i() {
        yi yiVar = this.f28684c;
        if (yiVar != null) {
            yiVar.A1();
        }
    }

    public final void j(int i10, String[] strArr, int[] iArr) {
        yi yiVar = this.f28684c;
        if (yiVar != null) {
            if (i10 == 17) {
                yiVar.f33240j0.U(false);
                this.f28684c.f33240j0.Y();
            } else if (i10 == 4) {
                yiVar.f33240j0.Y();
            }
        }
    }

    public final void k() {
        yi yiVar = this.f28684c;
        if (yiVar != null) {
            yiVar.B1();
        }
    }

    public final void l() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f28682a;
        if (n2Var != null && n2Var.getParentActivity() != null) {
            try {
                int i10 = Build.VERSION.SDK_INT;
                if (this.f28682a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    this.f28682a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                    return;
                }
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File generatePicturePath = AndroidUtilities.generatePicturePath();
                if (generatePicturePath != null) {
                    if (i10 >= 24) {
                        Activity parentActivity = this.f28682a.getParentActivity();
                        intent.putExtra("output", FileProvider.d(parentActivity, ApplicationLoader.getApplicationId() + ".provider", generatePicturePath));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(generatePicturePath));
                    }
                    this.f28686f = generatePicturePath.getAbsolutePath();
                }
                this.f28682a.startActivityForResult(intent, 13);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    public final void m() {
        int i10;
        org.telegram.ui.ActionBar.n2 n2Var = this.f28682a;
        if (n2Var == null) {
            return;
        }
        Activity parentActivity = n2Var.getParentActivity();
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
        org.telegram.ui.kq0 kq0Var = new org.telegram.ui.kq0(i10, false, false, null);
        kq0Var.f39336x = this.J;
        kq0Var.V = new i50(this);
        this.f28682a.presentFragment(kq0Var);
    }

    public final void n(boolean z10, final Runnable runnable, DialogInterface.OnDismissListener onDismissListener, int i10) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f28682a;
        if (n2Var != null && n2Var.getParentActivity() != null) {
            this.T = false;
            this.U = i10;
            if (this.G) {
                org.telegram.ui.ActionBar.n2 n2Var2 = this.f28682a;
                if (n2Var2 != null && n2Var2.getParentActivity() != null) {
                    e();
                    yi yiVar = this.f28684c;
                    yiVar.X1 = this.H;
                    yiVar.N1(1, false);
                    this.f28684c.f33240j0.f0();
                    this.f28684c.t1();
                    this.f28684c.setOnHideListener(onDismissListener);
                    int i11 = this.U;
                    if (i11 != 0) {
                        this.f28684c.Q = new k50(i11, this.L);
                    }
                    yi yiVar2 = this.f28684c;
                    yiVar2.getClass();
                    this.f28682a.showDialog(yiVar2);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) this.f28682a.getParentActivity(), (org.telegram.ui.ActionBar.e6) null, false);
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
            org.telegram.ui.Cells.c1.k(R.drawable.msg_camera, 0, arrayList2, arrayList3);
            if (this.Q) {
                arrayList.add(LocaleController.getString(R.string.ChooseRecordVideo));
                org.telegram.ui.Cells.c1.k(R.drawable.msg_video, 4, arrayList2, arrayList3);
            }
            arrayList.add(LocaleController.getString(R.string.ChooseFromGallery));
            org.telegram.ui.Cells.c1.k(R.drawable.msg_photos, 1, arrayList2, arrayList3);
            if (this.J) {
                arrayList.add(LocaleController.getString(R.string.ChooseFromSearch));
                org.telegram.ui.Cells.c1.k(R.drawable.msg_search, 2, arrayList2, arrayList3);
            }
            if (z10) {
                arrayList.add(LocaleController.getString(R.string.DeletePhoto));
                org.telegram.ui.Cells.c1.k(R.drawable.msg_delete, 3, arrayList2, arrayList3);
            }
            int[] iArr = new int[arrayList2.size()];
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                iArr[i12] = ((Integer) arrayList2.get(i12)).intValue();
            }
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i13) {
                    org.telegram.ui.ActionBar.n2 n2Var3;
                    m50 m50Var = m50.this;
                    m50Var.getClass();
                    int intValue = ((Integer) arrayList3.get(i13)).intValue();
                    if (intValue != 0) {
                        if (intValue != 1) {
                            if (intValue != 2) {
                                if (intValue != 3) {
                                    if (intValue == 4 && (n2Var3 = m50Var.f28682a) != null && n2Var3.getParentActivity() != null) {
                                        try {
                                            int i14 = Build.VERSION.SDK_INT;
                                            if (m50Var.f28682a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                                m50Var.f28682a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                                                return;
                                            }
                                            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                                            File generateVideoPath = AndroidUtilities.generateVideoPath();
                                            if (generateVideoPath != null) {
                                                if (i14 >= 24) {
                                                    Activity parentActivity = m50Var.f28682a.getParentActivity();
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
                                                m50Var.f28686f = generateVideoPath.getAbsolutePath();
                                            }
                                            m50Var.f28682a.startActivityForResult(intent, 15);
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
                            m50Var.q();
                            return;
                        }
                        m50Var.m();
                        return;
                    }
                    m50Var.l();
                }
            };
            f3Var.items = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
            f3Var.itemIcons = iArr;
            f3Var.onClickListener = onClickListener;
            f3Var.setOnHideListener(onDismissListener);
            this.f28682a.showDialog(f3Var);
            if (z10) {
                f3Var.setItemColor(arrayList.size() - 1, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21037q7, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21018p7, false));
            }
        }
    }

    public final void o(String str, String str2, Pair pair, boolean z10) {
        ArrayList arrayList = new ArrayList();
        MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, 0, 0L, str, ((Integer) pair.first).intValue(), false, 0, 0, 0L).setOrientation(pair);
        orientation.isVideo = z10;
        orientation.thumbPath = str2;
        arrayList.add(orientation);
        PhotoViewer.t1().K2(null, this.f28682a, null);
        PhotoViewer.t1().g2(arrayList, 0, 1, false, new j50(this, arrayList), null);
        PhotoViewer.t1().P = true;
    }

    public final void p(String str, String str2, boolean z10) {
        o(str, str2, new Pair(0, 0), z10);
    }

    public final void q() {
        if (this.f28682a == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.br0 br0Var = new org.telegram.ui.br0(0, null, hashMap, arrayList, 1, false, null, this.R);
        br0Var.f36412s0 = new g50(this, hashMap, arrayList);
        br0Var.f0(1, false);
        br0Var.f36407p0 = this.f28683b.getInitialSearchString();
        if (this.S) {
            this.f28682a.showAsSheet(br0Var);
        } else {
            this.f28682a.presentFragment(br0Var);
        }
    }

    public final void r(boolean z10, Bitmap bitmap, MessageObject messageObject) {
        TLRPC.VideoSize videoSize;
        if (bitmap != null) {
            this.N = null;
            this.M = null;
            this.f28692y = null;
            this.f28691x = null;
            if (messageObject == null) {
                videoSize = null;
            } else {
                videoSize = messageObject.emojiMarkup;
            }
            this.O = videoSize;
            this.h = ImageLoader.scaleAndSaveImage(bitmap, 800.0f, 800.0f, 80, false, 320, 320);
            TLRPC.PhotoSize scaleAndSaveImage = ImageLoader.scaleAndSaveImage(bitmap, 150.0f, 150.0f, 80, false, 150, 150);
            this.f28687n = scaleAndSaveImage;
            int i10 = this.d;
            if (scaleAndSaveImage != null) {
                try {
                    Bitmap decodeFile = BitmapFactory.decodeFile(FileLoader.getInstance(i10).getPathToAttach(this.f28687n, true).getAbsolutePath());
                    this.f28688r = decodeFile;
                    ImageLoader.getInstance().putImageToCache(new BitmapDrawable(decodeFile), this.f28687n.location.volume_id + "_" + this.f28687n.location.local_id + "@50_50", true);
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
                this.v = a1.g.o(this.h.location.local_id, ".jpg", sb2);
                if (this.K) {
                    if (messageObject != null && messageObject.videoEditedInfo != null) {
                        if (this.I && !MessagesController.getInstance(i10).uploadMarkupVideo) {
                            l50 l50Var = this.f28683b;
                            if (l50Var != null) {
                                l50Var.L(z10, true);
                            }
                            l50 l50Var2 = this.f28683b;
                            if (l50Var2 != null) {
                                l50Var2.Q(null, null, 0.0d, null, this.h, this.f28687n, this.f28689s, null);
                                this.f28683b.Q(null, null, this.P, this.f28691x, this.h, this.f28687n, this.f28689s, this.O);
                                c();
                                return;
                            }
                            return;
                        }
                        this.f28692y = messageObject;
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
                        l50 l50Var3 = this.f28683b;
                        if (l50Var3 != null) {
                            l50Var3.L(z10, true);
                        }
                        this.f28689s = true;
                    } else {
                        l50 l50Var4 = this.f28683b;
                        if (l50Var4 != null) {
                            l50Var4.L(z10, false);
                        }
                        this.f28689s = false;
                    }
                    NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
                    NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploadProgressChanged);
                    NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploadFailed);
                    if (this.v != null) {
                        FileLoader.getInstance(i10).uploadFile(this.v, false, true, 16777216);
                    }
                }
                l50 l50Var5 = this.f28683b;
                if (l50Var5 != null) {
                    l50Var5.Q(null, null, 0.0d, null, this.h, this.f28687n, this.f28689s, null);
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
            tL_message.f20059id = 0;
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
