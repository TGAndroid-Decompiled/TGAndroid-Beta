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
public final class i9 {
    public float A;
    public boolean B;
    public boolean f25035a;
    public boolean d;
    public ValueAnimator f25038f;
    public boolean f25039g;
    public Runnable f25041j;
    public int f25042k;
    public boolean f25043l;
    public final boolean f25044m;
    public int f25045n;
    public int f25046o;
    public int f25047p;
    public final View f25049r;
    public int f25050s;
    public boolean f25053w;
    public boolean f25054x;
    public ai.m9 f25055y;
    public final Random f25056z;
    public final h9[] f25036b = new h9[3];
    public final h9[] f25037c = new h9[3];
    public float e = 1.0f;
    public final Paint h = new Paint(1);
    public final Paint f25040i = new Paint(1);
    public int f25048q = AndroidUtilities.dp(1.67f);
    public float f25051t = 0.8f;
    public float f25052u = 1.0f;
    public long v = 220;

    public i9(View view, boolean z10) {
        qr qrVar = qr.f27653f;
        this.f25056z = new Random();
        this.f25049r = view;
        for (int i10 = 0; i10 < 3; i10++) {
            h9[] h9VarArr = this.f25036b;
            ?? obj = new Object();
            h9VarArr[i10] = obj;
            obj.e = new ImageReceiver(view);
            this.f25036b[i10].e.setInvalidateAll(true);
            this.f25036b[i10].e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.f25036b[i10].f24736a = new g9((org.telegram.ui.ActionBar.f6) null);
            this.f25036b[i10].f24736a.u(AndroidUtilities.dp(12.0f));
            h9[] h9VarArr2 = this.f25037c;
            ?? obj2 = new Object();
            h9VarArr2[i10] = obj2;
            obj2.e = new ImageReceiver(view);
            this.f25037c[i10].e.setInvalidateAll(true);
            this.f25037c[i10].e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.f25037c[i10].f24736a = new g9((org.telegram.ui.ActionBar.f6) null);
            this.f25037c[i10].f24736a.u(AndroidUtilities.dp(12.0f));
        }
        this.f25044m = z10;
        this.f25040i.setColor(0);
        this.f25040i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a() {
        b(false, true);
    }

    public final void b(boolean z10, boolean z11) {
        h9[] h9VarArr;
        h9[] h9VarArr2;
        if (this.d && z10) {
            h9[] h9VarArr3 = new h9[3];
            int i10 = 0;
            boolean z12 = false;
            while (true) {
                h9VarArr = this.f25036b;
                h9VarArr2 = this.f25037c;
                if (i10 >= 3) {
                    break;
                }
                h9VarArr3[i10] = h9VarArr[i10];
                h9 h9Var = h9VarArr[i10];
                long j3 = h9Var.f24740g;
                h9 h9Var2 = h9VarArr2[i10];
                if (j3 != h9Var2.f24740g) {
                    z12 = true;
                } else {
                    h9Var.d = h9Var2.d;
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
                        if (h9VarArr[i12].f24740g == h9VarArr2[i11].f24740g) {
                            h9VarArr3[i12] = null;
                            if (i11 == i12) {
                                h9 h9Var3 = h9VarArr2[i11];
                                h9Var3.f24741i = -1;
                                org.telegram.ui.Cells.d4 d4Var = h9Var3.f24737b;
                                h9 h9Var4 = h9VarArr[i11];
                                h9Var3.f24737b = h9Var4.f24737b;
                                h9Var4.f24737b = d4Var;
                            } else {
                                h9 h9Var5 = h9VarArr2[i11];
                                h9Var5.f24741i = 2;
                                h9Var5.f24742j = i12;
                            }
                        } else {
                            i12++;
                        }
                    } else {
                        h9VarArr2[i11].f24741i = 0;
                        break;
                    }
                }
            }
            for (int i13 = 0; i13 < 3; i13++) {
                h9 h9Var6 = h9VarArr3[i13];
                if (h9Var6 != null) {
                    h9Var6.f24741i = 1;
                }
            }
            ValueAnimator valueAnimator = this.f25038f;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f25038f.cancel();
                if (this.f25053w) {
                    n();
                    this.f25053w = false;
                }
            }
            this.e = 0.0f;
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f25038f = ofFloat;
                ofFloat.addUpdateListener(new j6(this, 4));
                this.f25038f.addListener(new q8(this, 1));
                this.f25038f.setDuration(this.v);
                this.f25038f.setInterpolator(qr.f27653f);
                this.f25038f.start();
            } else {
                this.f25053w = true;
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
        int i10 = this.f25050s;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f25042k;
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
        int i10 = this.f25042k;
        int i11 = 0;
        if (i10 != 4 && i10 != 10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i10 == 11) {
            dp = AndroidUtilities.dp(12.0f);
        } else {
            int i12 = this.f25050s;
            if (i12 != 0) {
                dp = (int) (i12 * this.f25051t);
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
            if (this.f25036b[i14].f24740g != 0) {
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
        View view = this.f25049r;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void g() {
        if (!this.B) {
            this.B = true;
            for (int i10 = 0; i10 < 3; i10++) {
                this.f25036b[i10].e.onAttachedToWindow();
                this.f25037c[i10].e.onAttachedToWindow();
            }
        }
    }

    public final void h() {
        if (this.B) {
            this.B = false;
            this.d = false;
            for (int i10 = 0; i10 < 3; i10++) {
                this.f25036b[i10].e.onDetachedFromWindow();
                this.f25037c[i10].e.onDetachedFromWindow();
            }
            if (this.f25042k == 3) {
                org.telegram.ui.ActionBar.j6.D0().a(0.0f);
            }
        }
    }

    public final void i(android.graphics.Canvas r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i9.i(android.graphics.Canvas):void");
    }

    public final void j(int i10) {
        g9 g9Var;
        g9 g9Var2;
        for (int i11 = 0; i11 < 3; i11++) {
            h9 h9Var = this.f25036b[i11];
            if (h9Var != null && (g9Var2 = h9Var.f24736a) != null) {
                g9Var2.u(i10);
            }
            h9 h9Var2 = this.f25037c[i11];
            if (h9Var2 != null && (g9Var = h9Var2.f24736a) != null) {
                g9Var.u(i10);
            }
        }
    }

    public final void k(int i10) {
        this.f25045n = i10;
        View view = this.f25049r;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final void l(int i10, TLObject tLObject, int i11) {
        TLRPC.User user;
        TLRPC.Chat chat;
        h9[] h9VarArr = this.f25037c;
        h9 h9Var = h9VarArr[i10];
        h9Var.f24740g = 0L;
        h9Var.f24739f = null;
        if (tLObject == null) {
            h9Var.e.setImageBitmap((Drawable) null);
            f();
            return;
        }
        h9Var.d = -1L;
        h9Var.h = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            h9Var.f24739f = groupCallParticipant;
            long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
            if (DialogObject.isUserDialog(peerId)) {
                user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
                h9VarArr[i10].f24736a.m(i11, user);
                chat = null;
            } else {
                TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
                h9VarArr[i10].f24736a.k(i11, chat2);
                chat = chat2;
                user = null;
            }
            if (this.f25042k == 4) {
                if (peerId == AccountInstance.getInstance(i11).getUserConfig().getClientUserId()) {
                    h9VarArr[i10].d = 0L;
                } else if (this.f25044m) {
                    h9VarArr[i10].d = groupCallParticipant.lastActiveDate;
                } else {
                    h9VarArr[i10].d = groupCallParticipant.active_date;
                }
            } else {
                h9VarArr[i10].d = groupCallParticipant.active_date;
            }
            h9VarArr[i10].f24740g = peerId;
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            if (user2.self && this.f25035a) {
                h9Var.f24736a.g(1);
                h9VarArr[i10].f24736a.f24459p = 0.6f;
            } else {
                h9Var.f24736a.g(0);
                g9 g9Var = h9VarArr[i10].f24736a;
                g9Var.f24459p = 1.0f;
                g9Var.m(i11, user2);
            }
            h9VarArr[i10].f24740g = user2.f18490id;
            user = user2;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            h9Var.f24736a.g(0);
            g9 g9Var2 = h9VarArr[i10].f24736a;
            g9Var2.f24459p = 1.0f;
            g9Var2.k(i11, chat);
            h9VarArr[i10].f24740g = -chat.f18343id;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int d = d();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            h9VarArr[i10].f24740g = storyItem.f18578id;
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50, true, null, false);
                h9VarArr[i10].e.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.document.thumbs, 50, true, closestPhotoSizeWithSize, true), storyItem.media.document), a4.a.k(d, d, "_"), ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.document), a4.a.k(d, d, "_"), 0L, null, storyItem, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 50, true, null, false);
                    h9VarArr[i10].e.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.photo.sizes, 50, true, closestPhotoSizeWithSize2, true), storyItem.media.photo), a4.a.k(d, d, "_"), ImageLocation.getForPhoto(closestPhotoSizeWithSize2, storyItem.media.photo), a4.a.k(d, d, "_"), 0L, null, storyItem, 0);
                }
            }
        } else if (user != null) {
            if (user.self && this.f25035a) {
                h9 h9Var2 = h9VarArr[i10];
                h9Var2.e.setImageBitmap(h9Var2.f24736a);
            } else {
                h9 h9Var3 = h9VarArr[i10];
                h9Var3.e.setForUserOrChat(user, h9Var3.f24736a);
            }
        } else {
            h9 h9Var4 = h9VarArr[i10];
            h9Var4.e.setForUserOrChat(chat, h9Var4.f24736a);
        }
        h9VarArr[i10].e.setRoundRadius(d / 2);
        float f7 = d;
        h9VarArr[i10].e.setImageCoords(0.0f, 0.0f, f7, f7);
        f();
    }

    public final void m(int i10) {
        this.f25050s = i10;
    }

    public final void n() {
        for (int i10 = 0; i10 < 3; i10++) {
            h9[] h9VarArr = this.f25036b;
            h9 h9Var = h9VarArr[i10];
            h9[] h9VarArr2 = this.f25037c;
            h9VarArr[i10] = h9VarArr2[i10];
            h9VarArr2[i10] = h9Var;
        }
    }
}
