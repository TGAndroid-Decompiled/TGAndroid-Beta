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
public final class h9 {
    public float A;
    public boolean B;
    public boolean f24579a;
    public boolean d;
    public ValueAnimator f24582f;
    public boolean f24583g;
    public Runnable f24585j;
    public int f24586k;
    public boolean f24587l;
    public final boolean f24588m;
    public int f24589n;
    public int f24590o;
    public int f24591p;
    public final View f24593r;
    public int f24594s;
    public boolean f24597w;
    public boolean f24598x;
    public ai.m9 f24599y;
    public final Random f24600z;
    public final g9[] f24580b = new g9[3];
    public final g9[] f24581c = new g9[3];
    public float e = 1.0f;
    public final Paint h = new Paint(1);
    public final Paint f24584i = new Paint(1);
    public int f24592q = AndroidUtilities.dp(1.67f);
    public float f24595t = 0.8f;
    public float f24596u = 1.0f;
    public long v = 220;

    public h9(View view, boolean z10) {
        qr qrVar = qr.f27380f;
        this.f24600z = new Random();
        this.f24593r = view;
        for (int i10 = 0; i10 < 3; i10++) {
            g9[] g9VarArr = this.f24580b;
            ?? obj = new Object();
            g9VarArr[i10] = obj;
            obj.e = new ImageReceiver(view);
            this.f24580b[i10].e.setInvalidateAll(true);
            this.f24580b[i10].e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.f24580b[i10].f24123a = new f9((org.telegram.ui.ActionBar.f6) null);
            this.f24580b[i10].f24123a.u(AndroidUtilities.dp(12.0f));
            g9[] g9VarArr2 = this.f24581c;
            ?? obj2 = new Object();
            g9VarArr2[i10] = obj2;
            obj2.e = new ImageReceiver(view);
            this.f24581c[i10].e.setInvalidateAll(true);
            this.f24581c[i10].e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.f24581c[i10].f24123a = new f9((org.telegram.ui.ActionBar.f6) null);
            this.f24581c[i10].f24123a.u(AndroidUtilities.dp(12.0f));
        }
        this.f24588m = z10;
        this.f24584i.setColor(0);
        this.f24584i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a() {
        b(false, true);
    }

    public final void b(boolean z10, boolean z11) {
        g9[] g9VarArr;
        g9[] g9VarArr2;
        if (this.d && z10) {
            g9[] g9VarArr3 = new g9[3];
            int i10 = 0;
            boolean z12 = false;
            while (true) {
                g9VarArr = this.f24580b;
                g9VarArr2 = this.f24581c;
                if (i10 >= 3) {
                    break;
                }
                g9VarArr3[i10] = g9VarArr[i10];
                g9 g9Var = g9VarArr[i10];
                long j3 = g9Var.f24127g;
                g9 g9Var2 = g9VarArr2[i10];
                if (j3 != g9Var2.f24127g) {
                    z12 = true;
                } else {
                    g9Var.d = g9Var2.d;
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
                        if (g9VarArr[i12].f24127g == g9VarArr2[i11].f24127g) {
                            g9VarArr3[i12] = null;
                            if (i11 == i12) {
                                g9 g9Var3 = g9VarArr2[i11];
                                g9Var3.f24128i = -1;
                                org.telegram.ui.Cells.b4 b4Var = g9Var3.f24124b;
                                g9 g9Var4 = g9VarArr[i11];
                                g9Var3.f24124b = g9Var4.f24124b;
                                g9Var4.f24124b = b4Var;
                            } else {
                                g9 g9Var5 = g9VarArr2[i11];
                                g9Var5.f24128i = 2;
                                g9Var5.f24129j = i12;
                            }
                        } else {
                            i12++;
                        }
                    } else {
                        g9VarArr2[i11].f24128i = 0;
                        break;
                    }
                }
            }
            for (int i13 = 0; i13 < 3; i13++) {
                g9 g9Var6 = g9VarArr3[i13];
                if (g9Var6 != null) {
                    g9Var6.f24128i = 1;
                }
            }
            ValueAnimator valueAnimator = this.f24582f;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f24582f.cancel();
                if (this.f24597w) {
                    n();
                    this.f24597w = false;
                }
            }
            this.e = 0.0f;
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f24582f = ofFloat;
                ofFloat.addUpdateListener(new i6(this, 4));
                this.f24582f.addListener(new p8(this, 1));
                this.f24582f.setDuration(this.v);
                this.f24582f.setInterpolator(qr.f27380f);
                this.f24582f.start();
            } else {
                this.f24597w = true;
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
        int i10 = this.f24594s;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f24586k;
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
        int i10 = this.f24586k;
        int i11 = 0;
        if (i10 != 4 && i10 != 10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i10 == 11) {
            dp = AndroidUtilities.dp(12.0f);
        } else {
            int i12 = this.f24594s;
            if (i12 != 0) {
                dp = (int) (i12 * this.f24595t);
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
            if (this.f24580b[i14].f24127g != 0) {
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
        View view = this.f24593r;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void g() {
        if (!this.B) {
            this.B = true;
            for (int i10 = 0; i10 < 3; i10++) {
                this.f24580b[i10].e.onAttachedToWindow();
                this.f24581c[i10].e.onAttachedToWindow();
            }
        }
    }

    public final void h() {
        if (this.B) {
            this.B = false;
            this.d = false;
            for (int i10 = 0; i10 < 3; i10++) {
                this.f24580b[i10].e.onDetachedFromWindow();
                this.f24581c[i10].e.onDetachedFromWindow();
            }
            if (this.f24586k == 3) {
                org.telegram.ui.ActionBar.j6.D0().a(0.0f);
            }
        }
    }

    public final void i(android.graphics.Canvas r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h9.i(android.graphics.Canvas):void");
    }

    public final void j(int i10) {
        f9 f9Var;
        f9 f9Var2;
        for (int i11 = 0; i11 < 3; i11++) {
            g9 g9Var = this.f24580b[i11];
            if (g9Var != null && (f9Var2 = g9Var.f24123a) != null) {
                f9Var2.u(i10);
            }
            g9 g9Var2 = this.f24581c[i11];
            if (g9Var2 != null && (f9Var = g9Var2.f24123a) != null) {
                f9Var.u(i10);
            }
        }
    }

    public final void k(int i10) {
        this.f24589n = i10;
        View view = this.f24593r;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final void l(int i10, TLObject tLObject, int i11) {
        TLRPC.User user;
        TLRPC.Chat chat;
        g9[] g9VarArr = this.f24581c;
        g9 g9Var = g9VarArr[i10];
        g9Var.f24127g = 0L;
        g9Var.f24126f = null;
        if (tLObject == null) {
            g9Var.e.setImageBitmap((Drawable) null);
            f();
            return;
        }
        g9Var.d = -1L;
        g9Var.h = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            g9Var.f24126f = groupCallParticipant;
            long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
            if (DialogObject.isUserDialog(peerId)) {
                user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
                g9VarArr[i10].f24123a.m(i11, user);
                chat = null;
            } else {
                TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
                g9VarArr[i10].f24123a.k(i11, chat2);
                chat = chat2;
                user = null;
            }
            if (this.f24586k == 4) {
                if (peerId == AccountInstance.getInstance(i11).getUserConfig().getClientUserId()) {
                    g9VarArr[i10].d = 0L;
                } else if (this.f24588m) {
                    g9VarArr[i10].d = groupCallParticipant.lastActiveDate;
                } else {
                    g9VarArr[i10].d = groupCallParticipant.active_date;
                }
            } else {
                g9VarArr[i10].d = groupCallParticipant.active_date;
            }
            g9VarArr[i10].f24127g = peerId;
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            if (user2.self && this.f24579a) {
                g9Var.f24123a.g(1);
                g9VarArr[i10].f24123a.f23836p = 0.6f;
            } else {
                g9Var.f24123a.g(0);
                f9 f9Var = g9VarArr[i10].f24123a;
                f9Var.f23836p = 1.0f;
                f9Var.m(i11, user2);
            }
            g9VarArr[i10].f24127g = user2.f18268id;
            user = user2;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            g9Var.f24123a.g(0);
            f9 f9Var2 = g9VarArr[i10].f24123a;
            f9Var2.f23836p = 1.0f;
            f9Var2.k(i11, chat);
            g9VarArr[i10].f24127g = -chat.f18121id;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int d = d();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            g9VarArr[i10].f24127g = storyItem.f18357id;
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50, true, null, false);
                g9VarArr[i10].e.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.document.thumbs, 50, true, closestPhotoSizeWithSize, true), storyItem.media.document), a4.a.k(d, d, "_"), ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.document), a4.a.k(d, d, "_"), 0L, null, storyItem, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 50, true, null, false);
                    g9VarArr[i10].e.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.photo.sizes, 50, true, closestPhotoSizeWithSize2, true), storyItem.media.photo), a4.a.k(d, d, "_"), ImageLocation.getForPhoto(closestPhotoSizeWithSize2, storyItem.media.photo), a4.a.k(d, d, "_"), 0L, null, storyItem, 0);
                }
            }
        } else if (user != null) {
            if (user.self && this.f24579a) {
                g9 g9Var2 = g9VarArr[i10];
                g9Var2.e.setImageBitmap(g9Var2.f24123a);
            } else {
                g9 g9Var3 = g9VarArr[i10];
                g9Var3.e.setForUserOrChat(user, g9Var3.f24123a);
            }
        } else {
            g9 g9Var4 = g9VarArr[i10];
            g9Var4.e.setForUserOrChat(chat, g9Var4.f24123a);
        }
        g9VarArr[i10].e.setRoundRadius(d / 2);
        float f7 = d;
        g9VarArr[i10].e.setImageCoords(0.0f, 0.0f, f7, f7);
        f();
    }

    public final void m(int i10) {
        this.f24594s = i10;
    }

    public final void n() {
        for (int i10 = 0; i10 < 3; i10++) {
            g9[] g9VarArr = this.f24580b;
            g9 g9Var = g9VarArr[i10];
            g9[] g9VarArr2 = this.f24581c;
            g9VarArr[i10] = g9VarArr2[i10];
            g9VarArr2[i10] = g9Var;
        }
    }
}
