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
public class ah0 extends mp implements NotificationCenter.NotificationCenterDelegate {
    public long A0;
    public TLRPC.ChatFull B0;
    public final vg0 C0;
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
    public u51 N0;
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
    public boolean f26795a1;
    public boolean f26796b1;
    public boolean f26797c1;
    public org.telegram.ui.nu0 f26798d1;
    public boolean f26799e1;
    public int f26800f1;
    public int f26801g1;
    public int f26802h1;
    public int f26803i1;
    public int f26804j1;
    public int f26805k1;
    public rg0 l1;
    public ImageLocation f26806m1;
    public ImageLocation f26807n1;
    public final PointF f26808t0;
    public final int f26809u0;
    public final org.telegram.ui.ActionBar.k f26810v0;
    public boolean f26811w0;
    public boolean f26812x0;
    public final wk0 f26813y0;
    public final zg0 f26814z0;

    public ah0(Context context, org.telegram.ui.ActionBar.k kVar, wk0 wk0Var, org.telegram.ui.q4 q4Var) {
        super(context);
        this.f26808t0 = new PointF();
        this.f26811w0 = true;
        this.f26812x0 = true;
        int i9 = UserConfig.selectedAccount;
        this.H0 = i9;
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
        this.f26795a1 = true;
        this.f26800f1 = -1;
        this.f26801g1 = -1;
        setOffscreenPageLimit(2);
        this.l1 = null;
        this.F0 = false;
        this.f26813y0 = wk0Var;
        ConnectionsManager.generateClassGuid();
        this.f26810v0 = kVar;
        this.f26809u0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.C0 = q4Var;
        b(new sg0(this));
        zg0 zg0Var = new zg0(this, getContext(), null);
        this.f26814z0 = zg0Var;
        setAdapter((lp) zg0Var);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.dialogPhotosLoaded);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.reloadDialogPhotos);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.dialogPhotosUpdate);
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
        this.f26814z0.g();
        L();
        this.f26806m1 = imageLocation;
        this.f26807n1 = imageLocation2;
    }

    public final void B(float f10, int i9) {
        float f11;
        int i10 = this.f26800f1;
        float f12 = 0.0f;
        if (i10 >= 0 || this.f26801g1 >= 0) {
            if (i10 < 0) {
                i10 = this.f26801g1;
            }
            int k10 = this.f26814z0.k(i9);
            if (this.f26799e1) {
                k10--;
            }
            if (k10 == i10) {
                f11 = 1.0f - f10;
            } else if (getRealCount() > 0 && (k10 - 1) % getRealCount() == i10) {
                f11 = (1.0f - f10) - 1.0f;
            } else if (getRealCount() > 0 && (k10 + 1) % getRealCount() == i10) {
                f11 = (1.0f - f10) + 1.0f;
            } else {
                f11 = 0.0f;
            }
            if (f11 > 1.0f) {
                f11 = 2.0f - f11;
            }
            f12 = Utilities.clamp(f11, 1.0f, 0.0f);
        }
        setCustomAvatarProgress(f12);
    }

    public final ImageLocation C(ImageLocation imageLocation, ImageLocation imageLocation2) {
        ArrayList arrayList;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        if (imageLocation == null) {
            return null;
        }
        for (int i9 = 0; i9 < 2; i9++) {
            if (i9 == 0) {
                arrayList = this.U0;
            } else {
                arrayList = this.T0;
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ImageLocation imageLocation3 = (ImageLocation) arrayList.get(i10);
                if (imageLocation3 != null && (tL_fileLocationToBeDeprecated = imageLocation3.location) != null) {
                    int i11 = imageLocation3.dc_id;
                    if (i11 == imageLocation.dc_id) {
                        int i12 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = imageLocation.location;
                        if (i12 == tL_fileLocationToBeDeprecated2.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated2.volume_id) {
                            return (ImageLocation) this.S0.get(i10);
                        }
                    }
                    if (i11 == imageLocation2.dc_id) {
                        int i13 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = imageLocation2.location;
                        if (i13 == tL_fileLocationToBeDeprecated3.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated3.volume_id) {
                            return (ImageLocation) this.S0.get(i10);
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public final ImageLocation D(int i9) {
        if (i9 >= 0) {
            ArrayList arrayList = this.T0;
            if (i9 < arrayList.size()) {
                ImageLocation imageLocation = (ImageLocation) this.S0.get(i9);
                if (imageLocation != null) {
                    return imageLocation;
                }
                return (ImageLocation) arrayList.get(i9);
            }
            return null;
        }
        return null;
    }

    public final View E(int i9) {
        zg0 zg0Var = this.f26814z0;
        if (zg0Var != null) {
            ArrayList arrayList = zg0Var.f35305c;
            if (arrayList.size() > i9 && i9 >= 0) {
                wg0 wg0Var = (wg0) arrayList.get(i9);
                xg0 xg0Var = wg0Var.f34225b;
                if (xg0Var == null) {
                    return wg0Var.f34226c;
                }
                return xg0Var;
            }
            return null;
        }
        return null;
    }

    public final TLRPC.Photo F(int i9) {
        if (i9 >= 0) {
            ArrayList arrayList = this.R0;
            if (i9 < arrayList.size()) {
                return (TLRPC.Photo) arrayList.get(i9);
            }
            return null;
        }
        return null;
    }

    public final ImageLocation G(int i9) {
        if (i9 >= 0) {
            ArrayList arrayList = this.T0;
            if (i9 < arrayList.size()) {
                return (ImageLocation) arrayList.get(i9);
            }
            return null;
        }
        return null;
    }

    public final boolean H(u51 u51Var, ImageLocation imageLocation, ImageLocation imageLocation2, boolean z10) {
        MessagesController.DialogPhotos dialogPhotos;
        int i9;
        MessagesController.DialogPhotos dialogPhotos2;
        int i10 = 0;
        if (imageLocation != null && imageLocation2 != null && this.Y0 == 0) {
            ImageLocation imageLocation3 = this.L0;
            ArrayList arrayList = this.T0;
            if (imageLocation3 == null || imageLocation3.location.local_id != imageLocation.location.local_id) {
                boolean isEmpty = arrayList.isEmpty();
                zg0 zg0Var = this.f26814z0;
                if (!isEmpty) {
                    this.L0 = imageLocation;
                    if (z10 && (dialogPhotos2 = this.O0) != null) {
                        dialogPhotos2.reset();
                        MessagesController.DialogPhotos dialogPhotos3 = this.O0;
                        int currentItem = getCurrentItem();
                        if (zg0Var != null) {
                            i10 = zg0Var.j();
                        }
                        dialogPhotos3.loadAfter(currentItem - i10, true);
                    }
                    return true;
                } else if (z10 && (dialogPhotos = this.O0) != null) {
                    dialogPhotos.reset();
                    MessagesController.DialogPhotos dialogPhotos4 = this.O0;
                    int currentItem2 = getCurrentItem();
                    if (zg0Var != null) {
                        i9 = zg0Var.j();
                    } else {
                        i9 = 0;
                    }
                    dialogPhotos4.loadAfter(currentItem2 - i9, true);
                }
            }
            if (arrayList.isEmpty()) {
                this.L0 = imageLocation;
                this.M0 = imageLocation2;
                this.N0 = u51Var;
                this.Q0.add(null);
                this.P0.add(null);
                arrayList.add(imageLocation);
                this.U0.add(imageLocation2);
                this.V0.add(u51Var);
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
        if (this.f26799e1) {
            if (realPosition != 0) {
                realPosition--;
            } else {
                return false;
            }
        }
        if (realPosition >= 0) {
            ArrayList arrayList = this.S0;
            if (realPosition < arrayList.size() && arrayList.get(realPosition) != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean J() {
        int realPosition;
        o9 currentItemView;
        if (this.f26799e1) {
            realPosition = getRealPosition() - 1;
        } else {
            realPosition = getRealPosition();
        }
        if (this.S0.get(realPosition) != null && (currentItemView = getCurrentItemView()) != null) {
            x5 animation = currentItemView.getImageReceiver().getAnimation();
            if (animation == null || !animation.s()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void K() {
        this.l1 = null;
        int i9 = this.H0;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.dialogPhotosLoaded);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i9);
        int i10 = NotificationCenter.fileLoadProgressChanged;
        notificationCenter.removeObserver(this, i10);
        NotificationCenter.getInstance(i9).removeObserver(this, i10);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.reloadDialogPhotos);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.dialogPhotosUpdate);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof o9) {
                o9 o9Var = (o9) childAt;
                if (o9Var.getImageReceiver().hasStaticThumb()) {
                    Drawable drawable = o9Var.getImageReceiver().getDrawable();
                    if (drawable instanceof x5) {
                        ((x5) drawable).w(o9Var);
                    }
                }
            }
        }
    }

    public final void L() {
        x(this.f26814z0.j(), false);
    }

    public final void M(long j10, boolean z10) {
        if (this.A0 == j10 && !z10) {
            L();
            return;
        }
        this.f26796b1 = true;
        this.P0.clear();
        this.Q0.clear();
        this.R0.clear();
        this.S0.clear();
        this.T0.clear();
        this.U0.clear();
        this.W0.clear();
        this.X0.clear();
        this.f26814z0.g();
        x(0, false);
        this.f26805k1 = 0;
        this.G0 = null;
        this.L0 = null;
        this.A0 = j10;
        MessagesController.DialogPhotos dialogPhotos = MessagesController.getInstance(this.H0).getDialogPhotos(j10);
        this.O0 = dialogPhotos;
        dialogPhotos.loadCache();
    }

    public final void N(int i9, int i10) {
        this.f26803i1 = i9;
        this.f26804j1 = i10;
        zg0 zg0Var = this.f26814z0;
        if (zg0Var != null) {
            for (int i11 = 0; i11 < zg0Var.f35305c.size(); i11++) {
                if (((wg0) zg0Var.f35305c.get(i11)).f34226c != null) {
                    ug0 ug0Var = ((wg0) zg0Var.f35305c.get(i11)).f34226c;
                    int i12 = this.f26803i1;
                    int i13 = this.f26804j1;
                    ug0Var.r(i12, i12, i13, i13);
                }
            }
        }
    }

    public final void O(ImageLocation imageLocation, float f10) {
        if (imageLocation != null) {
            int i9 = 0;
            while (true) {
                ArrayList arrayList = this.T0;
                if (i9 >= arrayList.size()) {
                    break;
                } else if (arrayList.get(i9) == imageLocation) {
                    this.X0.set(i9, Float.valueOf(f10));
                    SparseArray sparseArray = this.Z0;
                    if (sparseArray.get(i9) != null) {
                        ((RadialProgress2) sparseArray.get(i9)).o(f10, true);
                    }
                } else {
                    i9++;
                }
            }
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                getChildAt(i10).invalidate();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        MessagesController.DialogPhotos dialogPhotos;
        int i11;
        TLRPC.User user;
        ArrayList arrayList;
        ImageLocation imageLocation;
        int i12;
        boolean z10;
        ah0 ah0Var;
        boolean z11;
        int i13;
        int i14;
        ArrayList arrayList2;
        ImageLocation imageLocation2;
        Integer num;
        ArrayList<TLRPC.PhotoSize> arrayList3;
        TLRPC.PhotoSize photoSize;
        ArrayList arrayList4;
        Integer num2;
        TLRPC.User user2;
        TLRPC.PhotoSize photoSize2;
        boolean z12;
        boolean z13;
        TLRPC.User user3;
        Object obj;
        boolean z14;
        boolean z15;
        TLRPC.Photo photo;
        ah0 ah0Var2 = this;
        Integer num3 = -1;
        int i15 = NotificationCenter.dialogPhotosUpdate;
        ArrayList arrayList5 = ah0Var2.Q0;
        ArrayList arrayList6 = ah0Var2.P0;
        if (i9 == i15) {
            MessagesController.DialogPhotos dialogPhotos2 = (MessagesController.DialogPhotos) objArr[0];
            if (ah0Var2.O0 == dialogPhotos2) {
                ArrayList arrayList7 = new ArrayList(dialogPhotos2.photos);
                if (!arrayList7.isEmpty() || !dialogPhotos2.fromCache) {
                    ah0Var2.f26800f1 = -1;
                    ah0Var2.f26801g1 = -1;
                    int i16 = ah0Var2.H0;
                    TLRPC.User user4 = MessagesController.getInstance(i16).getUser(Long.valueOf(ah0Var2.A0));
                    TLRPC.UserFull userFull = MessagesController.getInstance(i16).getUserFull(ah0Var2.A0);
                    if (userFull != null && (photo = userFull.personal_photo) != null) {
                        arrayList7.add(0, photo);
                        ah0Var2.f26800f1 = 0;
                    }
                    if (user4 != null && user4.self && UserObject.hasFallbackPhoto(userFull)) {
                        arrayList7.add(userFull.fallback_photo);
                        ah0Var2.f26801g1 = arrayList7.size() - 1;
                    }
                    arrayList5.clear();
                    arrayList6.clear();
                    ArrayList arrayList8 = ah0Var2.T0;
                    arrayList8.clear();
                    ArrayList arrayList9 = ah0Var2.S0;
                    arrayList9.clear();
                    ArrayList arrayList10 = ah0Var2.U0;
                    arrayList10.clear();
                    ArrayList arrayList11 = ah0Var2.V0;
                    arrayList11.clear();
                    ArrayList arrayList12 = ah0Var2.R0;
                    arrayList12.clear();
                    ArrayList arrayList13 = ah0Var2.W0;
                    arrayList13.clear();
                    ArrayList arrayList14 = ah0Var2.X0;
                    arrayList14.clear();
                    if (DialogObject.isChatDialog(ah0Var2.A0)) {
                        TLRPC.Chat chat = MessagesController.getInstance(i16).getChat(Long.valueOf(-ah0Var2.A0));
                        imageLocation = ImageLocation.getForUserOrChat(i16, chat, 0);
                        arrayList = arrayList8;
                        if (imageLocation != null) {
                            arrayList.add(imageLocation);
                            user = user4;
                            arrayList10.add(ImageLocation.getForUserOrChat(i16, chat, 1));
                            arrayList11.add(null);
                            arrayList5.add(null);
                            TLRPC.ChatFull chatFull = ah0Var2.B0;
                            if (chatFull != null && FileLoader.isSamePhoto((TLRPC.FileLocation) imageLocation.location, chatFull.chat_photo)) {
                                arrayList12.add(ah0Var2.B0.chat_photo);
                                if (!ah0Var2.B0.chat_photo.video_sizes.isEmpty()) {
                                    TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(ah0Var2.B0.chat_photo.video_sizes, 1000);
                                    arrayList9.add(ImageLocation.getForPhoto(closestVideoSizeWithSize, ah0Var2.B0.chat_photo));
                                    arrayList6.add(FileLoader.getAttachFileName(closestVideoSizeWithSize));
                                    z15 = false;
                                } else {
                                    z15 = false;
                                    arrayList9.add(null);
                                    arrayList6.add(null);
                                }
                            } else {
                                z15 = false;
                                arrayList12.add(null);
                                arrayList6.add(null);
                                arrayList9.add(null);
                            }
                            arrayList13.add(num3);
                            arrayList14.add(z15);
                        } else {
                            user = user4;
                        }
                    } else {
                        user = user4;
                        arrayList = arrayList8;
                        imageLocation = null;
                    }
                    int i17 = 0;
                    while (true) {
                        int size = arrayList7.size();
                        i12 = i16;
                        z10 = ah0Var2.F0;
                        if (i17 >= size) {
                            break;
                        }
                        TLRPC.Photo photo2 = (TLRPC.Photo) arrayList7.get(i17);
                        if (photo2 == null || (photo2 instanceof TLRPC.TL_photoEmpty) || (arrayList3 = photo2.sizes) == null) {
                            i14 = i17;
                            arrayList2 = arrayList7;
                            imageLocation2 = imageLocation;
                            num = num3;
                            arrayList12.add(null);
                            arrayList.add(null);
                            arrayList10.add(null);
                            arrayList11.add(null);
                            arrayList5.add(null);
                            arrayList9.add(null);
                            arrayList6.add(null);
                            arrayList13.add(num);
                            arrayList14.add(null);
                        } else {
                            i14 = i17;
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList3, 50);
                            int size2 = photo2.sizes.size();
                            int i18 = 0;
                            while (true) {
                                if (i18 < size2) {
                                    int i19 = size2;
                                    TLRPC.PhotoSize photoSize3 = photo2.sizes.get(i18);
                                    int i20 = i18;
                                    if (photoSize3 instanceof TLRPC.TL_photoStrippedSize) {
                                        photoSize = photoSize3;
                                        break;
                                    } else {
                                        i18 = i20 + 1;
                                        size2 = i19;
                                    }
                                } else {
                                    photoSize = closestPhotoSizeWithSize;
                                    break;
                                }
                            }
                            if (imageLocation != null) {
                                int size3 = photo2.sizes.size();
                                arrayList2 = arrayList7;
                                int i21 = 0;
                                while (i21 < size3) {
                                    int i22 = size3;
                                    TLRPC.FileLocation fileLocation = photo2.sizes.get(i21).location;
                                    int i23 = i21;
                                    if (fileLocation != null) {
                                        int i24 = fileLocation.local_id;
                                        arrayList4 = arrayList14;
                                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = imageLocation.location;
                                        imageLocation2 = imageLocation;
                                        if (i24 == tL_fileLocationToBeDeprecated.local_id) {
                                            num2 = num3;
                                            if (fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                                                arrayList12.set(0, photo2);
                                                if (!photo2.video_sizes.isEmpty()) {
                                                    arrayList9.set(0, ImageLocation.getForPhoto(FileLoader.getClosestVideoSizeWithSize(photo2.video_sizes, 1000), photo2));
                                                }
                                                num = num2;
                                                arrayList14 = arrayList4;
                                            } else {
                                                num3 = num2;
                                                arrayList14 = arrayList4;
                                                imageLocation = imageLocation2;
                                                i21 = i23 + 1;
                                                size3 = i22;
                                            }
                                        }
                                    } else {
                                        arrayList4 = arrayList14;
                                        imageLocation2 = imageLocation;
                                    }
                                    num2 = num3;
                                    num3 = num2;
                                    arrayList14 = arrayList4;
                                    imageLocation = imageLocation2;
                                    i21 = i23 + 1;
                                    size3 = i22;
                                }
                                num2 = num3;
                                arrayList4 = arrayList14;
                                imageLocation2 = imageLocation;
                            } else {
                                arrayList2 = arrayList7;
                                arrayList4 = arrayList14;
                                imageLocation2 = imageLocation;
                                num2 = num3;
                            }
                            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 640);
                            if (closestPhotoSizeWithSize2 != null) {
                                int i25 = photo2.dc_id;
                                if (i25 != 0) {
                                    TLRPC.FileLocation fileLocation2 = closestPhotoSizeWithSize2.location;
                                    fileLocation2.dc_id = i25;
                                    fileLocation2.file_reference = photo2.file_reference;
                                }
                                ImageLocation forPhoto = ImageLocation.getForPhoto(closestPhotoSizeWithSize2, photo2);
                                if (forPhoto != null) {
                                    ImageLocation imageLocation3 = ah0Var2.L0;
                                    num = num2;
                                    if (imageLocation3 != null) {
                                        if (imageLocation3.photoId == forPhoto.photoId && !z10 && ah0Var2.A0 != UserConfig.getInstance(i12).getClientUserId()) {
                                            arrayList5.add(null);
                                            arrayList.add(ah0Var2.L0);
                                            ImageLocation imageLocation4 = ah0Var2.M0;
                                            if (imageLocation4 == null) {
                                                imageLocation4 = ImageLocation.getForPhoto(photoSize, photo2);
                                            }
                                            arrayList10.add(imageLocation4);
                                            if (!photo2.video_sizes.isEmpty()) {
                                                TLRPC.VideoSize closestVideoSizeWithSize2 = FileLoader.getClosestVideoSizeWithSize(photo2.video_sizes, 1000);
                                                TLRPC.VideoSize vectorMarkupVideoSize = FileLoader.getVectorMarkupVideoSize(photo2);
                                                if (vectorMarkupVideoSize != null) {
                                                    user3 = user;
                                                    if (user != null && user3.premium) {
                                                        z14 = true;
                                                    } else {
                                                        z14 = false;
                                                    }
                                                    arrayList11.add(new u51(vectorMarkupVideoSize, z14, 2));
                                                    obj = null;
                                                    arrayList9.add(null);
                                                    arrayList6.add(null);
                                                } else {
                                                    user3 = user;
                                                    obj = null;
                                                    arrayList11.add(null);
                                                    arrayList9.add(ImageLocation.getForPhoto(closestVideoSizeWithSize2, photo2));
                                                    arrayList6.add(FileLoader.getAttachFileName(closestVideoSizeWithSize2));
                                                }
                                            } else {
                                                user3 = user;
                                                obj = null;
                                                arrayList11.add(ah0Var2.N0);
                                                arrayList9.add(null);
                                                arrayList6.add(null);
                                            }
                                            arrayList12.add(obj);
                                            arrayList13.add(num);
                                            arrayList14 = arrayList4;
                                            arrayList14.add(obj);
                                            user = user3;
                                        } else {
                                            user2 = user;
                                            arrayList14 = arrayList4;
                                        }
                                    } else {
                                        arrayList14 = arrayList4;
                                        user2 = user;
                                    }
                                    arrayList.add(forPhoto);
                                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                        photoSize2 = closestPhotoSizeWithSize2;
                                    } else {
                                        photoSize2 = photoSize;
                                    }
                                    arrayList5.add(FileLoader.getAttachFileName(photoSize2));
                                    arrayList10.add(ImageLocation.getForPhoto(photoSize, photo2));
                                    if (!photo2.video_sizes.isEmpty()) {
                                        TLRPC.VideoSize closestVideoSizeWithSize3 = FileLoader.getClosestVideoSizeWithSize(photo2.video_sizes, 1000);
                                        TLRPC.VideoSize vectorMarkupVideoSize2 = FileLoader.getVectorMarkupVideoSize(photo2);
                                        if (vectorMarkupVideoSize2 != null) {
                                            if (user2 != null && user2.premium) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            user = user2;
                                            arrayList11.add(new u51(vectorMarkupVideoSize2, z13, 2));
                                            z12 = false;
                                            arrayList9.add(null);
                                            arrayList6.add(null);
                                        } else {
                                            user = user2;
                                            z12 = false;
                                            arrayList11.add(null);
                                            arrayList9.add(ImageLocation.getForPhoto(closestVideoSizeWithSize3, photo2));
                                            arrayList6.add(FileLoader.getAttachFileName(closestVideoSizeWithSize3));
                                        }
                                    } else {
                                        user = user2;
                                        z12 = false;
                                        arrayList9.add(null);
                                        arrayList6.add(null);
                                        arrayList11.add(null);
                                    }
                                    arrayList12.add(photo2);
                                    arrayList13.add(Integer.valueOf(closestPhotoSizeWithSize2.size));
                                    arrayList14.add(z12);
                                }
                            }
                            num = num2;
                            arrayList14 = arrayList4;
                        }
                        i17 = i14 + 1;
                        ah0Var2 = this;
                        num3 = num;
                        i16 = i12;
                        arrayList7 = arrayList2;
                        imageLocation = imageLocation2;
                    }
                    int size4 = arrayList10.size();
                    if (size4 > 1) {
                        int i26 = 0;
                        while (true) {
                            if (size4 > 2) {
                                i13 = 2;
                            } else {
                                i13 = 1;
                            }
                            if (i26 >= i13) {
                                break;
                            }
                            FileLoader.getInstance(i12).loadFile((ImageLocation) arrayList10.get(i26 == 0 ? 1 : size4 - 1), null, null, 0, 1);
                            i26++;
                        }
                    }
                    getAdapter().g();
                    if (z10) {
                        ah0Var = this;
                        if (!ah0Var.D0 || ah0Var.f26796b1) {
                            ah0Var.L();
                        }
                    } else {
                        ah0Var = this;
                        if (!ah0Var.D0 || ah0Var.f26796b1) {
                            ah0Var.L();
                            ah0Var.getAdapter().g();
                            ah0Var.B(0.0f, ah0Var.getRealPosition());
                        }
                    }
                    if (ah0Var.f26801g1 < 0 && ah0Var.f26800f1 < 0) {
                        z11 = false;
                        ah0Var.B(0.0f, 0);
                    } else {
                        z11 = false;
                    }
                    ah0Var.f26796b1 = z11;
                    vg0 vg0Var = ah0Var.C0;
                    if (vg0Var != null) {
                        vg0Var.c();
                    }
                    ImageLocation imageLocation5 = ah0Var.f26806m1;
                    if (imageLocation5 != null) {
                        ah0Var.A(imageLocation5, ah0Var.f26807n1);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int i27 = NotificationCenter.fileLoaded;
        SparseArray sparseArray = ah0Var2.Z0;
        if (i9 == i27) {
            String str = (String) objArr[0];
            for (int i28 = 0; i28 < arrayList5.size(); i28++) {
                String str2 = (String) arrayList6.get(i28);
                if (str2 == null) {
                    str2 = (String) arrayList5.get(i28);
                }
                if (str2 != null && TextUtils.equals(str, str2)) {
                    RadialProgress2 radialProgress2 = (RadialProgress2) sparseArray.get(i28);
                    if (radialProgress2 != null) {
                        radialProgress2.o(1.0f, true);
                    }
                    ah0Var2.invalidate();
                }
            }
        } else if (i9 == NotificationCenter.fileLoadProgressChanged) {
            String str3 = (String) objArr[0];
            for (int i29 = 0; i29 < arrayList5.size(); i29++) {
                String str4 = (String) arrayList6.get(i29);
                if (str4 == null) {
                    str4 = (String) arrayList5.get(i29);
                }
                if (str4 != null && TextUtils.equals(str3, str4)) {
                    RadialProgress2 radialProgress22 = (RadialProgress2) sparseArray.get(i29);
                    if (radialProgress22 != null) {
                        radialProgress22.o(Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue())), true);
                    }
                    ah0Var2.invalidate();
                }
            }
        } else if (i9 == NotificationCenter.reloadDialogPhotos && ah0Var2.Y0 == 0 && (dialogPhotos = ah0Var2.O0) != null) {
            dialogPhotos.reset();
            MessagesController.DialogPhotos dialogPhotos3 = ah0Var2.O0;
            int currentItem = ah0Var2.getCurrentItem();
            zg0 zg0Var = ah0Var2.f26814z0;
            if (zg0Var != null) {
                i11 = zg0Var.j();
            } else {
                i11 = 0;
            }
            dialogPhotos3.loadAfter(currentItem - i11, true);
        }
    }

    public rg0 getBlurDrawer() {
        return this.l1;
    }

    public float getCurrentItemProgress() {
        x5 animation;
        o9 currentItemView = getCurrentItemView();
        if (currentItemView == null || (animation = currentItemView.getImageReceiver().getAnimation()) == null) {
            return 0.0f;
        }
        return animation.n();
    }

    public o9 getCurrentItemView() {
        zg0 zg0Var = this.f26814z0;
        if (zg0Var != null && !zg0Var.f35305c.isEmpty()) {
            return ((wg0) zg0Var.f35305c.get(getCurrentItem())).f34226c;
        }
        return null;
    }

    public long getDialogId() {
        return this.A0;
    }

    public int getRealCount() {
        int size = this.R0.size();
        if (this.f26799e1) {
            return size + 1;
        }
        return size;
    }

    public int getRealPosition() {
        return this.f26814z0.k(getCurrentItem());
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f26813y0.getScrollState() != 0) {
            return false;
        }
        if (getParent() != null && getParent().getParent() != null) {
            getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        rg0 rg0Var = this.l1;
        if (rg0Var != null) {
            rg0Var.setTranslationY(getHeight() - this.l1.getMeasuredHeight());
        }
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        rg0 rg0Var = this.l1;
        if (rg0Var != null) {
            rg0Var.C = true;
            rg0Var.postInvalidateOnAnimation();
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ah0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        rg0 rg0Var = this.l1;
        if (rg0Var != null) {
            rg0Var.setAlpha(f10);
        }
    }

    public void setAnimatedFileMaybe(x5 x5Var) {
        zg0 zg0Var;
        if (x5Var != null && (zg0Var = this.f26814z0) != null) {
            int childCount = getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                if ((childAt instanceof o9) && zg0Var.k(zg0Var.d.indexOf(childAt)) == 0) {
                    o9 o9Var = (o9) childAt;
                    x5 animation = o9Var.getImageReceiver().getAnimation();
                    if (animation != x5Var) {
                        if (animation != null) {
                            animation.w(o9Var);
                        }
                        o9Var.setImageDrawable(x5Var);
                        x5Var.f(this);
                        x5Var.N = true;
                    }
                }
            }
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.B0 = chatFull;
        ArrayList arrayList = this.R0;
        if (!arrayList.isEmpty() && arrayList.get(0) == null && this.B0 != null) {
            ArrayList arrayList2 = this.T0;
            if (arrayList2.get(0) != null && FileLoader.isSamePhoto((TLRPC.FileLocation) ((ImageLocation) arrayList2.get(0)).location, this.B0.chat_photo)) {
                arrayList.set(0, this.B0.chat_photo);
                boolean isEmpty = this.B0.chat_photo.video_sizes.isEmpty();
                ArrayList arrayList3 = this.P0;
                ArrayList arrayList4 = this.S0;
                if (!isEmpty) {
                    TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(this.B0.chat_photo.video_sizes, 1000);
                    arrayList4.set(0, ImageLocation.getForPhoto(closestVideoSizeWithSize, this.B0.chat_photo));
                    arrayList3.set(0, FileLoader.getAttachFileName(closestVideoSizeWithSize));
                    vg0 vg0Var = this.C0;
                    if (vg0Var != null) {
                        vg0Var.c();
                    }
                } else {
                    arrayList4.set(0, null);
                    arrayList3.add(0, null);
                }
                this.X0.set(0, null);
                this.f26814z0.g();
            }
        }
    }

    public void setCreateThumbFromParent(boolean z10) {
        this.f26795a1 = z10;
    }

    public void setData(long j10) {
        M(j10, false);
    }

    public void setHasActiveVideo(boolean z10) {
        this.f26799e1 = z10;
    }

    public void setImagesLayerNum(int i9) {
        this.f26802h1 = i9;
    }

    public void setInvalidateWithParent(boolean z10) {
        this.f26797c1 = z10;
    }

    public void setParentAvatarImage(o9 o9Var) {
        zg0 zg0Var = this.f26814z0;
        if (zg0Var != null) {
            zg0Var.f35308g = o9Var;
        }
    }

    public void setPinchToZoomHelper(org.telegram.ui.nu0 nu0Var) {
        this.f26798d1 = nu0Var;
    }

    @Override
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        rg0 rg0Var = this.l1;
        if (rg0Var != null) {
            rg0Var.setVisibility(i9);
        }
    }

    public void setCustomAvatarProgress(float f10) {
    }

    public ah0(Context context, long j10, org.telegram.ui.ActionBar.k kVar, wk0 wk0Var, org.telegram.ui.iz0 iz0Var, vg0 vg0Var, rg0 rg0Var) {
        super(context);
        this.f26808t0 = new PointF();
        this.f26811w0 = true;
        this.f26812x0 = true;
        int i9 = UserConfig.selectedAccount;
        this.H0 = i9;
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
        this.f26795a1 = true;
        this.f26800f1 = -1;
        this.f26801g1 = -1;
        this.l1 = rg0Var;
        setPadding(0, 0, 0, rg0Var == null ? 0 : rg0Var.f32166n);
        if (rg0Var != null) {
            rg0Var.setView(this);
        }
        setVisibility(8);
        setOverScrollMode(2);
        setOffscreenPageLimit(2);
        this.F0 = true;
        this.A0 = j10;
        this.f26813y0 = wk0Var;
        this.f26810v0 = kVar;
        zg0 zg0Var = new zg0(this, getContext(), iz0Var);
        this.f26814z0 = zg0Var;
        setAdapter((lp) zg0Var);
        this.f26809u0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.C0 = vg0Var;
        b(new tg0((org.telegram.ui.my0) this));
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.dialogPhotosLoaded);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.reloadDialogPhotos);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.dialogPhotosUpdate);
        MessagesController.DialogPhotos dialogPhotos = MessagesController.getInstance(i9).getDialogPhotos(j10);
        this.O0 = dialogPhotos;
        dialogPhotos.loadCache();
    }
}
