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
public class ni0 extends fq implements NotificationCenter.NotificationCenterDelegate {
    public boolean A0;
    public boolean B0;
    public final lm0 C0;
    public final mi0 D0;
    public long E0;
    public TLRPC.ChatFull F0;
    public final ii0 G0;
    public boolean H0;
    public boolean I0;
    public final boolean J0;
    public ImageLocation K0;
    public final int L0;
    public final Path M0;
    public final RectF N0;
    public final float[] O0;
    public ImageLocation P0;
    public ImageLocation Q0;
    public t71 R0;
    public MessagesController.DialogPhotos S0;
    public final ArrayList T0;
    public final ArrayList U0;
    public final ArrayList V0;
    public final ArrayList W0;
    public final ArrayList X0;
    public final ArrayList Y0;
    public final ArrayList Z0;
    public final ArrayList f28919a1;
    public final ArrayList f28920b1;
    public int f28921c1;
    public final SparseArray f28922d1;
    public boolean f28923e1;
    public boolean f28924f1;
    public boolean f28925g1;
    public org.telegram.ui.xu0 f28926h1;
    public boolean f28927i1;
    public int f28928j1;
    public int f28929k1;
    public int l1;
    public int f28930m1;
    public int f28931n1;
    public int f28932o1;
    public ei0 f28933p1;
    public ImageLocation f28934q1;
    public ImageLocation f28935r1;
    public final PointF f28936x0;
    public final int f28937y0;
    public final org.telegram.ui.ActionBar.k f28938z0;

    public ni0(Context context, org.telegram.ui.ActionBar.k kVar, lm0 lm0Var, org.telegram.ui.v4 v4Var) {
        super(context);
        this.f28936x0 = new PointF();
        this.A0 = true;
        this.B0 = true;
        int i10 = UserConfig.selectedAccount;
        this.L0 = i10;
        this.M0 = new Path();
        this.N0 = new RectF();
        this.O0 = new float[8];
        this.T0 = new ArrayList();
        this.U0 = new ArrayList();
        this.V0 = new ArrayList();
        this.W0 = new ArrayList();
        this.X0 = new ArrayList();
        this.Y0 = new ArrayList();
        this.Z0 = new ArrayList();
        this.f28919a1 = new ArrayList();
        this.f28920b1 = new ArrayList();
        this.f28922d1 = new SparseArray();
        this.f28923e1 = true;
        this.f28928j1 = -1;
        this.f28929k1 = -1;
        setOffscreenPageLimit(2);
        this.f28933p1 = null;
        this.J0 = false;
        this.C0 = lm0Var;
        ConnectionsManager.generateClassGuid();
        this.f28938z0 = kVar;
        this.f28937y0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.G0 = v4Var;
        b(new fi0(this));
        mi0 mi0Var = new mi0(this, getContext(), null);
        this.D0 = mi0Var;
        setAdapter((eq) mi0Var);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.dialogPhotosLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.reloadDialogPhotos);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.dialogPhotosUpdate);
        this.S0 = null;
    }

    public final void A(ImageLocation imageLocation, ImageLocation imageLocation2) {
        this.P0 = imageLocation;
        this.U0.add(0, null);
        this.T0.add(0, null);
        this.X0.add(0, imageLocation);
        this.Y0.add(0, imageLocation2);
        this.Z0.add(0, null);
        this.W0.add(0, null);
        this.V0.add(0, null);
        this.f28919a1.add(0, -1);
        this.f28920b1.add(0, Float.valueOf(0.0f));
        this.D0.g();
        L();
        this.f28934q1 = imageLocation;
        this.f28935r1 = imageLocation2;
    }

    public final void B(float f7, int i10) {
        float f10;
        int i11 = this.f28928j1;
        float f11 = 0.0f;
        if (i11 >= 0 || this.f28929k1 >= 0) {
            if (i11 < 0) {
                i11 = this.f28929k1;
            }
            int k10 = this.D0.k(i10);
            if (this.f28927i1) {
                k10--;
            }
            if (k10 == i11) {
                f10 = 1.0f - f7;
            } else if (getRealCount() > 0 && (k10 - 1) % getRealCount() == i11) {
                f10 = (1.0f - f7) - 1.0f;
            } else if (getRealCount() > 0 && (k10 + 1) % getRealCount() == i11) {
                f10 = (1.0f - f7) + 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (f10 > 1.0f) {
                f10 = 2.0f - f10;
            }
            f11 = Utilities.clamp(f10, 1.0f, 0.0f);
        }
        setCustomAvatarProgress(f11);
    }

    public final ImageLocation C(ImageLocation imageLocation, ImageLocation imageLocation2) {
        ArrayList arrayList;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        if (imageLocation == null) {
            return null;
        }
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                arrayList = this.Y0;
            } else {
                arrayList = this.X0;
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
                            return (ImageLocation) this.W0.get(i11);
                        }
                    }
                    if (i12 == imageLocation2.dc_id) {
                        int i14 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = imageLocation2.location;
                        if (i14 == tL_fileLocationToBeDeprecated3.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated3.volume_id) {
                            return (ImageLocation) this.W0.get(i11);
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
            ArrayList arrayList = this.X0;
            if (i10 < arrayList.size()) {
                ImageLocation imageLocation = (ImageLocation) this.W0.get(i10);
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
        mi0 mi0Var = this.D0;
        if (mi0Var != null) {
            ArrayList arrayList = mi0Var.f28604c;
            if (arrayList.size() > i10 && i10 >= 0) {
                ji0 ji0Var = (ji0) arrayList.get(i10);
                ki0 ki0Var = ji0Var.f27708b;
                if (ki0Var == null) {
                    return ji0Var.f27709c;
                }
                return ki0Var;
            }
            return null;
        }
        return null;
    }

    public final TLRPC.Photo F(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.V0;
            if (i10 < arrayList.size()) {
                return (TLRPC.Photo) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    public final ImageLocation G(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.X0;
            if (i10 < arrayList.size()) {
                return (ImageLocation) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    public final boolean H(t71 t71Var, ImageLocation imageLocation, ImageLocation imageLocation2, boolean z10) {
        MessagesController.DialogPhotos dialogPhotos;
        int i10;
        MessagesController.DialogPhotos dialogPhotos2;
        int i11 = 0;
        if (imageLocation != null && imageLocation2 != null && this.f28921c1 == 0) {
            ImageLocation imageLocation3 = this.P0;
            ArrayList arrayList = this.X0;
            if (imageLocation3 == null || imageLocation3.location.local_id != imageLocation.location.local_id) {
                boolean isEmpty = arrayList.isEmpty();
                mi0 mi0Var = this.D0;
                if (!isEmpty) {
                    this.P0 = imageLocation;
                    if (z10 && (dialogPhotos2 = this.S0) != null) {
                        dialogPhotos2.reset();
                        MessagesController.DialogPhotos dialogPhotos3 = this.S0;
                        int currentItem = getCurrentItem();
                        if (mi0Var != null) {
                            i11 = mi0Var.j();
                        }
                        dialogPhotos3.loadAfter(currentItem - i11, true);
                    }
                    return true;
                } else if (z10 && (dialogPhotos = this.S0) != null) {
                    dialogPhotos.reset();
                    MessagesController.DialogPhotos dialogPhotos4 = this.S0;
                    int currentItem2 = getCurrentItem();
                    if (mi0Var != null) {
                        i10 = mi0Var.j();
                    } else {
                        i10 = 0;
                    }
                    dialogPhotos4.loadAfter(currentItem2 - i10, true);
                }
            }
            if (arrayList.isEmpty()) {
                this.P0 = imageLocation;
                this.Q0 = imageLocation2;
                this.R0 = t71Var;
                this.U0.add(null);
                this.T0.add(null);
                arrayList.add(imageLocation);
                this.Y0.add(imageLocation2);
                this.Z0.add(t71Var);
                this.W0.add(null);
                this.V0.add(null);
                this.f28919a1.add(-1);
                this.f28920b1.add(null);
                getAdapter().g();
                L();
                return true;
            }
        }
        return false;
    }

    public final boolean I() {
        int realPosition = getRealPosition();
        if (this.f28927i1) {
            if (realPosition != 0) {
                realPosition--;
            } else {
                return false;
            }
        }
        if (realPosition >= 0) {
            ArrayList arrayList = this.W0;
            if (realPosition < arrayList.size() && arrayList.get(realPosition) != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean J() {
        int realPosition;
        u9 currentItemView;
        if (this.f28927i1) {
            realPosition = getRealPosition() - 1;
        } else {
            realPosition = getRealPosition();
        }
        if (this.W0.get(realPosition) != null && (currentItemView = getCurrentItemView()) != null) {
            c6 animation = currentItemView.getImageReceiver().getAnimation();
            if (animation == null || !animation.s()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void K() {
        this.f28933p1 = null;
        int i10 = this.L0;
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
            if (childAt instanceof u9) {
                u9 u9Var = (u9) childAt;
                if (u9Var.getImageReceiver().hasStaticThumb()) {
                    Drawable drawable = u9Var.getImageReceiver().getDrawable();
                    if (drawable instanceof c6) {
                        ((c6) drawable).w(u9Var);
                    }
                }
            }
        }
    }

    public final void L() {
        x(this.D0.j(), false);
    }

    public final void M(long j10, boolean z10) {
        if (this.E0 == j10 && !z10) {
            L();
            return;
        }
        this.f28924f1 = true;
        this.T0.clear();
        this.U0.clear();
        this.V0.clear();
        this.W0.clear();
        this.X0.clear();
        this.Y0.clear();
        this.f28919a1.clear();
        this.f28920b1.clear();
        this.D0.g();
        x(0, false);
        this.f28932o1 = 0;
        this.K0 = null;
        this.P0 = null;
        this.E0 = j10;
        MessagesController.DialogPhotos dialogPhotos = MessagesController.getInstance(this.L0).getDialogPhotos(j10);
        this.S0 = dialogPhotos;
        dialogPhotos.loadCache();
    }

    public final void N(int i10, int i11) {
        this.f28930m1 = i10;
        this.f28931n1 = i11;
        mi0 mi0Var = this.D0;
        if (mi0Var != null) {
            for (int i12 = 0; i12 < mi0Var.f28604c.size(); i12++) {
                if (((ji0) mi0Var.f28604c.get(i12)).f27709c != null) {
                    hi0 hi0Var = ((ji0) mi0Var.f28604c.get(i12)).f27709c;
                    int i13 = this.f28930m1;
                    int i14 = this.f28931n1;
                    hi0Var.r(i13, i13, i14, i14);
                }
            }
        }
    }

    public final void O(ImageLocation imageLocation, float f7) {
        if (imageLocation != null) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.X0;
                if (i10 >= arrayList.size()) {
                    break;
                } else if (arrayList.get(i10) == imageLocation) {
                    this.f28920b1.set(i10, Float.valueOf(f7));
                    SparseArray sparseArray = this.f28922d1;
                    if (sparseArray.get(i10) != null) {
                        ((RadialProgress2) sparseArray.get(i10)).p(f7, true);
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
        boolean z10;
        ni0 ni0Var;
        boolean z11;
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
        boolean z12;
        boolean z13;
        TLRPC.User user3;
        Object obj;
        boolean z14;
        boolean z15;
        TLRPC.Photo photo;
        ni0 ni0Var2 = this;
        Integer num3 = -1;
        int i16 = NotificationCenter.dialogPhotosUpdate;
        ArrayList arrayList5 = ni0Var2.U0;
        ArrayList arrayList6 = ni0Var2.T0;
        if (i10 == i16) {
            MessagesController.DialogPhotos dialogPhotos2 = (MessagesController.DialogPhotos) objArr[0];
            if (ni0Var2.S0 == dialogPhotos2) {
                ArrayList arrayList7 = new ArrayList(dialogPhotos2.photos);
                if (!arrayList7.isEmpty() || !dialogPhotos2.fromCache) {
                    ni0Var2.f28928j1 = -1;
                    ni0Var2.f28929k1 = -1;
                    int i17 = ni0Var2.L0;
                    TLRPC.User user4 = MessagesController.getInstance(i17).getUser(Long.valueOf(ni0Var2.E0));
                    TLRPC.UserFull userFull = MessagesController.getInstance(i17).getUserFull(ni0Var2.E0);
                    if (userFull != null && (photo = userFull.personal_photo) != null) {
                        arrayList7.add(0, photo);
                        ni0Var2.f28928j1 = 0;
                    }
                    if (user4 != null && user4.self && UserObject.hasFallbackPhoto(userFull)) {
                        arrayList7.add(userFull.fallback_photo);
                        ni0Var2.f28929k1 = arrayList7.size() - 1;
                    }
                    arrayList5.clear();
                    arrayList6.clear();
                    ArrayList arrayList8 = ni0Var2.X0;
                    arrayList8.clear();
                    ArrayList arrayList9 = ni0Var2.W0;
                    arrayList9.clear();
                    ArrayList arrayList10 = ni0Var2.Y0;
                    arrayList10.clear();
                    ArrayList arrayList11 = ni0Var2.Z0;
                    arrayList11.clear();
                    ArrayList arrayList12 = ni0Var2.V0;
                    arrayList12.clear();
                    ArrayList arrayList13 = ni0Var2.f28919a1;
                    arrayList13.clear();
                    ArrayList arrayList14 = ni0Var2.f28920b1;
                    arrayList14.clear();
                    if (DialogObject.isChatDialog(ni0Var2.E0)) {
                        TLRPC.Chat chat = MessagesController.getInstance(i17).getChat(Long.valueOf(-ni0Var2.E0));
                        imageLocation = ImageLocation.getForUserOrChat(i17, chat, 0);
                        arrayList = arrayList8;
                        if (imageLocation != null) {
                            arrayList.add(imageLocation);
                            user = user4;
                            arrayList10.add(ImageLocation.getForUserOrChat(i17, chat, 1));
                            arrayList11.add(null);
                            arrayList5.add(null);
                            TLRPC.ChatFull chatFull = ni0Var2.F0;
                            if (chatFull != null && FileLoader.isSamePhoto((TLRPC.FileLocation) imageLocation.location, chatFull.chat_photo)) {
                                arrayList12.add(ni0Var2.F0.chat_photo);
                                if (!ni0Var2.F0.chat_photo.video_sizes.isEmpty()) {
                                    TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(ni0Var2.F0.chat_photo.video_sizes, 1000);
                                    arrayList9.add(ImageLocation.getForPhoto(closestVideoSizeWithSize, ni0Var2.F0.chat_photo));
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
                    int i18 = 0;
                    while (true) {
                        int size = arrayList7.size();
                        i13 = i17;
                        z10 = ni0Var2.J0;
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
                                    ImageLocation imageLocation3 = ni0Var2.P0;
                                    num = num2;
                                    if (imageLocation3 != null) {
                                        if (imageLocation3.photoId == forPhoto.photoId && !z10 && ni0Var2.E0 != UserConfig.getInstance(i13).getClientUserId()) {
                                            arrayList5.add(null);
                                            arrayList.add(ni0Var2.P0);
                                            ImageLocation imageLocation4 = ni0Var2.Q0;
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
                                                    arrayList11.add(new t71(vectorMarkupVideoSize, z14, 2));
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
                                                arrayList11.add(ni0Var2.R0);
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
                                            arrayList11.add(new t71(vectorMarkupVideoSize2, z13, 2));
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
                        i18 = i15 + 1;
                        ni0Var2 = this;
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
                    if (z10) {
                        ni0Var = this;
                        if (!ni0Var.H0 || ni0Var.f28924f1) {
                            ni0Var.L();
                        }
                    } else {
                        ni0Var = this;
                        if (!ni0Var.H0 || ni0Var.f28924f1) {
                            ni0Var.L();
                            ni0Var.getAdapter().g();
                            ni0Var.B(0.0f, ni0Var.getRealPosition());
                        }
                    }
                    if (ni0Var.f28929k1 < 0 && ni0Var.f28928j1 < 0) {
                        z11 = false;
                        ni0Var.B(0.0f, 0);
                    } else {
                        z11 = false;
                    }
                    ni0Var.f28924f1 = z11;
                    ii0 ii0Var = ni0Var.G0;
                    if (ii0Var != null) {
                        ii0Var.c();
                    }
                    ImageLocation imageLocation5 = ni0Var.f28934q1;
                    if (imageLocation5 != null) {
                        ni0Var.A(imageLocation5, ni0Var.f28935r1);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int i28 = NotificationCenter.fileLoaded;
        SparseArray sparseArray = ni0Var2.f28922d1;
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
                        radialProgress2.p(1.0f, true);
                    }
                    ni0Var2.invalidate();
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
                        radialProgress22.p(Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue())), true);
                    }
                    ni0Var2.invalidate();
                }
            }
        } else if (i10 == NotificationCenter.reloadDialogPhotos && ni0Var2.f28921c1 == 0 && (dialogPhotos = ni0Var2.S0) != null) {
            dialogPhotos.reset();
            MessagesController.DialogPhotos dialogPhotos3 = ni0Var2.S0;
            int currentItem = ni0Var2.getCurrentItem();
            mi0 mi0Var = ni0Var2.D0;
            if (mi0Var != null) {
                i12 = mi0Var.j();
            } else {
                i12 = 0;
            }
            dialogPhotos3.loadAfter(currentItem - i12, true);
        }
    }

    public ei0 getBlurDrawer() {
        return this.f28933p1;
    }

    public float getCurrentItemProgress() {
        c6 animation;
        u9 currentItemView = getCurrentItemView();
        if (currentItemView == null || (animation = currentItemView.getImageReceiver().getAnimation()) == null) {
            return 0.0f;
        }
        return animation.n();
    }

    public u9 getCurrentItemView() {
        mi0 mi0Var = this.D0;
        if (mi0Var != null && !mi0Var.f28604c.isEmpty()) {
            return ((ji0) mi0Var.f28604c.get(getCurrentItem())).f27709c;
        }
        return null;
    }

    public long getDialogId() {
        return this.E0;
    }

    public int getRealCount() {
        int size = this.V0.size();
        if (this.f28927i1) {
            return size + 1;
        }
        return size;
    }

    public int getRealPosition() {
        return this.D0.k(getCurrentItem());
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.C0.getScrollState() != 0) {
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
        ei0 ei0Var = this.f28933p1;
        if (ei0Var != null) {
            ei0Var.setTranslationY(getHeight() - this.f28933p1.getMeasuredHeight());
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        ei0 ei0Var = this.f28933p1;
        if (ei0Var != null) {
            ei0Var.G = true;
            ei0Var.postInvalidateOnAnimation();
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ni0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        ei0 ei0Var = this.f28933p1;
        if (ei0Var != null) {
            ei0Var.setAlpha(f7);
        }
    }

    public void setAnimatedFileMaybe(c6 c6Var) {
        mi0 mi0Var;
        if (c6Var != null && (mi0Var = this.D0) != null) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if ((childAt instanceof u9) && mi0Var.k(mi0Var.d.indexOf(childAt)) == 0) {
                    u9 u9Var = (u9) childAt;
                    c6 animation = u9Var.getImageReceiver().getAnimation();
                    if (animation != c6Var) {
                        if (animation != null) {
                            animation.w(u9Var);
                        }
                        u9Var.setImageDrawable(c6Var);
                        c6Var.f(this);
                        c6Var.R = true;
                    }
                }
            }
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.F0 = chatFull;
        ArrayList arrayList = this.V0;
        if (!arrayList.isEmpty() && arrayList.get(0) == null && this.F0 != null) {
            ArrayList arrayList2 = this.X0;
            if (arrayList2.get(0) != null && FileLoader.isSamePhoto((TLRPC.FileLocation) ((ImageLocation) arrayList2.get(0)).location, this.F0.chat_photo)) {
                arrayList.set(0, this.F0.chat_photo);
                boolean isEmpty = this.F0.chat_photo.video_sizes.isEmpty();
                ArrayList arrayList3 = this.T0;
                ArrayList arrayList4 = this.W0;
                if (!isEmpty) {
                    TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(this.F0.chat_photo.video_sizes, 1000);
                    arrayList4.set(0, ImageLocation.getForPhoto(closestVideoSizeWithSize, this.F0.chat_photo));
                    arrayList3.set(0, FileLoader.getAttachFileName(closestVideoSizeWithSize));
                    ii0 ii0Var = this.G0;
                    if (ii0Var != null) {
                        ii0Var.c();
                    }
                } else {
                    arrayList4.set(0, null);
                    arrayList3.add(0, null);
                }
                this.f28920b1.set(0, null);
                this.D0.g();
            }
        }
    }

    public void setCreateThumbFromParent(boolean z10) {
        this.f28923e1 = z10;
    }

    public void setData(long j10) {
        M(j10, false);
    }

    public void setHasActiveVideo(boolean z10) {
        this.f28927i1 = z10;
    }

    public void setImagesLayerNum(int i10) {
        this.l1 = i10;
    }

    public void setInvalidateWithParent(boolean z10) {
        this.f28925g1 = z10;
    }

    public void setParentAvatarImage(u9 u9Var) {
        mi0 mi0Var = this.D0;
        if (mi0Var != null) {
            mi0Var.f28606g = u9Var;
        }
    }

    public void setPinchToZoomHelper(org.telegram.ui.xu0 xu0Var) {
        this.f28926h1 = xu0Var;
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        ei0 ei0Var = this.f28933p1;
        if (ei0Var != null) {
            ei0Var.setVisibility(i10);
        }
    }

    public void setCustomAvatarProgress(float f7) {
    }

    public ni0(Context context, long j10, org.telegram.ui.ActionBar.k kVar, lm0 lm0Var, org.telegram.ui.rz0 rz0Var, ii0 ii0Var, ei0 ei0Var) {
        super(context);
        this.f28936x0 = new PointF();
        this.A0 = true;
        this.B0 = true;
        int i10 = UserConfig.selectedAccount;
        this.L0 = i10;
        this.M0 = new Path();
        this.N0 = new RectF();
        this.O0 = new float[8];
        this.T0 = new ArrayList();
        this.U0 = new ArrayList();
        this.V0 = new ArrayList();
        this.W0 = new ArrayList();
        this.X0 = new ArrayList();
        this.Y0 = new ArrayList();
        this.Z0 = new ArrayList();
        this.f28919a1 = new ArrayList();
        this.f28920b1 = new ArrayList();
        this.f28922d1 = new SparseArray();
        this.f28923e1 = true;
        this.f28928j1 = -1;
        this.f28929k1 = -1;
        this.f28933p1 = ei0Var;
        setPadding(0, 0, 0, ei0Var == null ? 0 : ei0Var.f26055n);
        if (ei0Var != null) {
            ei0Var.setView(this);
        }
        setVisibility(8);
        setOverScrollMode(2);
        setOffscreenPageLimit(2);
        this.J0 = true;
        this.E0 = j10;
        this.C0 = lm0Var;
        this.f28938z0 = kVar;
        mi0 mi0Var = new mi0(this, getContext(), rz0Var);
        this.D0 = mi0Var;
        setAdapter((eq) mi0Var);
        this.f28937y0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.G0 = ii0Var;
        b(new gi0((org.telegram.ui.vy0) this));
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.dialogPhotosLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.reloadDialogPhotos);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.dialogPhotosUpdate);
        MessagesController.DialogPhotos dialogPhotos = MessagesController.getInstance(i10).getDialogPhotos(j10);
        this.S0 = dialogPhotos;
        dialogPhotos.loadCache();
    }
}
