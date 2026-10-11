package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Random;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class l9 {
    public float A;
    public boolean B;
    public boolean f28238a;
    public boolean d;
    public ValueAnimator f28242f;
    public boolean f28243g;
    public Runnable f28245j;
    public int f28246k;
    public boolean f28247l;
    public final boolean f28248m;
    public int f28249n;
    public int f28250o;
    public int f28251p;
    public final View f28253r;
    public int f28254s;
    public boolean f28257w;
    public boolean f28258x;
    public ai.n9 f28259y;
    public final Random f28260z;
    public final k9[] f28239b = new k9[3];
    public final k9[] f28240c = new k9[3];
    public float f28241e = 1.0f;
    public final Paint h = new Paint(1);
    public final Paint f28244i = new Paint(1);
    public int f28252q = AndroidUtilities.dp(1.67f);
    public float f28255t = 0.8f;
    public float f28256u = 1.0f;
    public long v = 220;

    public l9(View view, boolean z10) {
        is isVar = is.f27451f;
        this.f28260z = new Random();
        this.f28253r = view;
        for (int i10 = 0; i10 < 3; i10++) {
            k9[] k9VarArr = this.f28239b;
            ?? obj = new Object();
            k9VarArr[i10] = obj;
            obj.f27882e = new ImageReceiver(view);
            this.f28239b[i10].f27882e.setInvalidateAll(true);
            this.f28239b[i10].f27882e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.f28239b[i10].f27879a = new j9((org.telegram.ui.ActionBar.d6) null);
            this.f28239b[i10].f27879a.u(AndroidUtilities.dp(12.0f));
            k9[] k9VarArr2 = this.f28240c;
            ?? obj2 = new Object();
            k9VarArr2[i10] = obj2;
            obj2.f27882e = new ImageReceiver(view);
            this.f28240c[i10].f27882e.setInvalidateAll(true);
            this.f28240c[i10].f27882e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.f28240c[i10].f27879a = new j9((org.telegram.ui.ActionBar.d6) null);
            this.f28240c[i10].f27879a.u(AndroidUtilities.dp(12.0f));
        }
        this.f28248m = z10;
        this.f28244i.setColor(0);
        this.f28244i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a() {
        b(false, true);
    }

    public final void b(boolean z10, boolean z11) {
        k9[] k9VarArr;
        k9[] k9VarArr2;
        if (this.d && z10) {
            k9[] k9VarArr3 = new k9[3];
            int i10 = 0;
            boolean z12 = false;
            while (true) {
                k9VarArr = this.f28239b;
                k9VarArr2 = this.f28240c;
                if (i10 >= 3) {
                    break;
                }
                k9VarArr3[i10] = k9VarArr[i10];
                k9 k9Var = k9VarArr[i10];
                long j3 = k9Var.f27884g;
                k9 k9Var2 = k9VarArr2[i10];
                if (j3 != k9Var2.f27884g) {
                    z12 = true;
                } else {
                    k9Var.d = k9Var2.d;
                }
                i10++;
            }
            if (!z12) {
                this.f28241e = 1.0f;
                return;
            }
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = 0;
                while (true) {
                    if (i12 < 3) {
                        if (k9VarArr[i12].f27884g == k9VarArr2[i11].f27884g) {
                            k9VarArr3[i12] = null;
                            if (i11 == i12) {
                                k9 k9Var3 = k9VarArr2[i11];
                                k9Var3.f27885i = -1;
                                org.telegram.ui.Cells.c4 c4Var = k9Var3.f27880b;
                                k9 k9Var4 = k9VarArr[i11];
                                k9Var3.f27880b = k9Var4.f27880b;
                                k9Var4.f27880b = c4Var;
                            } else {
                                k9 k9Var5 = k9VarArr2[i11];
                                k9Var5.f27885i = 2;
                                k9Var5.f27886j = i12;
                            }
                        } else {
                            i12++;
                        }
                    } else {
                        k9VarArr2[i11].f27885i = 0;
                        break;
                    }
                }
            }
            for (int i13 = 0; i13 < 3; i13++) {
                k9 k9Var6 = k9VarArr3[i13];
                if (k9Var6 != null) {
                    k9Var6.f27885i = 1;
                }
            }
            ValueAnimator valueAnimator = this.f28242f;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f28242f.cancel();
                if (this.f28257w) {
                    n();
                    this.f28257w = false;
                }
            }
            this.f28241e = 0.0f;
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f28242f = ofFloat;
                ofFloat.addUpdateListener(new m6(this, 4));
                this.f28242f.addListener(new t8(this, 1));
                this.f28242f.setDuration(this.v);
                this.f28242f.setInterpolator(is.f27451f);
                this.f28242f.start();
            } else {
                this.f28257w = true;
            }
            f();
            return;
        }
        this.f28241e = 1.0f;
        n();
    }

    public final float c() {
        return this.A;
    }

    public final int d() {
        float f7;
        int i10 = this.f28254s;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f28246k;
        if (i11 != 4 && i11 != 10) {
            f7 = 24.0f;
        } else {
            f7 = 32.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final float e() {
        boolean z10;
        float f7;
        int dp;
        int i10 = this.f28246k;
        int i11 = 0;
        if (i10 != 4 && i10 != 10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i10 == 11) {
            dp = AndroidUtilities.dp(12.0f);
        } else {
            int i12 = this.f28254s;
            if (i12 != 0) {
                dp = (int) (i12 * this.f28255t);
            } else {
                if (z10) {
                    f7 = 24.0f;
                } else {
                    f7 = 20.0f;
                }
                dp = AndroidUtilities.dp(f7);
            }
        }
        int i13 = 0;
        for (int i14 = 0; i14 < 3; i14++) {
            if (this.f28239b[i14].f27884g != 0) {
                i13++;
            }
        }
        int max = Math.max(0, i13 - 1) * dp;
        if (i13 > 0) {
            i11 = d();
        }
        return max + i11;
    }

    public final void f() {
        View view = this.f28253r;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void g() {
        if (!this.B) {
            this.B = true;
            for (int i10 = 0; i10 < 3; i10++) {
                this.f28239b[i10].f27882e.onAttachedToWindow();
                this.f28240c[i10].f27882e.onAttachedToWindow();
            }
        }
    }

    public final void h() {
        if (this.B) {
            this.B = false;
            this.d = false;
            for (int i10 = 0; i10 < 3; i10++) {
                this.f28239b[i10].f27882e.onDetachedFromWindow();
                this.f28240c[i10].f27882e.onDetachedFromWindow();
            }
            if (this.f28246k == 3) {
                org.telegram.ui.ActionBar.h6.E0().a(0.0f);
            }
        }
    }

    public final void i(android.graphics.Canvas r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l9.i(android.graphics.Canvas):void");
    }

    public final void j(int i10) {
        j9 j9Var;
        j9 j9Var2;
        for (int i11 = 0; i11 < 3; i11++) {
            k9 k9Var = this.f28239b[i11];
            if (k9Var != null && (j9Var2 = k9Var.f27879a) != null) {
                j9Var2.u(i10);
            }
            k9 k9Var2 = this.f28240c[i11];
            if (k9Var2 != null && (j9Var = k9Var2.f27879a) != null) {
                j9Var.u(i10);
            }
        }
    }

    public final void k(int i10) {
        this.f28249n = i10;
        View view = this.f28253r;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final void l(int i10, TLObject tLObject, int i11) {
        TLRPC.User user;
        TLRPC.Chat chat;
        k9[] k9VarArr = this.f28240c;
        k9 k9Var = k9VarArr[i10];
        k9Var.f27884g = 0L;
        k9Var.f27883f = null;
        if (tLObject == null) {
            k9Var.f27882e.setImageBitmap((Drawable) null);
            f();
            return;
        }
        k9Var.d = -1L;
        k9Var.h = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            k9Var.f27883f = groupCallParticipant;
            long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
            if (DialogObject.isUserDialog(peerId)) {
                user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
                k9VarArr[i10].f27879a.m(i11, user);
                chat = null;
            } else {
                TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
                k9VarArr[i10].f27879a.k(i11, chat2);
                chat = chat2;
                user = null;
            }
            if (this.f28246k == 4) {
                if (peerId == AccountInstance.getInstance(i11).getUserConfig().getClientUserId()) {
                    k9VarArr[i10].d = 0L;
                } else if (this.f28248m) {
                    k9VarArr[i10].d = groupCallParticipant.lastActiveDate;
                } else {
                    k9VarArr[i10].d = groupCallParticipant.active_date;
                }
            } else {
                k9VarArr[i10].d = groupCallParticipant.active_date;
            }
            k9VarArr[i10].f27884g = peerId;
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            if (user2.self && this.f28238a) {
                k9Var.f27879a.g(1);
                k9VarArr[i10].f27879a.f27617p = 0.6f;
            } else {
                k9Var.f27879a.g(0);
                j9 j9Var = k9VarArr[i10].f27879a;
                j9Var.f27617p = 1.0f;
                j9Var.m(i11, user2);
            }
            k9VarArr[i10].f27884g = user2.f20179id;
            user = user2;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            k9Var.f27879a.g(0);
            j9 j9Var2 = k9VarArr[i10].f27879a;
            j9Var2.f27617p = 1.0f;
            j9Var2.k(i11, chat);
            k9VarArr[i10].f27884g = -chat.f20032id;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int d = d();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            k9VarArr[i10].f27884g = storyItem.f20269id;
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50, true, null, false);
                k9VarArr[i10].f27882e.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.document.thumbs, 50, true, closestPhotoSizeWithSize, true), storyItem.media.document), a1.g.l(d, d, "_"), ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.document), a1.g.l(d, d, "_"), 0L, null, storyItem, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 50, true, null, false);
                    k9VarArr[i10].f27882e.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.photo.sizes, 50, true, closestPhotoSizeWithSize2, true), storyItem.media.photo), a1.g.l(d, d, "_"), ImageLocation.getForPhoto(closestPhotoSizeWithSize2, storyItem.media.photo), a1.g.l(d, d, "_"), 0L, null, storyItem, 0);
                }
            }
        } else if (user != null) {
            if (user.self && this.f28238a) {
                k9 k9Var2 = k9VarArr[i10];
                k9Var2.f27882e.setImageBitmap(k9Var2.f27879a);
            } else {
                k9 k9Var3 = k9VarArr[i10];
                k9Var3.f27882e.setForUserOrChat(user, k9Var3.f27879a);
            }
        } else {
            k9 k9Var4 = k9VarArr[i10];
            k9Var4.f27882e.setForUserOrChat(chat, k9Var4.f27879a);
        }
        k9VarArr[i10].f27882e.setRoundRadius(d / 2);
        float f7 = d;
        k9VarArr[i10].f27882e.setImageCoords(0.0f, 0.0f, f7, f7);
        f();
    }

    public final void m(int i10) {
        this.f28254s = i10;
    }

    public final void n() {
        for (int i10 = 0; i10 < 3; i10++) {
            k9[] k9VarArr = this.f28239b;
            k9 k9Var = k9VarArr[i10];
            k9[] k9VarArr2 = this.f28240c;
            k9VarArr[i10] = k9VarArr2[i10];
            k9VarArr2[i10] = k9Var;
        }
    }
}
