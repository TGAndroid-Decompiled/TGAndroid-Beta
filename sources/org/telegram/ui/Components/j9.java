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
public final class j9 {
    public float A;
    public boolean B;
    public boolean f27456a;
    public boolean d;
    public ValueAnimator f27459f;
    public boolean f27460g;
    public Runnable f27462j;
    public int f27463k;
    public boolean f27464l;
    public final boolean f27465m;
    public int f27466n;
    public int f27467o;
    public int f27468p;
    public final View f27470r;
    public int f27471s;
    public boolean f27474w;
    public boolean f27475x;
    public ci.j7 f27476y;
    public final Random f27477z;
    public final i9[] f27457b = new i9[3];
    public final i9[] f27458c = new i9[3];
    public float e = 1.0f;
    public final Paint h = new Paint(1);
    public final Paint f27461i = new Paint(1);
    public int f27469q = AndroidUtilities.dp(1.67f);
    public float f27472t = 0.8f;
    public float f27473u = 1.0f;
    public long v = 220;

    public j9(View view, boolean z10) {
        bs bsVar = bs.f25037f;
        this.f27477z = new Random();
        this.f27470r = view;
        for (int i10 = 0; i10 < 3; i10++) {
            i9[] i9VarArr = this.f27457b;
            ?? obj = new Object();
            i9VarArr[i10] = obj;
            obj.e = new ImageReceiver(view);
            this.f27457b[i10].e.setInvalidateAll(true);
            this.f27457b[i10].e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.f27457b[i10].f27151a = new h9((org.telegram.ui.ActionBar.d6) null);
            this.f27457b[i10].f27151a.u(AndroidUtilities.dp(12.0f));
            i9[] i9VarArr2 = this.f27458c;
            ?? obj2 = new Object();
            i9VarArr2[i10] = obj2;
            obj2.e = new ImageReceiver(view);
            this.f27458c[i10].e.setInvalidateAll(true);
            this.f27458c[i10].e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.f27458c[i10].f27151a = new h9((org.telegram.ui.ActionBar.d6) null);
            this.f27458c[i10].f27151a.u(AndroidUtilities.dp(12.0f));
        }
        this.f27465m = z10;
        this.f27461i.setColor(0);
        this.f27461i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a() {
        b(false, true);
    }

    public final void b(boolean z10, boolean z11) {
        i9[] i9VarArr;
        i9[] i9VarArr2;
        if (this.d && z10) {
            i9[] i9VarArr3 = new i9[3];
            int i10 = 0;
            boolean z12 = false;
            while (true) {
                i9VarArr = this.f27457b;
                i9VarArr2 = this.f27458c;
                if (i10 >= 3) {
                    break;
                }
                i9VarArr3[i10] = i9VarArr[i10];
                i9 i9Var = i9VarArr[i10];
                long j10 = i9Var.f27155g;
                i9 i9Var2 = i9VarArr2[i10];
                if (j10 != i9Var2.f27155g) {
                    z12 = true;
                } else {
                    i9Var.d = i9Var2.d;
                }
                i10++;
            }
            if (!z12) {
                this.e = 1.0f;
                return;
            }
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = 0;
                while (true) {
                    if (i12 < 3) {
                        if (i9VarArr[i12].f27155g == i9VarArr2[i11].f27155g) {
                            i9VarArr3[i12] = null;
                            if (i11 == i12) {
                                i9 i9Var3 = i9VarArr2[i11];
                                i9Var3.f27156i = -1;
                                org.telegram.ui.Cells.b4 b4Var = i9Var3.f27152b;
                                i9 i9Var4 = i9VarArr[i11];
                                i9Var3.f27152b = i9Var4.f27152b;
                                i9Var4.f27152b = b4Var;
                            } else {
                                i9 i9Var5 = i9VarArr2[i11];
                                i9Var5.f27156i = 2;
                                i9Var5.f27157j = i12;
                            }
                        } else {
                            i12++;
                        }
                    } else {
                        i9VarArr2[i11].f27156i = 0;
                        break;
                    }
                }
            }
            for (int i13 = 0; i13 < 3; i13++) {
                i9 i9Var6 = i9VarArr3[i13];
                if (i9Var6 != null) {
                    i9Var6.f27156i = 1;
                }
            }
            ValueAnimator valueAnimator = this.f27459f;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f27459f.cancel();
                if (this.f27474w) {
                    n();
                    this.f27474w = false;
                }
            }
            this.e = 0.0f;
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f27459f = ofFloat;
                ofFloat.addUpdateListener(new l6(this, 4));
                this.f27459f.addListener(new org.telegram.ui.pq(this, 6));
                this.f27459f.setDuration(this.v);
                this.f27459f.setInterpolator(bs.f25037f);
                this.f27459f.start();
            } else {
                this.f27474w = true;
            }
            f();
            return;
        }
        this.e = 1.0f;
        n();
    }

    public final float c() {
        return this.A;
    }

    public final int d() {
        float f7;
        int i10 = this.f27471s;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f27463k;
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
        int i10 = this.f27463k;
        int i11 = 0;
        if (i10 != 4 && i10 != 10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i10 == 11) {
            dp = AndroidUtilities.dp(12.0f);
        } else {
            int i12 = this.f27471s;
            if (i12 != 0) {
                dp = (int) (i12 * this.f27472t);
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
            if (this.f27457b[i14].f27155g != 0) {
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
        View view = this.f27470r;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void g() {
        if (!this.B) {
            this.B = true;
            for (int i10 = 0; i10 < 3; i10++) {
                this.f27457b[i10].e.onAttachedToWindow();
                this.f27458c[i10].e.onAttachedToWindow();
            }
        }
    }

    public final void h() {
        if (this.B) {
            this.B = false;
            this.d = false;
            for (int i10 = 0; i10 < 3; i10++) {
                this.f27457b[i10].e.onDetachedFromWindow();
                this.f27458c[i10].e.onDetachedFromWindow();
            }
            if (this.f27463k == 3) {
                org.telegram.ui.ActionBar.h6.E0().a(0.0f);
            }
        }
    }

    public final void i(android.graphics.Canvas r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j9.i(android.graphics.Canvas):void");
    }

    public final void j(int i10) {
        h9 h9Var;
        h9 h9Var2;
        for (int i11 = 0; i11 < 3; i11++) {
            i9 i9Var = this.f27457b[i11];
            if (i9Var != null && (h9Var2 = i9Var.f27151a) != null) {
                h9Var2.u(i10);
            }
            i9 i9Var2 = this.f27458c[i11];
            if (i9Var2 != null && (h9Var = i9Var2.f27151a) != null) {
                h9Var.u(i10);
            }
        }
    }

    public final void k(int i10) {
        this.f27466n = i10;
        View view = this.f27470r;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final void l(int i10, TLObject tLObject, int i11) {
        TLRPC.User user;
        TLRPC.Chat chat;
        i9[] i9VarArr = this.f27458c;
        i9 i9Var = i9VarArr[i10];
        i9Var.f27155g = 0L;
        i9Var.f27154f = null;
        if (tLObject == null) {
            i9Var.e.setImageBitmap((Drawable) null);
            f();
            return;
        }
        i9Var.d = -1L;
        i9Var.h = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            i9Var.f27154f = groupCallParticipant;
            long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
            if (DialogObject.isUserDialog(peerId)) {
                user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
                i9VarArr[i10].f27151a.m(i11, user);
                chat = null;
            } else {
                TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
                i9VarArr[i10].f27151a.k(i11, chat2);
                chat = chat2;
                user = null;
            }
            if (this.f27463k == 4) {
                if (peerId == AccountInstance.getInstance(i11).getUserConfig().getClientUserId()) {
                    i9VarArr[i10].d = 0L;
                } else if (this.f27465m) {
                    i9VarArr[i10].d = groupCallParticipant.lastActiveDate;
                } else {
                    i9VarArr[i10].d = groupCallParticipant.active_date;
                }
            } else {
                i9VarArr[i10].d = groupCallParticipant.active_date;
            }
            i9VarArr[i10].f27155g = peerId;
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            if (user2.self && this.f27456a) {
                i9Var.f27151a.g(1);
                i9VarArr[i10].f27151a.f26829p = 0.6f;
            } else {
                i9Var.f27151a.g(0);
                h9 h9Var = i9VarArr[i10].f27151a;
                h9Var.f26829p = 1.0f;
                h9Var.m(i11, user2);
            }
            i9VarArr[i10].f27155g = user2.f20426id;
            user = user2;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            i9Var.f27151a.g(0);
            h9 h9Var2 = i9VarArr[i10].f27151a;
            h9Var2.f26829p = 1.0f;
            h9Var2.k(i11, chat);
            i9VarArr[i10].f27155g = -chat.f20279id;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int d = d();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            i9VarArr[i10].f27155g = storyItem.f20513id;
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50, true, null, false);
                i9VarArr[i10].e.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.document.thumbs, 50, true, closestPhotoSizeWithSize, true), storyItem.media.document), a1.g.k(d, d, "_"), ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.document), a1.g.k(d, d, "_"), 0L, null, storyItem, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 50, true, null, false);
                    i9VarArr[i10].e.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.photo.sizes, 50, true, closestPhotoSizeWithSize2, true), storyItem.media.photo), a1.g.k(d, d, "_"), ImageLocation.getForPhoto(closestPhotoSizeWithSize2, storyItem.media.photo), a1.g.k(d, d, "_"), 0L, null, storyItem, 0);
                }
            }
        } else if (user != null) {
            if (user.self && this.f27456a) {
                i9 i9Var2 = i9VarArr[i10];
                i9Var2.e.setImageBitmap(i9Var2.f27151a);
            } else {
                i9 i9Var3 = i9VarArr[i10];
                i9Var3.e.setForUserOrChat(user, i9Var3.f27151a);
            }
        } else {
            i9 i9Var4 = i9VarArr[i10];
            i9Var4.e.setForUserOrChat(chat, i9Var4.f27151a);
        }
        i9VarArr[i10].e.setRoundRadius(d / 2);
        float f7 = d;
        i9VarArr[i10].e.setImageCoords(0.0f, 0.0f, f7, f7);
        f();
    }

    public final void m(int i10) {
        this.f27471s = i10;
    }

    public final void n() {
        for (int i10 = 0; i10 < 3; i10++) {
            i9[] i9VarArr = this.f27457b;
            i9 i9Var = i9VarArr[i10];
            i9[] i9VarArr2 = this.f27458c;
            i9VarArr[i10] = i9VarArr2[i10];
            i9VarArr2[i10] = i9Var;
        }
    }
}
