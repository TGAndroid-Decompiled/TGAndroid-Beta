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
public class xh0 extends wp implements NotificationCenter.NotificationCenterDelegate {
    public final wh0 A0;
    public long B0;
    public TLRPC.ChatFull C0;
    public final sh0 D0;
    public boolean E0;
    public boolean F0;
    public final boolean G0;
    public ImageLocation H0;
    public final int I0;
    public final Path J0;
    public final RectF K0;
    public final float[] L0;
    public ImageLocation M0;
    public ImageLocation N0;
    public t61 O0;
    public MessagesController.DialogPhotos P0;
    public final ArrayList Q0;
    public final ArrayList R0;
    public final ArrayList S0;
    public final ArrayList T0;
    public final ArrayList U0;
    public final ArrayList V0;
    public final ArrayList W0;
    public final ArrayList X0;
    public final ArrayList Y0;
    public int Z0;
    public final SparseArray f33077a1;
    public boolean f33078b1;
    public boolean f33079c1;
    public boolean f33080d1;
    public org.telegram.ui.cv0 f33081e1;
    public boolean f33082f1;
    public int f33083g1;
    public int f33084h1;
    public int f33085i1;
    public int f33086j1;
    public int f33087k1;
    public int l1;
    public oh0 f33088m1;
    public ImageLocation f33089n1;
    public ImageLocation f33090o1;
    public final PointF f33091u0;
    public final int f33092v0;
    public final org.telegram.ui.ActionBar.k f33093w0;
    public boolean f33094x0;
    public boolean f33095y0;
    public final sl0 f33096z0;

    public xh0(Context context, org.telegram.ui.ActionBar.k kVar, sl0 sl0Var, org.telegram.ui.t4 t4Var) {
        super(context);
        this.f33091u0 = new PointF();
        this.f33094x0 = true;
        this.f33095y0 = true;
        int i10 = UserConfig.selectedAccount;
        this.I0 = i10;
        this.J0 = new Path();
        this.K0 = new RectF();
        this.L0 = new float[8];
        this.Q0 = new ArrayList();
        this.R0 = new ArrayList();
        this.S0 = new ArrayList();
        this.T0 = new ArrayList();
        this.U0 = new ArrayList();
        this.V0 = new ArrayList();
        this.W0 = new ArrayList();
        this.X0 = new ArrayList();
        this.Y0 = new ArrayList();
        this.f33077a1 = new SparseArray();
        this.f33078b1 = true;
        this.f33083g1 = -1;
        this.f33084h1 = -1;
        setOffscreenPageLimit(2);
        this.f33088m1 = null;
        this.G0 = false;
        this.f33096z0 = sl0Var;
        ConnectionsManager.generateClassGuid();
        this.f33093w0 = kVar;
        this.f33092v0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.D0 = t4Var;
        b(new ph0(this));
        wh0 wh0Var = new wh0(this, getContext(), null);
        this.A0 = wh0Var;
        setAdapter((vp) wh0Var);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.dialogPhotosLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.reloadDialogPhotos);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.dialogPhotosUpdate);
        this.P0 = null;
    }

    public final void A(ImageLocation imageLocation, ImageLocation imageLocation2) {
        this.M0 = imageLocation;
        this.R0.add(0, null);
        this.Q0.add(0, null);
        this.U0.add(0, imageLocation);
        this.V0.add(0, imageLocation2);
        this.W0.add(0, null);
        this.T0.add(0, null);
        this.S0.add(0, null);
        this.X0.add(0, -1);
        this.Y0.add(0, Float.valueOf(0.0f));
        this.A0.g();
        L();
        this.f33089n1 = imageLocation;
        this.f33090o1 = imageLocation2;
    }

    public final void B(float f10, int i10) {
        float f11;
        int i11 = this.f33083g1;
        float f12 = 0.0f;
        if (i11 >= 0 || this.f33084h1 >= 0) {
            if (i11 < 0) {
                i11 = this.f33084h1;
            }
            int k10 = this.A0.k(i10);
            if (this.f33082f1) {
                k10--;
            }
            if (k10 == i11) {
                f11 = 1.0f - f10;
            } else if (getRealCount() > 0 && (k10 - 1) % getRealCount() == i11) {
                f11 = (1.0f - f10) - 1.0f;
            } else if (getRealCount() > 0 && (k10 + 1) % getRealCount() == i11) {
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
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                arrayList = this.V0;
            } else {
                arrayList = this.U0;
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ImageLocation imageLocation3 = (ImageLocation) arrayList.get(i11);
                if (imageLocation3 != null && (tL_fileLocationToBeDeprecated = imageLocation3.location) != null) {
                    int i12 = imageLocation3.dc_id;
                    if (i12 == imageLocation.dc_id) {
                        int i13 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = imageLocation.location;
                        if (i13 == tL_fileLocationToBeDeprecated2.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated2.volume_id) {
                            return (ImageLocation) this.T0.get(i11);
                        }
                    }
                    if (i12 == imageLocation2.dc_id) {
                        int i14 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = imageLocation2.location;
                        if (i14 == tL_fileLocationToBeDeprecated3.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated3.volume_id) {
                            return (ImageLocation) this.T0.get(i11);
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public final ImageLocation D(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.U0;
            if (i10 < arrayList.size()) {
                ImageLocation imageLocation = (ImageLocation) this.T0.get(i10);
                if (imageLocation != null) {
                    return imageLocation;
                }
                return (ImageLocation) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    public final View E(int i10) {
        wh0 wh0Var = this.A0;
        if (wh0Var != null) {
            ArrayList arrayList = wh0Var.f32755c;
            if (arrayList.size() > i10 && i10 >= 0) {
                th0 th0Var = (th0) arrayList.get(i10);
                uh0 uh0Var = th0Var.f31356b;
                if (uh0Var == null) {
                    return th0Var.f31357c;
                }
                return uh0Var;
            }
            return null;
        }
        return null;
    }

    public final TLRPC.Photo F(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.S0;
            if (i10 < arrayList.size()) {
                return (TLRPC.Photo) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    public final ImageLocation G(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.U0;
            if (i10 < arrayList.size()) {
                return (ImageLocation) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    public final boolean H(t61 t61Var, ImageLocation imageLocation, ImageLocation imageLocation2, boolean z4) {
        MessagesController.DialogPhotos dialogPhotos;
        int i10;
        MessagesController.DialogPhotos dialogPhotos2;
        int i11 = 0;
        if (imageLocation != null && imageLocation2 != null && this.Z0 == 0) {
            ImageLocation imageLocation3 = this.M0;
            ArrayList arrayList = this.U0;
            if (imageLocation3 == null || imageLocation3.location.local_id != imageLocation.location.local_id) {
                boolean isEmpty = arrayList.isEmpty();
                wh0 wh0Var = this.A0;
                if (!isEmpty) {
                    this.M0 = imageLocation;
                    if (z4 && (dialogPhotos2 = this.P0) != null) {
                        dialogPhotos2.reset();
                        MessagesController.DialogPhotos dialogPhotos3 = this.P0;
                        int currentItem = getCurrentItem();
                        if (wh0Var != null) {
                            i11 = wh0Var.j();
                        }
                        dialogPhotos3.loadAfter(currentItem - i11, true);
                    }
                    return true;
                } else if (z4 && (dialogPhotos = this.P0) != null) {
                    dialogPhotos.reset();
                    MessagesController.DialogPhotos dialogPhotos4 = this.P0;
                    int currentItem2 = getCurrentItem();
                    if (wh0Var != null) {
                        i10 = wh0Var.j();
                    } else {
                        i10 = 0;
                    }
                    dialogPhotos4.loadAfter(currentItem2 - i10, true);
                }
            }
            if (arrayList.isEmpty()) {
                this.M0 = imageLocation;
                this.N0 = imageLocation2;
                this.O0 = t61Var;
                this.R0.add(null);
                this.Q0.add(null);
                arrayList.add(imageLocation);
                this.V0.add(imageLocation2);
                this.W0.add(t61Var);
                this.T0.add(null);
                this.S0.add(null);
                this.X0.add(-1);
                this.Y0.add(null);
                getAdapter().g();
                L();
                return true;
            }
        }
        return false;
    }

    public final boolean I() {
        int realPosition = getRealPosition();
        if (this.f33082f1) {
            if (realPosition != 0) {
                realPosition--;
            } else {
                return false;
            }
        }
        if (realPosition >= 0) {
            ArrayList arrayList = this.T0;
            if (realPosition < arrayList.size() && arrayList.get(realPosition) != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean J() {
        int realPosition;
        p9 currentItemView;
        if (this.f33082f1) {
            realPosition = getRealPosition() - 1;
        } else {
            realPosition = getRealPosition();
        }
        if (this.T0.get(realPosition) != null && (currentItemView = getCurrentItemView()) != null) {
            y5 animation = currentItemView.getImageReceiver().getAnimation();
            if (animation == null || !animation.s()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void K() {
        this.f33088m1 = null;
        int i10 = this.I0;
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
            if (childAt instanceof p9) {
                p9 p9Var = (p9) childAt;
                if (p9Var.getImageReceiver().hasStaticThumb()) {
                    Drawable drawable = p9Var.getImageReceiver().getDrawable();
                    if (drawable instanceof y5) {
                        ((y5) drawable).w(p9Var);
                    }
                }
            }
        }
    }

    public final void L() {
        x(this.A0.j(), false);
    }

    public final void M(long j10, boolean z4) {
        if (this.B0 == j10 && !z4) {
            L();
            return;
        }
        this.f33079c1 = true;
        this.Q0.clear();
        this.R0.clear();
        this.S0.clear();
        this.T0.clear();
        this.U0.clear();
        this.V0.clear();
        this.X0.clear();
        this.Y0.clear();
        this.A0.g();
        x(0, false);
        this.l1 = 0;
        this.H0 = null;
        this.M0 = null;
        this.B0 = j10;
        MessagesController.DialogPhotos dialogPhotos = MessagesController.getInstance(this.I0).getDialogPhotos(j10);
        this.P0 = dialogPhotos;
        dialogPhotos.loadCache();
    }

    public final void N(int i10, int i11) {
        this.f33086j1 = i10;
        this.f33087k1 = i11;
        wh0 wh0Var = this.A0;
        if (wh0Var != null) {
            for (int i12 = 0; i12 < wh0Var.f32755c.size(); i12++) {
                if (((th0) wh0Var.f32755c.get(i12)).f31357c != null) {
                    rh0 rh0Var = ((th0) wh0Var.f32755c.get(i12)).f31357c;
                    int i13 = this.f33086j1;
                    int i14 = this.f33087k1;
                    rh0Var.r(i13, i13, i14, i14);
                }
            }
        }
    }

    public final void O(ImageLocation imageLocation, float f10) {
        if (imageLocation != null) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.U0;
                if (i10 >= arrayList.size()) {
                    break;
                } else if (arrayList.get(i10) == imageLocation) {
                    this.Y0.set(i10, Float.valueOf(f10));
                    SparseArray sparseArray = this.f33077a1;
                    if (sparseArray.get(i10) != null) {
                        ((RadialProgress2) sparseArray.get(i10)).o(f10, true);
                    }
                } else {
                    i10++;
                }
            }
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                getChildAt(i11).invalidate();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        MessagesController.DialogPhotos dialogPhotos;
        int i12;
        TLRPC.User user;
        ArrayList arrayList;
        ImageLocation imageLocation;
        int i13;
        boolean z4;
        xh0 xh0Var;
        boolean z10;
        int i14;
        int i15;
        ArrayList arrayList2;
        ImageLocation imageLocation2;
        Integer num;
        ArrayList<TLRPC.PhotoSize> arrayList3;
        TLRPC.PhotoSize photoSize;
        ArrayList arrayList4;
        Integer num2;
        TLRPC.User user2;
        TLRPC.PhotoSize photoSize2;
        boolean z11;
        boolean z12;
        TLRPC.User user3;
        Object obj;
        boolean z13;
        boolean z14;
        TLRPC.Photo photo;
        xh0 xh0Var2 = this;
        Integer num3 = -1;
        int i16 = NotificationCenter.dialogPhotosUpdate;
        ArrayList arrayList5 = xh0Var2.R0;
        ArrayList arrayList6 = xh0Var2.Q0;
        if (i10 == i16) {
            MessagesController.DialogPhotos dialogPhotos2 = (MessagesController.DialogPhotos) objArr[0];
            if (xh0Var2.P0 == dialogPhotos2) {
                ArrayList arrayList7 = new ArrayList(dialogPhotos2.photos);
                if (!arrayList7.isEmpty() || !dialogPhotos2.fromCache) {
                    xh0Var2.f33083g1 = -1;
                    xh0Var2.f33084h1 = -1;
                    int i17 = xh0Var2.I0;
                    TLRPC.User user4 = MessagesController.getInstance(i17).getUser(Long.valueOf(xh0Var2.B0));
                    TLRPC.UserFull userFull = MessagesController.getInstance(i17).getUserFull(xh0Var2.B0);
                    if (userFull != null && (photo = userFull.personal_photo) != null) {
                        arrayList7.add(0, photo);
                        xh0Var2.f33083g1 = 0;
                    }
                    if (user4 != null && user4.self && UserObject.hasFallbackPhoto(userFull)) {
                        arrayList7.add(userFull.fallback_photo);
                        xh0Var2.f33084h1 = arrayList7.size() - 1;
                    }
                    arrayList5.clear();
                    arrayList6.clear();
                    ArrayList arrayList8 = xh0Var2.U0;
                    arrayList8.clear();
                    ArrayList arrayList9 = xh0Var2.T0;
                    arrayList9.clear();
                    ArrayList arrayList10 = xh0Var2.V0;
                    arrayList10.clear();
                    ArrayList arrayList11 = xh0Var2.W0;
                    arrayList11.clear();
                    ArrayList arrayList12 = xh0Var2.S0;
                    arrayList12.clear();
                    ArrayList arrayList13 = xh0Var2.X0;
                    arrayList13.clear();
                    ArrayList arrayList14 = xh0Var2.Y0;
                    arrayList14.clear();
                    if (DialogObject.isChatDialog(xh0Var2.B0)) {
                        TLRPC.Chat chat = MessagesController.getInstance(i17).getChat(Long.valueOf(-xh0Var2.B0));
                        imageLocation = ImageLocation.getForUserOrChat(i17, chat, 0);
                        arrayList = arrayList8;
                        if (imageLocation != null) {
                            arrayList.add(imageLocation);
                            user = user4;
                            arrayList10.add(ImageLocation.getForUserOrChat(i17, chat, 1));
                            arrayList11.add(null);
                            arrayList5.add(null);
                            TLRPC.ChatFull chatFull = xh0Var2.C0;
                            if (chatFull != null && FileLoader.isSamePhoto((TLRPC.FileLocation) imageLocation.location, chatFull.chat_photo)) {
                                arrayList12.add(xh0Var2.C0.chat_photo);
                                if (!xh0Var2.C0.chat_photo.video_sizes.isEmpty()) {
                                    TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(xh0Var2.C0.chat_photo.video_sizes, 1000);
                                    arrayList9.add(ImageLocation.getForPhoto(closestVideoSizeWithSize, xh0Var2.C0.chat_photo));
                                    arrayList6.add(FileLoader.getAttachFileName(closestVideoSizeWithSize));
                                    z14 = false;
                                } else {
                                    z14 = false;
                                    arrayList9.add(null);
                                    arrayList6.add(null);
                                }
                            } else {
                                z14 = false;
                                arrayList12.add(null);
                                arrayList6.add(null);
                                arrayList9.add(null);
                            }
                            arrayList13.add(num3);
                            arrayList14.add(z14);
                        } else {
                            user = user4;
                        }
                    } else {
                        user = user4;
                        arrayList = arrayList8;
                        imageLocation = null;
                    }
                    int i18 = 0;
                    while (true) {
                        int size = arrayList7.size();
                        i13 = i17;
                        z4 = xh0Var2.G0;
                        if (i18 >= size) {
                            break;
                        }
                        TLRPC.Photo photo2 = (TLRPC.Photo) arrayList7.get(i18);
                        if (photo2 == null || (photo2 instanceof TLRPC.TL_photoEmpty) || (arrayList3 = photo2.sizes) == null) {
                            i15 = i18;
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
                            i15 = i18;
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList3, 50);
                            int size2 = photo2.sizes.size();
                            int i19 = 0;
                            while (true) {
                                if (i19 < size2) {
                                    int i20 = size2;
                                    TLRPC.PhotoSize photoSize3 = photo2.sizes.get(i19);
                                    int i21 = i19;
                                    if (photoSize3 instanceof TLRPC.TL_photoStrippedSize) {
                                        photoSize = photoSize3;
                                        break;
                                    } else {
                                        i19 = i21 + 1;
                                        size2 = i20;
                                    }
                                } else {
                                    photoSize = closestPhotoSizeWithSize;
                                    break;
                                }
                            }
                            if (imageLocation != null) {
                                int size3 = photo2.sizes.size();
                                arrayList2 = arrayList7;
                                int i22 = 0;
                                while (i22 < size3) {
                                    int i23 = size3;
                                    TLRPC.FileLocation fileLocation = photo2.sizes.get(i22).location;
                                    int i24 = i22;
                                    if (fileLocation != null) {
                                        int i25 = fileLocation.local_id;
                                        arrayList4 = arrayList14;
                                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = imageLocation.location;
                                        imageLocation2 = imageLocation;
                                        if (i25 == tL_fileLocationToBeDeprecated.local_id) {
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
                                                i22 = i24 + 1;
                                                size3 = i23;
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
                                    i22 = i24 + 1;
                                    size3 = i23;
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
                                int i26 = photo2.dc_id;
                                if (i26 != 0) {
                                    TLRPC.FileLocation fileLocation2 = closestPhotoSizeWithSize2.location;
                                    fileLocation2.dc_id = i26;
                                    fileLocation2.file_reference = photo2.file_reference;
                                }
                                ImageLocation forPhoto = ImageLocation.getForPhoto(closestPhotoSizeWithSize2, photo2);
                                if (forPhoto != null) {
                                    ImageLocation imageLocation3 = xh0Var2.M0;
                                    num = num2;
                                    if (imageLocation3 != null) {
                                        if (imageLocation3.photoId == forPhoto.photoId && !z4 && xh0Var2.B0 != UserConfig.getInstance(i13).getClientUserId()) {
                                            arrayList5.add(null);
                                            arrayList.add(xh0Var2.M0);
                                            ImageLocation imageLocation4 = xh0Var2.N0;
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
                                                        z13 = true;
                                                    } else {
                                                        z13 = false;
                                                    }
                                                    arrayList11.add(new t61(vectorMarkupVideoSize, z13, 2));
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
                                                arrayList11.add(xh0Var2.O0);
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
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            user = user2;
                                            arrayList11.add(new t61(vectorMarkupVideoSize2, z12, 2));
                                            z11 = false;
                                            arrayList9.add(null);
                                            arrayList6.add(null);
                                        } else {
                                            user = user2;
                                            z11 = false;
                                            arrayList11.add(null);
                                            arrayList9.add(ImageLocation.getForPhoto(closestVideoSizeWithSize3, photo2));
                                            arrayList6.add(FileLoader.getAttachFileName(closestVideoSizeWithSize3));
                                        }
                                    } else {
                                        user = user2;
                                        z11 = false;
                                        arrayList9.add(null);
                                        arrayList6.add(null);
                                        arrayList11.add(null);
                                    }
                                    arrayList12.add(photo2);
                                    arrayList13.add(Integer.valueOf(closestPhotoSizeWithSize2.size));
                                    arrayList14.add(z11);
                                }
                            }
                            num = num2;
                            arrayList14 = arrayList4;
                        }
                        i18 = i15 + 1;
                        xh0Var2 = this;
                        num3 = num;
                        i17 = i13;
                        arrayList7 = arrayList2;
                        imageLocation = imageLocation2;
                    }
                    int size4 = arrayList10.size();
                    if (size4 > 1) {
                        int i27 = 0;
                        while (true) {
                            if (size4 > 2) {
                                i14 = 2;
                            } else {
                                i14 = 1;
                            }
                            if (i27 >= i14) {
                                break;
                            }
                            FileLoader.getInstance(i13).loadFile((ImageLocation) arrayList10.get(i27 == 0 ? 1 : size4 - 1), null, null, 0, 1);
                            i27++;
                        }
                    }
                    getAdapter().g();
                    if (z4) {
                        xh0Var = this;
                        if (!xh0Var.E0 || xh0Var.f33079c1) {
                            xh0Var.L();
                        }
                    } else {
                        xh0Var = this;
                        if (!xh0Var.E0 || xh0Var.f33079c1) {
                            xh0Var.L();
                            xh0Var.getAdapter().g();
                            xh0Var.B(0.0f, xh0Var.getRealPosition());
                        }
                    }
                    if (xh0Var.f33084h1 < 0 && xh0Var.f33083g1 < 0) {
                        z10 = false;
                        xh0Var.B(0.0f, 0);
                    } else {
                        z10 = false;
                    }
                    xh0Var.f33079c1 = z10;
                    sh0 sh0Var = xh0Var.D0;
                    if (sh0Var != null) {
                        sh0Var.c();
                    }
                    ImageLocation imageLocation5 = xh0Var.f33089n1;
                    if (imageLocation5 != null) {
                        xh0Var.A(imageLocation5, xh0Var.f33090o1);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int i28 = NotificationCenter.fileLoaded;
        SparseArray sparseArray = xh0Var2.f33077a1;
        if (i10 == i28) {
            String str = (String) objArr[0];
            for (int i29 = 0; i29 < arrayList5.size(); i29++) {
                String str2 = (String) arrayList6.get(i29);
                if (str2 == null) {
                    str2 = (String) arrayList5.get(i29);
                }
                if (str2 != null && TextUtils.equals(str, str2)) {
                    RadialProgress2 radialProgress2 = (RadialProgress2) sparseArray.get(i29);
                    if (radialProgress2 != null) {
                        radialProgress2.o(1.0f, true);
                    }
                    xh0Var2.invalidate();
                }
            }
        } else if (i10 == NotificationCenter.fileLoadProgressChanged) {
            String str3 = (String) objArr[0];
            for (int i30 = 0; i30 < arrayList5.size(); i30++) {
                String str4 = (String) arrayList6.get(i30);
                if (str4 == null) {
                    str4 = (String) arrayList5.get(i30);
                }
                if (str4 != null && TextUtils.equals(str3, str4)) {
                    RadialProgress2 radialProgress22 = (RadialProgress2) sparseArray.get(i30);
                    if (radialProgress22 != null) {
                        radialProgress22.o(Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue())), true);
                    }
                    xh0Var2.invalidate();
                }
            }
        } else if (i10 == NotificationCenter.reloadDialogPhotos && xh0Var2.Z0 == 0 && (dialogPhotos = xh0Var2.P0) != null) {
            dialogPhotos.reset();
            MessagesController.DialogPhotos dialogPhotos3 = xh0Var2.P0;
            int currentItem = xh0Var2.getCurrentItem();
            wh0 wh0Var = xh0Var2.A0;
            if (wh0Var != null) {
                i12 = wh0Var.j();
            } else {
                i12 = 0;
            }
            dialogPhotos3.loadAfter(currentItem - i12, true);
        }
    }

    public oh0 getBlurDrawer() {
        return this.f33088m1;
    }

    public float getCurrentItemProgress() {
        y5 animation;
        p9 currentItemView = getCurrentItemView();
        if (currentItemView == null || (animation = currentItemView.getImageReceiver().getAnimation()) == null) {
            return 0.0f;
        }
        return animation.n();
    }

    public p9 getCurrentItemView() {
        wh0 wh0Var = this.A0;
        if (wh0Var != null && !wh0Var.f32755c.isEmpty()) {
            return ((th0) wh0Var.f32755c.get(getCurrentItem())).f31357c;
        }
        return null;
    }

    public long getDialogId() {
        return this.B0;
    }

    public int getRealCount() {
        int size = this.S0.size();
        if (this.f33082f1) {
            return size + 1;
        }
        return size;
    }

    public int getRealPosition() {
        return this.A0.k(getCurrentItem());
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f33096z0.getScrollState() != 0) {
            return false;
        }
        if (getParent() != null && getParent().getParent() != null) {
            getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        oh0 oh0Var = this.f33088m1;
        if (oh0Var != null) {
            oh0Var.setTranslationY(getHeight() - this.f33088m1.getMeasuredHeight());
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        oh0 oh0Var = this.f33088m1;
        if (oh0Var != null) {
            oh0Var.D = true;
            oh0Var.postInvalidateOnAnimation();
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xh0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        oh0 oh0Var = this.f33088m1;
        if (oh0Var != null) {
            oh0Var.setAlpha(f10);
        }
    }

    public void setAnimatedFileMaybe(y5 y5Var) {
        wh0 wh0Var;
        if (y5Var != null && (wh0Var = this.A0) != null) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if ((childAt instanceof p9) && wh0Var.k(wh0Var.d.indexOf(childAt)) == 0) {
                    p9 p9Var = (p9) childAt;
                    y5 animation = p9Var.getImageReceiver().getAnimation();
                    if (animation != y5Var) {
                        if (animation != null) {
                            animation.w(p9Var);
                        }
                        p9Var.setImageDrawable(y5Var);
                        y5Var.f(this);
                        y5Var.O = true;
                    }
                }
            }
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.C0 = chatFull;
        ArrayList arrayList = this.S0;
        if (!arrayList.isEmpty() && arrayList.get(0) == null && this.C0 != null) {
            ArrayList arrayList2 = this.U0;
            if (arrayList2.get(0) != null && FileLoader.isSamePhoto((TLRPC.FileLocation) ((ImageLocation) arrayList2.get(0)).location, this.C0.chat_photo)) {
                arrayList.set(0, this.C0.chat_photo);
                boolean isEmpty = this.C0.chat_photo.video_sizes.isEmpty();
                ArrayList arrayList3 = this.Q0;
                ArrayList arrayList4 = this.T0;
                if (!isEmpty) {
                    TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(this.C0.chat_photo.video_sizes, 1000);
                    arrayList4.set(0, ImageLocation.getForPhoto(closestVideoSizeWithSize, this.C0.chat_photo));
                    arrayList3.set(0, FileLoader.getAttachFileName(closestVideoSizeWithSize));
                    sh0 sh0Var = this.D0;
                    if (sh0Var != null) {
                        sh0Var.c();
                    }
                } else {
                    arrayList4.set(0, null);
                    arrayList3.add(0, null);
                }
                this.Y0.set(0, null);
                this.A0.g();
            }
        }
    }

    public void setCreateThumbFromParent(boolean z4) {
        this.f33078b1 = z4;
    }

    public void setData(long j10) {
        M(j10, false);
    }

    public void setHasActiveVideo(boolean z4) {
        this.f33082f1 = z4;
    }

    public void setImagesLayerNum(int i10) {
        this.f33085i1 = i10;
    }

    public void setInvalidateWithParent(boolean z4) {
        this.f33080d1 = z4;
    }

    public void setParentAvatarImage(p9 p9Var) {
        wh0 wh0Var = this.A0;
        if (wh0Var != null) {
            wh0Var.f32758g = p9Var;
        }
    }

    public void setPinchToZoomHelper(org.telegram.ui.cv0 cv0Var) {
        this.f33081e1 = cv0Var;
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        oh0 oh0Var = this.f33088m1;
        if (oh0Var != null) {
            oh0Var.setVisibility(i10);
        }
    }

    public void setCustomAvatarProgress(float f10) {
    }

    public xh0(Context context, long j10, org.telegram.ui.ActionBar.k kVar, sl0 sl0Var, org.telegram.ui.a01 a01Var, sh0 sh0Var, oh0 oh0Var) {
        super(context);
        this.f33091u0 = new PointF();
        this.f33094x0 = true;
        this.f33095y0 = true;
        int i10 = UserConfig.selectedAccount;
        this.I0 = i10;
        this.J0 = new Path();
        this.K0 = new RectF();
        this.L0 = new float[8];
        this.Q0 = new ArrayList();
        this.R0 = new ArrayList();
        this.S0 = new ArrayList();
        this.T0 = new ArrayList();
        this.U0 = new ArrayList();
        this.V0 = new ArrayList();
        this.W0 = new ArrayList();
        this.X0 = new ArrayList();
        this.Y0 = new ArrayList();
        this.f33077a1 = new SparseArray();
        this.f33078b1 = true;
        this.f33083g1 = -1;
        this.f33084h1 = -1;
        this.f33088m1 = oh0Var;
        setPadding(0, 0, 0, oh0Var == null ? 0 : oh0Var.f29766n);
        if (oh0Var != null) {
            oh0Var.setView(this);
        }
        setVisibility(8);
        setOverScrollMode(2);
        setOffscreenPageLimit(2);
        this.G0 = true;
        this.B0 = j10;
        this.f33096z0 = sl0Var;
        this.f33093w0 = kVar;
        wh0 wh0Var = new wh0(this, getContext(), a01Var);
        this.A0 = wh0Var;
        setAdapter((vp) wh0Var);
        this.f33092v0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.D0 = sh0Var;
        b(new qh0((org.telegram.ui.dz0) this));
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.dialogPhotosLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.reloadDialogPhotos);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.dialogPhotosUpdate);
        MessagesController.DialogPhotos dialogPhotos = MessagesController.getInstance(i10).getDialogPhotos(j10);
        this.P0 = dialogPhotos;
        dialogPhotos.loadCache();
    }
}
