package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

public class ch0 extends kp implements NotificationCenter.NotificationCenterDelegate {
    public long A0;
    public TLRPC.ChatFull B0;
    public final xg0 C0;
    public boolean D0;
    public boolean E0;
    public final boolean F0;
    public ImageLocation G0;
    public final int H0;
    public final Path I0;
    public final RectF J0;
    public final float[] K0;
    public ImageLocation L0;
    public ImageLocation M0;
    public w51 N0;
    public MessagesController.DialogPhotos O0;
    public final ArrayList P0;
    public final ArrayList Q0;
    public final ArrayList R0;
    public final ArrayList S0;
    public final ArrayList T0;
    public final ArrayList U0;
    public final ArrayList V0;
    public final ArrayList W0;
    public final ArrayList X0;
    public int Y0;
    public final SparseArray Z0;

    public boolean f27432a1;

    public boolean f27433b1;

    public boolean f27434c1;

    public org.telegram.ui.ou0 f27435d1;

    public boolean f27436e1;

    public int f27437f1;

    public int f27438g1;

    public int f27439h1;

    public int f27440i1;

    public int f27441j1;

    public int f27442k1;
    public tg0 l1;

    public ImageLocation f27443m1;

    public ImageLocation f27444n1;

    public final PointF f27445t0;

    public final int f27446u0;

    public final org.telegram.ui.ActionBar.k f27447v0;

    public boolean f27448w0;

    public boolean f27449x0;

    public final zk0 f27450y0;

    public final bh0 f27451z0;

    public ch0(Context context, org.telegram.ui.ActionBar.k kVar, zk0 zk0Var, org.telegram.ui.r4 r4Var) {
        super(context);
        this.f27445t0 = new PointF();
        this.f27448w0 = true;
        this.f27449x0 = true;
        int i10 = UserConfig.selectedAccount;
        this.H0 = i10;
        this.I0 = new Path();
        this.J0 = new RectF();
        this.K0 = new float[8];
        this.P0 = new ArrayList();
        this.Q0 = new ArrayList();
        this.R0 = new ArrayList();
        this.S0 = new ArrayList();
        this.T0 = new ArrayList();
        this.U0 = new ArrayList();
        this.V0 = new ArrayList();
        this.W0 = new ArrayList();
        this.X0 = new ArrayList();
        this.Z0 = new SparseArray();
        this.f27432a1 = true;
        this.f27437f1 = -1;
        this.f27438g1 = -1;
        setOffscreenPageLimit(2);
        this.l1 = null;
        this.F0 = false;
        this.f27450y0 = zk0Var;
        ConnectionsManager.generateClassGuid();
        this.f27447v0 = kVar;
        this.f27446u0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.C0 = r4Var;
        b(new ug0(this));
        bh0 bh0Var = new bh0(this, getContext(), null);
        this.f27451z0 = bh0Var;
        setAdapter((jp) bh0Var);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.dialogPhotosLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.reloadDialogPhotos);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.dialogPhotosUpdate);
        this.O0 = null;
    }

    public final void A(ImageLocation imageLocation, ImageLocation imageLocation2) {
        this.L0 = imageLocation;
        this.Q0.add(0, null);
        this.P0.add(0, null);
        this.T0.add(0, imageLocation);
        this.U0.add(0, imageLocation2);
        this.V0.add(0, null);
        this.S0.add(0, null);
        this.R0.add(0, null);
        this.W0.add(0, -1);
        this.X0.add(0, Float.valueOf(0.0f));
        this.f27451z0.g();
        L();
        this.f27443m1 = imageLocation;
        this.f27444n1 = imageLocation2;
    }

    public final void B(float f10, int i10) {
        float f11;
        int i11 = this.f27437f1;
        float fClamp = 0.0f;
        if (i11 >= 0 || this.f27438g1 >= 0) {
            if (i11 < 0) {
                i11 = this.f27438g1;
            }
            int iK = this.f27451z0.k(i10);
            if (this.f27436e1) {
                iK--;
            }
            if (iK == i11) {
                f11 = 1.0f - f10;
            } else if (getRealCount() <= 0 || (iK - 1) % getRealCount() != i11) {
                f11 = (getRealCount() <= 0 || (iK + 1) % getRealCount() != i11) ? 0.0f : (1.0f - f10) + 1.0f;
            } else {
                f11 = (1.0f - f10) - 1.0f;
            }
            if (f11 > 1.0f) {
                f11 = 2.0f - f11;
            }
            fClamp = Utilities.clamp(f11, 1.0f, 0.0f);
        }
        setCustomAvatarProgress(fClamp);
    }

    public final ImageLocation C(ImageLocation imageLocation, ImageLocation imageLocation2) {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        if (imageLocation == null) {
            return null;
        }
        int i10 = 0;
        while (i10 < 2) {
            ArrayList arrayList = i10 == 0 ? this.U0 : this.T0;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ImageLocation imageLocation3 = (ImageLocation) arrayList.get(i11);
                if (imageLocation3 != null && (tL_fileLocationToBeDeprecated = imageLocation3.location) != null) {
                    int i12 = imageLocation3.dc_id;
                    if (i12 == imageLocation.dc_id) {
                        int i13 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = imageLocation.location;
                        if (i13 != tL_fileLocationToBeDeprecated2.local_id || tL_fileLocationToBeDeprecated.volume_id != tL_fileLocationToBeDeprecated2.volume_id) {
                        }
                        return (ImageLocation) this.S0.get(i11);
                    }
                    if (i12 == imageLocation2.dc_id) {
                        int i14 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = imageLocation2.location;
                        if (i14 == tL_fileLocationToBeDeprecated3.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated3.volume_id) {
                            return (ImageLocation) this.S0.get(i11);
                        }
                    } else {
                        continue;
                    }
                }
            }
            i10++;
        }
        return null;
    }

    public final ImageLocation D(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.T0;
        if (i10 >= arrayList.size()) {
            return null;
        }
        ImageLocation imageLocation = (ImageLocation) this.S0.get(i10);
        return imageLocation != null ? imageLocation : (ImageLocation) arrayList.get(i10);
    }

    public final View E(int i10) {
        bh0 bh0Var = this.f27451z0;
        if (bh0Var == null) {
            return null;
        }
        ArrayList arrayList = bh0Var.f27100c;
        if (arrayList.size() <= i10 || i10 < 0) {
            return null;
        }
        yg0 yg0Var = (yg0) arrayList.get(i10);
        zg0 zg0Var = yg0Var.f34897b;
        return zg0Var == null ? yg0Var.f34898c : zg0Var;
    }

    public final TLRPC.Photo F(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.R0;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (TLRPC.Photo) arrayList.get(i10);
    }

    public final ImageLocation G(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.T0;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (ImageLocation) arrayList.get(i10);
    }

    public final boolean H(w51 w51Var, ImageLocation imageLocation, ImageLocation imageLocation2, boolean z10) {
        MessagesController.DialogPhotos dialogPhotos;
        MessagesController.DialogPhotos dialogPhotos2;
        if (imageLocation != null && imageLocation2 != null && this.Y0 == 0) {
            ImageLocation imageLocation3 = this.L0;
            ArrayList arrayList = this.T0;
            if (imageLocation3 == null || imageLocation3.location.local_id != imageLocation.location.local_id) {
                boolean zIsEmpty = arrayList.isEmpty();
                bh0 bh0Var = this.f27451z0;
                if (!zIsEmpty) {
                    this.L0 = imageLocation;
                    if (z10 && (dialogPhotos2 = this.O0) != null) {
                        dialogPhotos2.reset();
                        this.O0.loadAfter(getCurrentItem() - (bh0Var != null ? bh0Var.j() : 0), true);
                    }
                    return true;
                }
                if (z10 && (dialogPhotos = this.O0) != null) {
                    dialogPhotos.reset();
                    this.O0.loadAfter(getCurrentItem() - (bh0Var != null ? bh0Var.j() : 0), true);
                }
            }
            if (arrayList.isEmpty()) {
                this.L0 = imageLocation;
                this.M0 = imageLocation2;
                this.N0 = w51Var;
                this.Q0.add(null);
                this.P0.add(null);
                arrayList.add(imageLocation);
                this.U0.add(imageLocation2);
                this.V0.add(w51Var);
                this.S0.add(null);
                this.R0.add(null);
                this.W0.add(-1);
                this.X0.add(null);
                getAdapter().g();
                L();
                return true;
            }
        }
        return false;
    }

    public final boolean I() {
        int realPosition = getRealPosition();
        if (this.f27436e1) {
            if (realPosition == 0) {
                return false;
            }
            realPosition--;
        }
        if (realPosition < 0) {
            return false;
        }
        ArrayList arrayList = this.S0;
        return realPosition < arrayList.size() && arrayList.get(realPosition) != null;
    }

    public final boolean J() {
        n9 currentItemView;
        if (this.S0.get(this.f27436e1 ? getRealPosition() - 1 : getRealPosition()) == null || (currentItemView = getCurrentItemView()) == null) {
            return false;
        }
        x5 animation = currentItemView.getImageReceiver().getAnimation();
        return animation == null || !animation.s();
    }

    public final void K() {
        this.l1 = null;
        int i10 = this.H0;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.dialogPhotosLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i10);
        int i11 = NotificationCenter.fileLoadProgressChanged;
        notificationCenter.removeObserver(this, i11);
        NotificationCenter.getInstance(i10).removeObserver(this, i11);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.reloadDialogPhotos);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.dialogPhotosUpdate);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof n9) {
                n9 n9Var = (n9) childAt;
                if (n9Var.getImageReceiver().hasStaticThumb()) {
                    Drawable drawable = n9Var.getImageReceiver().getDrawable();
                    if (drawable instanceof x5) {
                        ((x5) drawable).w(n9Var);
                    }
                }
            }
        }
    }

    public final void L() {
        x(this.f27451z0.j(), false);
    }

    public final void M(long j10, boolean z10) {
        if (this.A0 == j10 && !z10) {
            L();
            return;
        }
        this.f27433b1 = true;
        this.P0.clear();
        this.Q0.clear();
        this.R0.clear();
        this.S0.clear();
        this.T0.clear();
        this.U0.clear();
        this.W0.clear();
        this.X0.clear();
        this.f27451z0.g();
        x(0, false);
        this.f27442k1 = 0;
        this.G0 = null;
        this.L0 = null;
        this.A0 = j10;
        MessagesController.DialogPhotos dialogPhotos = MessagesController.getInstance(this.H0).getDialogPhotos(j10);
        this.O0 = dialogPhotos;
        dialogPhotos.loadCache();
    }

    public final void N(int i10, int i11) {
        this.f27440i1 = i10;
        this.f27441j1 = i11;
        bh0 bh0Var = this.f27451z0;
        if (bh0Var != null) {
            for (int i12 = 0; i12 < bh0Var.f27100c.size(); i12++) {
                if (((yg0) bh0Var.f27100c.get(i12)).f34898c != null) {
                    wg0 wg0Var = ((yg0) bh0Var.f27100c.get(i12)).f34898c;
                    int i13 = this.f27440i1;
                    int i14 = this.f27441j1;
                    wg0Var.r(i13, i13, i14, i14);
                }
            }
        }
    }

    public final void O(ImageLocation imageLocation, float f10) {
        if (imageLocation == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.T0;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) == imageLocation) {
                this.X0.set(i10, Float.valueOf(f10));
                SparseArray sparseArray = this.Z0;
                if (sparseArray.get(i10) == null) {
                    break;
                }
                ((RadialProgress2) sparseArray.get(i10)).o(f10, true);
                break;
            }
            i10++;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            getChildAt(i11).invalidate();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        MessagesController.DialogPhotos dialogPhotos;
        ArrayList arrayList;
        ImageLocation forUserOrChat;
        int i12;
        boolean z10;
        ch0 ch0Var;
        boolean z11;
        int i13;
        ArrayList arrayList2;
        ImageLocation imageLocation;
        Integer num;
        ArrayList<TLRPC.PhotoSize> arrayList3;
        TLRPC.PhotoSize photoSize;
        Integer num2;
        boolean z12;
        TLRPC.User user;
        Object obj;
        boolean z13;
        TLRPC.Photo photo;
        ch0 ch0Var2 = this;
        Integer num3 = -1;
        int i14 = NotificationCenter.dialogPhotosUpdate;
        ArrayList arrayList4 = ch0Var2.Q0;
        ArrayList arrayList5 = ch0Var2.P0;
        if (i10 != i14) {
            int i15 = NotificationCenter.fileLoaded;
            SparseArray sparseArray = ch0Var2.Z0;
            if (i10 == i15) {
                String str = (String) objArr[0];
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    String str2 = (String) arrayList5.get(i16);
                    if (str2 == null) {
                        str2 = (String) arrayList4.get(i16);
                    }
                    if (str2 != null && TextUtils.equals(str, str2)) {
                        RadialProgress2 radialProgress2 = (RadialProgress2) sparseArray.get(i16);
                        if (radialProgress2 != null) {
                            radialProgress2.o(1.0f, true);
                        }
                        ch0Var2.invalidate();
                    }
                }
                return;
            }
            if (i10 != NotificationCenter.fileLoadProgressChanged) {
                if (i10 == NotificationCenter.reloadDialogPhotos && ch0Var2.Y0 == 0 && (dialogPhotos = ch0Var2.O0) != null) {
                    dialogPhotos.reset();
                    MessagesController.DialogPhotos dialogPhotos2 = ch0Var2.O0;
                    int currentItem = ch0Var2.getCurrentItem();
                    bh0 bh0Var = ch0Var2.f27451z0;
                    dialogPhotos2.loadAfter(currentItem - (bh0Var != null ? bh0Var.j() : 0), true);
                    return;
                }
                return;
            }
            String str3 = (String) objArr[0];
            for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                String str4 = (String) arrayList5.get(i17);
                if (str4 == null) {
                    str4 = (String) arrayList4.get(i17);
                }
                if (str4 != null && TextUtils.equals(str3, str4)) {
                    RadialProgress2 radialProgress3 = (RadialProgress2) sparseArray.get(i17);
                    if (radialProgress3 != null) {
                        radialProgress3.o(Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue()), true);
                    }
                    ch0Var2.invalidate();
                }
            }
            return;
        }
        MessagesController.DialogPhotos dialogPhotos3 = (MessagesController.DialogPhotos) objArr[0];
        if (ch0Var2.O0 == dialogPhotos3) {
            ArrayList arrayList6 = new ArrayList(dialogPhotos3.photos);
            if (!arrayList6.isEmpty() || !dialogPhotos3.fromCache) {
                ch0Var2.f27437f1 = -1;
                ch0Var2.f27438g1 = -1;
                int i18 = ch0Var2.H0;
                TLRPC.User user2 = MessagesController.getInstance(i18).getUser(Long.valueOf(ch0Var2.A0));
                TLRPC.UserFull userFull = MessagesController.getInstance(i18).getUserFull(ch0Var2.A0);
                if (userFull != null && (photo = userFull.personal_photo) != null) {
                    arrayList6.add(0, photo);
                    ch0Var2.f27437f1 = 0;
                }
                if (user2 != null && user2.self && UserObject.hasFallbackPhoto(userFull)) {
                    arrayList6.add(userFull.fallback_photo);
                    ch0Var2.f27438g1 = arrayList6.size() - 1;
                }
                arrayList4.clear();
                arrayList5.clear();
                ArrayList arrayList7 = ch0Var2.T0;
                arrayList7.clear();
                ArrayList arrayList8 = ch0Var2.S0;
                arrayList8.clear();
                ArrayList arrayList9 = ch0Var2.U0;
                arrayList9.clear();
                ArrayList arrayList10 = ch0Var2.V0;
                arrayList10.clear();
                ArrayList arrayList11 = ch0Var2.R0;
                arrayList11.clear();
                ArrayList arrayList12 = ch0Var2.W0;
                arrayList12.clear();
                ArrayList arrayList13 = ch0Var2.X0;
                arrayList13.clear();
                if (DialogObject.isChatDialog(ch0Var2.A0)) {
                    TLRPC.Chat chat = MessagesController.getInstance(i18).getChat(Long.valueOf(-ch0Var2.A0));
                    forUserOrChat = ImageLocation.getForUserOrChat(i18, chat, 0);
                    arrayList = arrayList7;
                    if (forUserOrChat != null) {
                        arrayList.add(forUserOrChat);
                        arrayList9.add(ImageLocation.getForUserOrChat(i18, chat, 1));
                        arrayList10.add(null);
                        arrayList4.add(null);
                        TLRPC.ChatFull chatFull = ch0Var2.B0;
                        if (chatFull == null || !FileLoader.isSamePhoto((TLRPC.FileLocation) forUserOrChat.location, chatFull.chat_photo)) {
                            z13 = false;
                            arrayList11.add(null);
                            arrayList5.add(null);
                            arrayList8.add(null);
                        } else {
                            arrayList11.add(ch0Var2.B0.chat_photo);
                            if (ch0Var2.B0.chat_photo.video_sizes.isEmpty()) {
                                z13 = false;
                                arrayList8.add(null);
                                arrayList5.add(null);
                            } else {
                                TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(ch0Var2.B0.chat_photo.video_sizes, 1000);
                                arrayList8.add(ImageLocation.getForPhoto(closestVideoSizeWithSize, ch0Var2.B0.chat_photo));
                                arrayList5.add(FileLoader.getAttachFileName(closestVideoSizeWithSize));
                                z13 = false;
                            }
                        }
                        arrayList12.add(num3);
                        arrayList13.add(z13);
                    }
                } else {
                    arrayList = arrayList7;
                    forUserOrChat = null;
                }
                int i19 = 0;
                while (true) {
                    int size = arrayList6.size();
                    i12 = i18;
                    z10 = ch0Var2.F0;
                    if (i19 >= size) {
                        break;
                    }
                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList6.get(i19);
                    if (photo2 == null || (photo2 instanceof TLRPC.TL_photoEmpty) || (arrayList3 = photo2.sizes) == null) {
                        i13 = i19;
                        arrayList2 = arrayList6;
                        imageLocation = forUserOrChat;
                        num = num3;
                        arrayList11.add(null);
                        arrayList.add(null);
                        arrayList9.add(null);
                        arrayList10.add(null);
                        arrayList4.add(null);
                        arrayList8.add(null);
                        arrayList5.add(null);
                        arrayList12.add(num);
                        arrayList13.add(null);
                    } else {
                        i13 = i19;
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList3, 50);
                        int size2 = photo2.sizes.size();
                        int i20 = 0;
                        while (true) {
                            if (i20 >= size2) {
                                photoSize = closestPhotoSizeWithSize;
                                break;
                            }
                            int i21 = size2;
                            TLRPC.PhotoSize photoSize2 = photo2.sizes.get(i20);
                            int i22 = i20;
                            if (photoSize2 instanceof TLRPC.TL_photoStrippedSize) {
                                photoSize = photoSize2;
                                break;
                            } else {
                                i20 = i22 + 1;
                                size2 = i21;
                            }
                        }
                        if (forUserOrChat != null) {
                            int size3 = photo2.sizes.size();
                            arrayList2 = arrayList6;
                            int i23 = 0;
                            while (true) {
                                if (i23 < size3) {
                                    int i24 = size3;
                                    TLRPC.FileLocation fileLocation = photo2.sizes.get(i23).location;
                                    int i25 = i23;
                                    if (fileLocation != null) {
                                        int i26 = fileLocation.local_id;
                                        arrayList13 = arrayList13;
                                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = forUserOrChat.location;
                                        imageLocation = forUserOrChat;
                                        if (i26 == tL_fileLocationToBeDeprecated.local_id) {
                                            num2 = num3;
                                            if (fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                                                arrayList11.set(0, photo2);
                                                if (!photo2.video_sizes.isEmpty()) {
                                                    arrayList8.set(0, ImageLocation.getForPhoto(FileLoader.getClosestVideoSizeWithSize(photo2.video_sizes, 1000), photo2));
                                                }
                                            }
                                        }
                                        num3 = num2;
                                        arrayList13 = arrayList13;
                                        forUserOrChat = imageLocation;
                                        i23 = i25 + 1;
                                        size3 = i24;
                                    } else {
                                        arrayList13 = arrayList13;
                                        imageLocation = forUserOrChat;
                                    }
                                    num2 = num3;
                                    num3 = num2;
                                    arrayList13 = arrayList13;
                                    forUserOrChat = imageLocation;
                                    i23 = i25 + 1;
                                    size3 = i24;
                                } else {
                                    num2 = num3;
                                    arrayList13 = arrayList13;
                                    imageLocation = forUserOrChat;
                                }
                                num = num2;
                                arrayList13 = arrayList13;
                            }
                        } else {
                            arrayList2 = arrayList6;
                            arrayList13 = arrayList13;
                            imageLocation = forUserOrChat;
                            num2 = num3;
                        }
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 640);
                        if (closestPhotoSizeWithSize2 == null) {
                            num = num2;
                            arrayList13 = arrayList13;
                        } else {
                            int i27 = photo2.dc_id;
                            if (i27 != 0) {
                                TLRPC.FileLocation fileLocation2 = closestPhotoSizeWithSize2.location;
                                fileLocation2.dc_id = i27;
                                fileLocation2.file_reference = photo2.file_reference;
                            }
                            ImageLocation forPhoto = ImageLocation.getForPhoto(closestPhotoSizeWithSize2, photo2);
                            if (forPhoto != null) {
                                ImageLocation imageLocation2 = ch0Var2.L0;
                                num = num2;
                                if (imageLocation2 == null || imageLocation2.photoId != forPhoto.photoId || z10 || ch0Var2.A0 == UserConfig.getInstance(i12).getClientUserId()) {
                                    arrayList.add(forPhoto);
                                    arrayList4.add(FileLoader.getAttachFileName(photoSize instanceof TLRPC.TL_photoStrippedSize ? closestPhotoSizeWithSize2 : photoSize));
                                    arrayList9.add(ImageLocation.getForPhoto(photoSize, photo2));
                                    if (photo2.video_sizes.isEmpty()) {
                                        z12 = false;
                                        arrayList8.add(null);
                                        arrayList5.add(null);
                                        arrayList10.add(null);
                                    } else {
                                        TLRPC.VideoSize closestVideoSizeWithSize2 = FileLoader.getClosestVideoSizeWithSize(photo2.video_sizes, 1000);
                                        TLRPC.VideoSize vectorMarkupVideoSize = FileLoader.getVectorMarkupVideoSize(photo2);
                                        if (vectorMarkupVideoSize != null) {
                                            arrayList10.add(new w51(vectorMarkupVideoSize, user2 != 0 && user2.premium, 2));
                                            z12 = false;
                                            arrayList8.add(null);
                                            arrayList5.add(null);
                                        } else {
                                            z12 = false;
                                            arrayList10.add(null);
                                            arrayList8.add(ImageLocation.getForPhoto(closestVideoSizeWithSize2, photo2));
                                            arrayList5.add(FileLoader.getAttachFileName(closestVideoSizeWithSize2));
                                        }
                                    }
                                    arrayList11.add(photo2);
                                    arrayList12.add(Integer.valueOf(closestPhotoSizeWithSize2.size));
                                    arrayList13.add(z12);
                                } else {
                                    arrayList4.add(null);
                                    arrayList.add(ch0Var2.L0);
                                    ImageLocation forPhoto2 = ch0Var2.M0;
                                    if (forPhoto2 == null) {
                                        forPhoto2 = ImageLocation.getForPhoto(photoSize, photo2);
                                    }
                                    arrayList9.add(forPhoto2);
                                    if (photo2.video_sizes.isEmpty()) {
                                        user = user2;
                                        obj = null;
                                        arrayList10.add(ch0Var2.N0);
                                        arrayList8.add(null);
                                        arrayList5.add(null);
                                    } else {
                                        TLRPC.VideoSize closestVideoSizeWithSize3 = FileLoader.getClosestVideoSizeWithSize(photo2.video_sizes, 1000);
                                        TLRPC.VideoSize vectorMarkupVideoSize2 = FileLoader.getVectorMarkupVideoSize(photo2);
                                        if (vectorMarkupVideoSize2 != null) {
                                            user = user2;
                                            arrayList10.add(new w51(vectorMarkupVideoSize2, user2 != null && user.premium, 2));
                                            obj = null;
                                            arrayList8.add(null);
                                            arrayList5.add(null);
                                        } else {
                                            user = user2;
                                            obj = null;
                                            arrayList10.add(null);
                                            arrayList8.add(ImageLocation.getForPhoto(closestVideoSizeWithSize3, photo2));
                                            arrayList5.add(FileLoader.getAttachFileName(closestVideoSizeWithSize3));
                                        }
                                    }
                                    arrayList11.add(obj);
                                    arrayList12.add(num);
                                    arrayList13 = arrayList13;
                                    arrayList13.add(obj);
                                    user2 = user;
                                }
                            } else {
                                num = num2;
                                arrayList13 = arrayList13;
                            }
                        }
                    }
                    i19 = i13 + 1;
                    ch0Var2 = this;
                    num3 = num;
                    i18 = i12;
                    arrayList6 = arrayList2;
                    forUserOrChat = imageLocation;
                }
                int size4 = arrayList9.size();
                if (size4 > 1) {
                    int i28 = 0;
                    while (true) {
                        if (i28 >= (size4 > 2 ? 2 : 1)) {
                            break;
                        }
                        FileLoader.getInstance(i12).loadFile((ImageLocation) arrayList9.get(i28 == 0 ? 1 : size4 - 1), null, null, 0, 1);
                        i28++;
                    }
                }
                getAdapter().g();
                if (z10) {
                    ch0Var = this;
                    if (!ch0Var.D0 || ch0Var.f27433b1) {
                        ch0Var.L();
                    }
                } else {
                    ch0Var = this;
                    if (!ch0Var.D0 || ch0Var.f27433b1) {
                        ch0Var.L();
                        ch0Var.getAdapter().g();
                        ch0Var.B(0.0f, ch0Var.getRealPosition());
                    }
                }
                if (ch0Var.f27438g1 >= 0 || ch0Var.f27437f1 >= 0) {
                    z11 = false;
                } else {
                    z11 = false;
                    ch0Var.B(0.0f, 0);
                }
                ch0Var.f27433b1 = z11;
                xg0 xg0Var = ch0Var.C0;
                if (xg0Var != null) {
                    xg0Var.c();
                }
                ImageLocation imageLocation3 = ch0Var.f27443m1;
                if (imageLocation3 != null) {
                    ch0Var.A(imageLocation3, ch0Var.f27444n1);
                }
            }
        }
    }

    public tg0 getBlurDrawer() {
        return this.l1;
    }

    public float getCurrentItemProgress() {
        x5 animation;
        n9 currentItemView = getCurrentItemView();
        if (currentItemView == null || (animation = currentItemView.getImageReceiver().getAnimation()) == null) {
            return 0.0f;
        }
        return animation.n();
    }

    public n9 getCurrentItemView() {
        bh0 bh0Var = this.f27451z0;
        if (bh0Var == null || bh0Var.f27100c.isEmpty()) {
            return null;
        }
        return ((yg0) bh0Var.f27100c.get(getCurrentItem())).f34898c;
    }

    public long getDialogId() {
        return this.A0;
    }

    public int getRealCount() {
        int size = this.R0.size();
        return this.f27436e1 ? size + 1 : size;
    }

    public int getRealPosition() {
        return this.f27451z0.k(getCurrentItem());
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f27450y0.getScrollState() != 0) {
            return false;
        }
        if (getParent() != null && getParent().getParent() != null) {
            getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        tg0 tg0Var = this.l1;
        if (tg0Var != null) {
            tg0Var.setTranslationY(getHeight() - this.l1.getMeasuredHeight());
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        tg0 tg0Var = this.l1;
        if (tg0Var != null) {
            tg0Var.C = true;
            tg0Var.postInvalidateOnAnimation();
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ch0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        tg0 tg0Var = this.l1;
        if (tg0Var != null) {
            tg0Var.setAlpha(f10);
        }
    }

    public void setAnimatedFileMaybe(x5 x5Var) {
        bh0 bh0Var;
        if (x5Var == null || (bh0Var = this.f27451z0) == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof n9) && bh0Var.k(bh0Var.d.indexOf(childAt)) == 0) {
                n9 n9Var = (n9) childAt;
                x5 animation = n9Var.getImageReceiver().getAnimation();
                if (animation != x5Var) {
                    if (animation != null) {
                        animation.w(n9Var);
                    }
                    n9Var.setImageDrawable(x5Var);
                    x5Var.f(this);
                    x5Var.N = true;
                }
            }
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.B0 = chatFull;
        ArrayList arrayList = this.R0;
        if (arrayList.isEmpty() || arrayList.get(0) != null || this.B0 == null) {
            return;
        }
        ArrayList arrayList2 = this.T0;
        if (arrayList2.get(0) == null || !FileLoader.isSamePhoto((TLRPC.FileLocation) ((ImageLocation) arrayList2.get(0)).location, this.B0.chat_photo)) {
            return;
        }
        arrayList.set(0, this.B0.chat_photo);
        boolean zIsEmpty = this.B0.chat_photo.video_sizes.isEmpty();
        ArrayList arrayList3 = this.P0;
        ArrayList arrayList4 = this.S0;
        if (zIsEmpty) {
            arrayList4.set(0, null);
            arrayList3.add(0, null);
        } else {
            TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(this.B0.chat_photo.video_sizes, 1000);
            arrayList4.set(0, ImageLocation.getForPhoto(closestVideoSizeWithSize, this.B0.chat_photo));
            arrayList3.set(0, FileLoader.getAttachFileName(closestVideoSizeWithSize));
            xg0 xg0Var = this.C0;
            if (xg0Var != null) {
                xg0Var.c();
            }
        }
        this.X0.set(0, null);
        this.f27451z0.g();
    }

    public void setCreateThumbFromParent(boolean z10) {
        this.f27432a1 = z10;
    }

    public void setData(long j10) {
        M(j10, false);
    }

    public void setHasActiveVideo(boolean z10) {
        this.f27436e1 = z10;
    }

    public void setImagesLayerNum(int i10) {
        this.f27439h1 = i10;
    }

    public void setInvalidateWithParent(boolean z10) {
        this.f27434c1 = z10;
    }

    public void setParentAvatarImage(n9 n9Var) {
        bh0 bh0Var = this.f27451z0;
        if (bh0Var != null) {
            bh0Var.f27103g = n9Var;
        }
    }

    public void setPinchToZoomHelper(org.telegram.ui.ou0 ou0Var) {
        this.f27435d1 = ou0Var;
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        tg0 tg0Var = this.l1;
        if (tg0Var != null) {
            tg0Var.setVisibility(i10);
        }
    }

    public void setCustomAvatarProgress(float f10) {
    }

    public ch0(Context context, long j10, org.telegram.ui.ActionBar.k kVar, zk0 zk0Var, org.telegram.ui.iz0 iz0Var, xg0 xg0Var, tg0 tg0Var) {
        super(context);
        this.f27445t0 = new PointF();
        this.f27448w0 = true;
        this.f27449x0 = true;
        int i10 = UserConfig.selectedAccount;
        this.H0 = i10;
        this.I0 = new Path();
        this.J0 = new RectF();
        this.K0 = new float[8];
        this.P0 = new ArrayList();
        this.Q0 = new ArrayList();
        this.R0 = new ArrayList();
        this.S0 = new ArrayList();
        this.T0 = new ArrayList();
        this.U0 = new ArrayList();
        this.V0 = new ArrayList();
        this.W0 = new ArrayList();
        this.X0 = new ArrayList();
        this.Z0 = new SparseArray();
        this.f27432a1 = true;
        this.f27437f1 = -1;
        this.f27438g1 = -1;
        this.l1 = tg0Var;
        setPadding(0, 0, 0, tg0Var == null ? 0 : tg0Var.f32775n);
        if (tg0Var != null) {
            tg0Var.setView(this);
        }
        setVisibility(8);
        setOverScrollMode(2);
        setOffscreenPageLimit(2);
        this.F0 = true;
        this.A0 = j10;
        this.f27450y0 = zk0Var;
        this.f27447v0 = kVar;
        bh0 bh0Var = new bh0(this, getContext(), iz0Var);
        this.f27451z0 = bh0Var;
        setAdapter((jp) bh0Var);
        this.f27446u0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.C0 = xg0Var;
        b(new vg0((org.telegram.ui.my0) this));
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.dialogPhotosLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.reloadDialogPhotos);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.dialogPhotosUpdate);
        MessagesController.DialogPhotos dialogPhotos = MessagesController.getInstance(i10).getDialogPhotos(j10);
        this.O0 = dialogPhotos;
        dialogPhotos.loadCache();
    }
}
