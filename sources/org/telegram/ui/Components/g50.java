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
public final class g50 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.eq0 {
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
    public org.telegram.ui.ActionBar.r2 f28388a;
    public f50 f28389b;
    public ti f28390c;
    public String f28391f;
    public TLRPC.PhotoSize h;
    public TLRPC.PhotoSize f28392n;
    public Bitmap f28393r;
    public boolean f28394s;
    public String v;
    public String f28395w;
    public String f28396x;
    public MessageObject f28397y;
    public final int d = UserConfig.selectedAccount;
    public boolean G = true;
    public boolean J = true;
    public boolean K = true;
    public final ImageReceiver e = new ImageReceiver(null);

    public g50(int i10, boolean z10, boolean z11) {
        this.Q = z10;
        this.I = z11;
        this.V = i10;
    }

    public static void a(g50 g50Var, boolean z10, ArrayList arrayList) {
        MessageObject messageObject;
        Bitmap loadBitmap;
        ImageReceiver imageReceiver = g50Var.e;
        int i10 = g50Var.d;
        if (!arrayList.isEmpty()) {
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList.get(0);
            Bitmap bitmap = null;
            if ((sendingMediaInfo.isVideo || sendingMediaInfo.videoEditedInfo != null) && !sendingMediaInfo.isLivePhoto) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f22049id = 0;
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
                                g50Var.E = pathToAttach.getAbsolutePath();
                                if (!pathToAttach.exists()) {
                                    pathToAttach = FileLoader.getInstance(i10).getPathToAttach(closestPhotoSizeWithSize, false);
                                    if (!pathToAttach.exists()) {
                                        pathToAttach = null;
                                    }
                                }
                                if (pathToAttach != null) {
                                    loadBitmap = ImageLoader.loadBitmap(pathToAttach.getAbsolutePath(), null, 800.0f, 800.0f, true);
                                } else {
                                    NotificationCenter.getInstance(i10).addObserver(g50Var, NotificationCenter.fileLoaded);
                                    NotificationCenter.getInstance(i10).addObserver(g50Var, NotificationCenter.fileLoadFailed);
                                    g50Var.v = FileLoader.getAttachFileName(closestPhotoSizeWithSize.location);
                                    imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, sendingMediaInfo.searchImage.photo), null, null, "jpg", null, 1);
                                }
                            }
                            loadBitmap = null;
                        } else if (searchImage.imageUrl != null) {
                            File file = new File(FileLoader.getDirectory(4), Utilities.MD5(sendingMediaInfo.searchImage.imageUrl) + "." + ImageLoader.getHttpUrlExtension(sendingMediaInfo.searchImage.imageUrl, "jpg"));
                            g50Var.E = file.getAbsolutePath();
                            if (file.exists() && file.length() != 0) {
                                loadBitmap = ImageLoader.loadBitmap(file.getAbsolutePath(), null, 800.0f, 800.0f, true);
                            } else {
                                g50Var.v = sendingMediaInfo.searchImage.imageUrl;
                                NotificationCenter.getInstance(i10).addObserver(g50Var, NotificationCenter.httpFileDidLoad);
                                NotificationCenter.getInstance(i10).addObserver(g50Var, NotificationCenter.httpFileDidFailedLoad);
                                imageReceiver.setImage(sendingMediaInfo.searchImage.imageUrl, null, null, "jpg", 1L);
                            }
                        }
                    }
                    messageObject = null;
                }
                messageObject = null;
                bitmap = loadBitmap;
            }
            g50Var.r(z10, bitmap, messageObject);
        }
    }

    public final void b() {
        this.T = true;
        String str = this.v;
        int i10 = this.d;
        if (str != null) {
            FileLoader.getInstance(i10).cancelFileUpload(this.v, false);
        }
        if (this.f28395w != null) {
            FileLoader.getInstance(i10).cancelFileUpload(this.f28395w, false);
        }
        f50 f50Var = this.f28389b;
        if (f50Var != null) {
            f50Var.Q();
        }
    }

    public final void c() {
        this.v = null;
        this.f28395w = null;
        this.f28396x = null;
        this.f28397y = null;
        if (this.F) {
            this.e.setImageBitmap((Drawable) null);
            this.f28388a = null;
            this.f28389b = null;
        }
    }

    public final void d() {
        this.T = false;
        if (this.v == null && this.f28395w == null && this.f28397y == null) {
            this.f28388a = null;
            this.f28389b = null;
        } else {
            this.F = true;
        }
        ti tiVar = this.f28390c;
        if (tiVar != null) {
            tiVar.dismissInternal();
            this.f28390c.B1();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        f50 f50Var;
        org.telegram.ui.ActionBar.r2 r2Var;
        String str;
        int i12 = NotificationCenter.fileUploaded;
        int i13 = this.d;
        if (i10 != i12 && i10 != NotificationCenter.fileUploadFailed) {
            if (i10 == NotificationCenter.fileUploadProgressChanged) {
                String str2 = (String) objArr[0];
                if (this.f28397y != null) {
                    str = this.f28395w;
                } else {
                    str = this.v;
                }
                if (this.f28389b != null && str2.equals(str)) {
                    float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
                    f50 f50Var2 = this.f28389b;
                    this.W = min;
                    f50Var2.F(min);
                    return;
                }
                return;
            }
            int i14 = NotificationCenter.fileLoaded;
            if (i10 != i14 && i10 != NotificationCenter.fileLoadFailed && i10 != NotificationCenter.httpFileDidLoad && i10 != NotificationCenter.httpFileDidFailedLoad) {
                int i15 = NotificationCenter.filePreparingFailed;
                if (i10 == i15) {
                    if (((MessageObject) objArr[0]) == this.f28397y && this.f28388a != null) {
                        NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.filePreparingStarted);
                        NotificationCenter.getInstance(i13).removeObserver(this, i15);
                        NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
                        c();
                        return;
                    }
                    return;
                } else if (i10 == NotificationCenter.fileNewChunkAvailable) {
                    if (((MessageObject) objArr[0]) == this.f28397y && this.f28388a != null) {
                        String str3 = (String) objArr[1];
                        long longValue = ((Long) objArr[2]).longValue();
                        long longValue2 = ((Long) objArr[3]).longValue();
                        this.f28388a.getFileLoader().checkUploadNewDataAvailable(str3, false, longValue, longValue2);
                        if (longValue2 != 0) {
                            double longValue3 = ((Long) objArr[5]).longValue() / 1000000.0d;
                            if (this.P > longValue3) {
                                this.P = longValue3;
                            }
                            Bitmap createVideoThumbnailAtTime = SendMessagesHelper.createVideoThumbnailAtTime(str3, (long) (this.P * 1000.0d), null, true);
                            if (createVideoThumbnailAtTime != null) {
                                File pathToAttach = FileLoader.getInstance(i13).getPathToAttach(this.f28392n, true);
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
                                this.f28392n = scaleAndSaveImage;
                                if (scaleAndSaveImage != null) {
                                    try {
                                        Bitmap decodeFile = BitmapFactory.decodeFile(FileLoader.getInstance(i13).getPathToAttach(this.f28392n, true).getAbsolutePath());
                                        ImageLoader.getInstance().putImageToCache(new BitmapDrawable(decodeFile), this.f28392n.location.volume_id + "_" + this.f28392n.location.local_id + "@50_50", true);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.filePreparingStarted);
                            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.filePreparingFailed);
                            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
                            this.f28396x = str3;
                            this.f28395w = str3;
                            this.f28397y = null;
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == NotificationCenter.filePreparingStarted && ((MessageObject) objArr[0]) == this.f28397y && (r2Var = this.f28388a) != null) {
                    this.f28395w = (String) objArr[1];
                    r2Var.getFileLoader().uploadFile(this.f28395w, false, false, (int) this.f28397y.videoEditedInfo.estimatedSize, 33554432, false);
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
                    f50 f50Var3 = this.f28389b;
                    if (f50Var3 != null) {
                        f50Var3.Q();
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
        } else if (str4.equals(this.f28395w)) {
            this.f28395w = null;
            if (i10 == i12) {
                this.N = (TLRPC.InputFile) objArr[1];
            }
        } else {
            return;
        }
        if (this.v == null && this.f28395w == null && this.f28397y == null) {
            NotificationCenter.getInstance(i13).removeObserver(this, i12);
            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
            NotificationCenter.getInstance(i13).removeObserver(this, NotificationCenter.fileUploadFailed);
            if (i10 == i12 && (f50Var = this.f28389b) != null) {
                f50Var.R(this.M, this.N, this.P, this.f28396x, this.h, this.f28392n, this.f28394s, this.O);
            }
            c();
        }
    }

    public final void e() {
        int i10;
        au auVar;
        boolean z10;
        org.telegram.ui.ActionBar.r2 r2Var = this.f28388a;
        if (r2Var != null && r2Var.getParentActivity() != null) {
            if (this.f28390c == null) {
                ti tiVar = new ti(this.f28388a.getParentActivity(), this.f28388a, this.R, this.S);
                this.f28390c = tiVar;
                if (this.Q) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                f50 f50Var = this.f28389b;
                if (f50Var != null && f50Var.u()) {
                    f50 f50Var2 = this.f28389b;
                    Objects.requireNonNull(f50Var2);
                    auVar = new au(f50Var2, 1);
                } else {
                    auVar = null;
                }
                tiVar.T0 = i10;
                tiVar.U0 = auVar;
                tiVar.V0 = false;
                li liVar = tiVar.B0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.f33002j0;
                if (liVar == null || liVar == chatAttachAlertPhotoLayout) {
                    tiVar.A1.setVisibility(8);
                }
                int i11 = tiVar.T0;
                TextView textView = tiVar.f33010m1;
                if (i11 == 2) {
                    textView.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
                } else {
                    textView.setText(LocaleController.getString(R.string.ChoosePhoto));
                }
                if (chatAttachAlertPhotoLayout != null) {
                    ti tiVar2 = chatAttachAlertPhotoLayout.f30254b;
                    if (tiVar2.T0 != 0 && !tiVar2.F) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    chatAttachAlertPhotoLayout.f26035g1 = z10;
                }
                ti tiVar3 = this.f28390c;
                tiVar3.f32982c2 = new b50(this);
                tiVar3.U = this;
            }
            int i12 = this.U;
            if (i12 == 1) {
                this.f28390c.f33010m1.setText(LocaleController.formatString("SetPhotoFor", R.string.SetPhotoFor, this.L.first_name));
            } else if (i12 == 2) {
                this.f28390c.f33010m1.setText(LocaleController.formatString("SuggestPhotoFor", R.string.SuggestPhotoFor, this.L.first_name));
            }
        }
    }

    public final boolean f(Dialog dialog) {
        ti tiVar = this.f28390c;
        if (tiVar == null || dialog != tiVar) {
            return false;
        }
        tiVar.f33002j0.b0(false);
        this.f28390c.dismissInternal();
        this.f28390c.f33002j0.e0(true);
        return true;
    }

    public final boolean g() {
        if (this.v == null && this.f28395w == null && this.f28397y == null) {
            return false;
        }
        return true;
    }

    public final void h(int i10, int i11, Intent intent) {
        if (i11 == -1) {
            if (i10 != 0 && i10 != 2) {
                if (i10 == 13) {
                    this.f28388a.getParentActivity().overridePendingTransition(R.anim.alpha_in, R.anim.alpha_out);
                    PhotoViewer.v1().N2(null, this.f28388a, null);
                    o(this.f28391f, null, AndroidUtilities.getImageOrientation(this.f28391f), false);
                    AndroidUtilities.addMediaToGallery(this.f28391f);
                    this.f28391f = null;
                    return;
                } else if (i10 == 14) {
                    if (intent != null && intent.getData() != null) {
                        AndroidUtilities.runOnUIThread(new so(23, this, intent.getData()));
                        return;
                    }
                    return;
                } else if (i10 == 15) {
                    p(this.f28391f, null, true);
                    AndroidUtilities.addMediaToGallery(this.f28391f);
                    this.f28391f = null;
                    return;
                } else {
                    return;
                }
            }
            e();
            ti tiVar = this.f28390c;
            if (tiVar != null) {
                tiVar.f33002j0.h0(i10, intent, this.f28391f);
            }
            this.f28391f = null;
        }
    }

    public final void i() {
        ti tiVar = this.f28390c;
        if (tiVar != null) {
            tiVar.D1();
        }
    }

    public final void j(int i10, String[] strArr, int[] iArr) {
        ti tiVar = this.f28390c;
        if (tiVar != null) {
            if (i10 == 17) {
                tiVar.f33002j0.V(false);
                this.f28390c.f33002j0.Z();
            } else if (i10 == 4) {
                tiVar.f33002j0.Z();
            }
        }
    }

    public final void k() {
        ti tiVar = this.f28390c;
        if (tiVar != null) {
            tiVar.E1();
        }
    }

    public final void l() {
        org.telegram.ui.ActionBar.r2 r2Var = this.f28388a;
        if (r2Var != null && r2Var.getParentActivity() != null) {
            try {
                int i10 = Build.VERSION.SDK_INT;
                if (this.f28388a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    this.f28388a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                    return;
                }
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File generatePicturePath = AndroidUtilities.generatePicturePath();
                if (generatePicturePath != null) {
                    if (i10 >= 24) {
                        Activity parentActivity = this.f28388a.getParentActivity();
                        intent.putExtra("output", FileProvider.d(parentActivity, ApplicationLoader.getApplicationId() + ".provider", generatePicturePath));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(generatePicturePath));
                    }
                    this.f28391f = generatePicturePath.getAbsolutePath();
                }
                this.f28388a.startActivityForResult(intent, 13);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void m() {
        int i10;
        org.telegram.ui.ActionBar.r2 r2Var = this.f28388a;
        if (r2Var == null) {
            return;
        }
        Activity parentActivity = r2Var.getParentActivity();
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
        org.telegram.ui.cq0 cq0Var = new org.telegram.ui.cq0(i10, false, false, null);
        cq0Var.f38440x = this.J;
        cq0Var.V = new c50(this);
        this.f28388a.presentFragment(cq0Var);
    }

    public final void n(boolean z10, final Runnable runnable, DialogInterface.OnDismissListener onDismissListener, int i10) {
        org.telegram.ui.ActionBar.c3 c3Var;
        org.telegram.ui.ActionBar.r2 r2Var = this.f28388a;
        if (r2Var != null && r2Var.getParentActivity() != null) {
            this.T = false;
            this.U = i10;
            if (this.G) {
                org.telegram.ui.ActionBar.r2 r2Var2 = this.f28388a;
                if (r2Var2 != null && r2Var2.getParentActivity() != null) {
                    e();
                    ti tiVar = this.f28390c;
                    tiVar.X1 = this.H;
                    tiVar.R1(1, false);
                    this.f28390c.f33002j0.g0();
                    this.f28390c.w1();
                    this.f28390c.setOnHideListener(onDismissListener);
                    int i11 = this.U;
                    if (i11 != 0) {
                        this.f28390c.Q = new e50(i11, this.L);
                    }
                    ti tiVar2 = this.f28390c;
                    tiVar2.getClass();
                    this.f28388a.showDialog(tiVar2);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) this.f28388a.getParentActivity(), (org.telegram.ui.ActionBar.u6) null, false);
            k3Var.fixNavigationBar();
            if (i10 == 1) {
                k3Var.title = LocaleController.formatString("SetPhotoFor", R.string.SetPhotoFor, this.L.first_name);
                k3Var.bigTitle = true;
            } else if (i10 == 2) {
                k3Var.title = LocaleController.formatString("SuggestPhotoFor", R.string.SuggestPhotoFor, this.L.first_name);
                k3Var.bigTitle = true;
            } else {
                k3Var.title = LocaleController.getString(R.string.ChoosePhoto);
                k3Var.bigTitle = true;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            final ArrayList arrayList3 = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.ChooseTakePhoto));
            org.telegram.ui.d3.n(R.drawable.msg_camera, 0, arrayList2, arrayList3);
            if (this.Q) {
                arrayList.add(LocaleController.getString(R.string.ChooseRecordVideo));
                org.telegram.ui.d3.n(R.drawable.msg_video, 4, arrayList2, arrayList3);
            }
            arrayList.add(LocaleController.getString(R.string.ChooseFromGallery));
            org.telegram.ui.d3.n(R.drawable.msg_photos, 1, arrayList2, arrayList3);
            if (this.J) {
                arrayList.add(LocaleController.getString(R.string.ChooseFromSearch));
                org.telegram.ui.d3.n(R.drawable.msg_search, 2, arrayList2, arrayList3);
            }
            if (z10) {
                arrayList.add(LocaleController.getString(R.string.DeletePhoto));
                org.telegram.ui.d3.n(R.drawable.msg_delete, 3, arrayList2, arrayList3);
            }
            int[] iArr = new int[arrayList2.size()];
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                iArr[i12] = ((Integer) arrayList2.get(i12)).intValue();
            }
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i13) {
                    org.telegram.ui.ActionBar.r2 r2Var3;
                    g50 g50Var = g50.this;
                    g50Var.getClass();
                    int intValue = ((Integer) arrayList3.get(i13)).intValue();
                    if (intValue != 0) {
                        if (intValue != 1) {
                            if (intValue != 2) {
                                if (intValue != 3) {
                                    if (intValue == 4 && (r2Var3 = g50Var.f28388a) != null && r2Var3.getParentActivity() != null) {
                                        try {
                                            int i14 = Build.VERSION.SDK_INT;
                                            if (g50Var.f28388a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                                g50Var.f28388a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                                                return;
                                            }
                                            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                                            File generateVideoPath = AndroidUtilities.generateVideoPath();
                                            if (generateVideoPath != null) {
                                                if (i14 >= 24) {
                                                    Activity parentActivity = g50Var.f28388a.getParentActivity();
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
                                                g50Var.f28391f = generateVideoPath.getAbsolutePath();
                                            }
                                            g50Var.f28388a.startActivityForResult(intent, 15);
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
                            g50Var.q();
                            return;
                        }
                        g50Var.m();
                        return;
                    }
                    g50Var.l();
                }
            };
            k3Var.items = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
            k3Var.itemIcons = iArr;
            k3Var.onClickListener = onClickListener;
            k3Var.setOnHideListener(onDismissListener);
            this.f28388a.showDialog(k3Var);
            if (z10) {
                int i13 = org.telegram.ui.ActionBar.y6.f23599q7;
                int x02 = org.telegram.ui.ActionBar.y6.x0(null, i13, false);
                int i14 = org.telegram.ui.ActionBar.y6.f23582p7;
                k3Var.setItemColor(arrayList.size() - 1, x02, org.telegram.ui.ActionBar.y6.x0(null, i14, false));
                int size2 = arrayList.size() - 1;
                if (size2 >= 0 && size2 < k3Var.getItemViews().size() && (c3Var = k3Var.getItemViews().get(size2)) != null && c3Var.getTextView() != null && c3Var.getImageView() != null) {
                    org.telegram.ui.ActionBar.f7.V(c3Var.getTextView(), i13, null);
                    org.telegram.ui.ActionBar.f7.t(c3Var.getImageView(), i14, null, PorterDuff.Mode.MULTIPLY);
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
        PhotoViewer.v1().N2(null, this.f28388a, null);
        PhotoViewer.v1().j2(arrayList, 0, 1, false, new d50(this, arrayList), null);
        PhotoViewer.v1().P = true;
    }

    public final void p(String str, String str2, boolean z10) {
        o(str, str2, new Pair(0, 0), z10);
    }

    public final void q() {
        if (this.f28388a == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.tq0 tq0Var = new org.telegram.ui.tq0(0, null, hashMap, arrayList, 1, false, null, this.R);
        tq0Var.f43752s0 = new a50(this, hashMap, arrayList);
        tq0Var.g0(1, false);
        tq0Var.f43747p0 = this.f28389b.getInitialSearchString();
        if (this.S) {
            this.f28388a.showAsSheet(tq0Var);
        } else {
            this.f28388a.presentFragment(tq0Var);
        }
    }

    public final void r(boolean z10, Bitmap bitmap, MessageObject messageObject) {
        TLRPC.VideoSize videoSize;
        if (bitmap != null) {
            this.N = null;
            this.M = null;
            this.f28397y = null;
            this.f28396x = null;
            if (messageObject == null) {
                videoSize = null;
            } else {
                videoSize = messageObject.emojiMarkup;
            }
            this.O = videoSize;
            this.h = ImageLoader.scaleAndSaveImage(bitmap, 800.0f, 800.0f, 80, false, 320, 320);
            TLRPC.PhotoSize scaleAndSaveImage = ImageLoader.scaleAndSaveImage(bitmap, 150.0f, 150.0f, 80, false, 150, 150);
            this.f28392n = scaleAndSaveImage;
            int i10 = this.d;
            if (scaleAndSaveImage != null) {
                try {
                    Bitmap decodeFile = BitmapFactory.decodeFile(FileLoader.getInstance(i10).getPathToAttach(this.f28392n, true).getAbsolutePath());
                    this.f28393r = decodeFile;
                    ImageLoader.getInstance().putImageToCache(new BitmapDrawable(decodeFile), this.f28392n.location.volume_id + "_" + this.f28392n.location.local_id + "@50_50", true);
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
                            f50 f50Var = this.f28389b;
                            if (f50Var != null) {
                                f50Var.L(z10, true);
                            }
                            f50 f50Var2 = this.f28389b;
                            if (f50Var2 != null) {
                                f50Var2.R(null, null, 0.0d, null, this.h, this.f28392n, this.f28394s, null);
                                this.f28389b.R(null, null, this.P, this.f28396x, this.h, this.f28392n, this.f28394s, this.O);
                                c();
                                return;
                            }
                            return;
                        }
                        this.f28397y = messageObject;
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
                        f50 f50Var3 = this.f28389b;
                        if (f50Var3 != null) {
                            f50Var3.L(z10, true);
                        }
                        this.f28394s = true;
                    } else {
                        f50 f50Var4 = this.f28389b;
                        if (f50Var4 != null) {
                            f50Var4.L(z10, false);
                        }
                        this.f28394s = false;
                    }
                    NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
                    NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploadProgressChanged);
                    NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploadFailed);
                    if (this.v != null) {
                        FileLoader.getInstance(i10).uploadFile(this.v, false, true, 16777216);
                    }
                }
                f50 f50Var5 = this.f28389b;
                if (f50Var5 != null) {
                    f50Var5.R(null, null, 0.0d, null, this.h, this.f28392n, this.f28394s, null);
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
            tL_message.f22049id = 0;
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
