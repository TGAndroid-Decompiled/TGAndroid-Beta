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
public final class c9 {
    public float A;
    public boolean B;
    public boolean f23922a;
    public boolean d;
    public ValueAnimator f23925f;
    public boolean f23926g;
    public Runnable f23928j;
    public int f23929k;
    public boolean f23930l;
    public final boolean f23931m;
    public int f23932n;
    public int f23933o;
    public int f23934p;
    public final View f23936r;
    public int f23937s;
    public boolean f23940w;
    public boolean f23941x;
    public nh.u6 f23942y;
    public final Random f23943z;
    public final b9[] f23923b = new b9[3];
    public final b9[] f23924c = new b9[3];
    public float e = 1.0f;
    public final Paint h = new Paint(1);
    public final Paint f23927i = new Paint(1);
    public int f23935q = AndroidUtilities.dp(1.67f);
    public float f23938t = 0.8f;
    public float f23939u = 1.0f;
    public long v = 220;

    public c9(View view, boolean z4) {
        nr nrVar = nr.f27346f;
        this.f23943z = new Random();
        this.f23936r = view;
        for (int i10 = 0; i10 < 3; i10++) {
            b9[] b9VarArr = this.f23923b;
            ?? obj = new Object();
            b9VarArr[i10] = obj;
            obj.e = new ImageReceiver(view);
            this.f23923b[i10].e.setInvalidateAll(true);
            this.f23923b[i10].e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.f23923b[i10].f23596a = new z8((org.telegram.ui.ActionBar.f6) null);
            this.f23923b[i10].f23596a.u(AndroidUtilities.dp(12.0f));
            b9[] b9VarArr2 = this.f23924c;
            ?? obj2 = new Object();
            b9VarArr2[i10] = obj2;
            obj2.e = new ImageReceiver(view);
            this.f23924c[i10].e.setInvalidateAll(true);
            this.f23924c[i10].e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.f23924c[i10].f23596a = new z8((org.telegram.ui.ActionBar.f6) null);
            this.f23924c[i10].f23596a.u(AndroidUtilities.dp(12.0f));
        }
        this.f23931m = z4;
        this.f23927i.setColor(0);
        this.f23927i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a() {
        b(false, true);
    }

    public final void b(boolean z4, boolean z10) {
        b9[] b9VarArr;
        b9[] b9VarArr2;
        if (this.d && z4) {
            b9[] b9VarArr3 = new b9[3];
            int i10 = 0;
            boolean z11 = false;
            while (true) {
                b9VarArr = this.f23923b;
                b9VarArr2 = this.f23924c;
                if (i10 >= 3) {
                    break;
                }
                b9VarArr3[i10] = b9VarArr[i10];
                b9 b9Var = b9VarArr[i10];
                long j10 = b9Var.f23600g;
                b9 b9Var2 = b9VarArr2[i10];
                if (j10 != b9Var2.f23600g) {
                    z11 = true;
                } else {
                    b9Var.d = b9Var2.d;
                }
                i10++;
            }
            if (!z11) {
                this.e = 1.0f;
                return;
            }
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = 0;
                while (true) {
                    if (i12 < 3) {
                        if (b9VarArr[i12].f23600g == b9VarArr2[i11].f23600g) {
                            b9VarArr3[i12] = null;
                            if (i11 == i12) {
                                b9 b9Var3 = b9VarArr2[i11];
                                b9Var3.f23601i = -1;
                                org.telegram.ui.Cells.c4 c4Var = b9Var3.f23597b;
                                b9 b9Var4 = b9VarArr[i11];
                                b9Var3.f23597b = b9Var4.f23597b;
                                b9Var4.f23597b = c4Var;
                            } else {
                                b9 b9Var5 = b9VarArr2[i11];
                                b9Var5.f23601i = 2;
                                b9Var5.f23602j = i12;
                            }
                        } else {
                            i12++;
                        }
                    } else {
                        b9VarArr2[i11].f23601i = 0;
                        break;
                    }
                }
            }
            for (int i13 = 0; i13 < 3; i13++) {
                b9 b9Var6 = b9VarArr3[i13];
                if (b9Var6 != null) {
                    b9Var6.f23601i = 1;
                }
            }
            ValueAnimator valueAnimator = this.f23925f;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f23925f.cancel();
                if (this.f23940w) {
                    n();
                    this.f23940w = false;
                }
            }
            this.e = 0.0f;
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f23925f = ofFloat;
                ofFloat.addUpdateListener(new f6(this, 4));
                this.f23925f.addListener(new a9(this, 0));
                this.f23925f.setDuration(this.v);
                this.f23925f.setInterpolator(nr.f27346f);
                this.f23925f.start();
            } else {
                this.f23940w = true;
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
        float f10;
        int i10 = this.f23937s;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f23929k;
        if (i11 != 4 && i11 != 10) {
            f10 = 24.0f;
        } else {
            f10 = 32.0f;
        }
        return AndroidUtilities.dp(f10);
    }

    public final float e() {
        boolean z4;
        float f10;
        int dp;
        int i10 = this.f23929k;
        int i11 = 0;
        if (i10 != 4 && i10 != 10) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (i10 == 11) {
            dp = AndroidUtilities.dp(12.0f);
        } else {
            int i12 = this.f23937s;
            if (i12 != 0) {
                dp = (int) (i12 * this.f23938t);
            } else {
                if (z4) {
                    f10 = 24.0f;
                } else {
                    f10 = 20.0f;
                }
                dp = AndroidUtilities.dp(f10);
            }
        }
        int i13 = 0;
        for (int i14 = 0; i14 < 3; i14++) {
            if (this.f23923b[i14].f23600g != 0) {
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
        View view = this.f23936r;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void g() {
        if (!this.B) {
            this.B = true;
            for (int i10 = 0; i10 < 3; i10++) {
                this.f23923b[i10].e.onAttachedToWindow();
                this.f23924c[i10].e.onAttachedToWindow();
            }
        }
    }

    public final void h() {
        if (this.B) {
            this.B = false;
            this.d = false;
            for (int i10 = 0; i10 < 3; i10++) {
                this.f23923b[i10].e.onDetachedFromWindow();
                this.f23924c[i10].e.onDetachedFromWindow();
            }
            if (this.f23929k == 3) {
                org.telegram.ui.ActionBar.j6.D0().a(0.0f);
            }
        }
    }

    public final void i(android.graphics.Canvas r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c9.i(android.graphics.Canvas):void");
    }

    public final void j(int i10) {
        z8 z8Var;
        z8 z8Var2;
        for (int i11 = 0; i11 < 3; i11++) {
            b9 b9Var = this.f23923b[i11];
            if (b9Var != null && (z8Var2 = b9Var.f23596a) != null) {
                z8Var2.u(i10);
            }
            b9 b9Var2 = this.f23924c[i11];
            if (b9Var2 != null && (z8Var = b9Var2.f23596a) != null) {
                z8Var.u(i10);
            }
        }
    }

    public final void k(int i10) {
        this.f23932n = i10;
        View view = this.f23936r;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final void l(int i10, TLObject tLObject, int i11) {
        TLRPC.User user;
        TLRPC.Chat chat;
        b9[] b9VarArr = this.f23924c;
        b9 b9Var = b9VarArr[i10];
        b9Var.f23600g = 0L;
        b9Var.f23599f = null;
        if (tLObject == null) {
            b9Var.e.setImageBitmap((Drawable) null);
            f();
            return;
        }
        b9Var.d = -1L;
        b9Var.h = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            b9Var.f23599f = groupCallParticipant;
            long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
            if (DialogObject.isUserDialog(peerId)) {
                user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
                b9VarArr[i10].f23596a.m(i11, user);
                chat = null;
            } else {
                TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
                b9VarArr[i10].f23596a.k(i11, chat2);
                chat = chat2;
                user = null;
            }
            if (this.f23929k == 4) {
                if (peerId == AccountInstance.getInstance(i11).getUserConfig().getClientUserId()) {
                    b9VarArr[i10].d = 0L;
                } else if (this.f23931m) {
                    b9VarArr[i10].d = groupCallParticipant.lastActiveDate;
                } else {
                    b9VarArr[i10].d = groupCallParticipant.active_date;
                }
            } else {
                b9VarArr[i10].d = groupCallParticipant.active_date;
            }
            b9VarArr[i10].f23600g = peerId;
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            if (user2.self && this.f23922a) {
                b9Var.f23596a.g(1);
                b9VarArr[i10].f23596a.f31276p = 0.6f;
            } else {
                b9Var.f23596a.g(0);
                z8 z8Var = b9VarArr[i10].f23596a;
                z8Var.f31276p = 1.0f;
                z8Var.m(i11, user2);
            }
            b9VarArr[i10].f23600g = user2.f19331id;
            user = user2;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            b9Var.f23596a.g(0);
            z8 z8Var2 = b9VarArr[i10].f23596a;
            z8Var2.f31276p = 1.0f;
            z8Var2.k(i11, chat);
            b9VarArr[i10].f23600g = -chat.f19184id;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int d = d();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            b9VarArr[i10].f23600g = storyItem.f19419id;
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50, true, null, false);
                b9VarArr[i10].e.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.document.thumbs, 50, true, closestPhotoSizeWithSize, true), storyItem.media.document), e2.c.h(d, "_", d), ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.document), e2.c.h(d, "_", d), 0L, null, storyItem, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 50, true, null, false);
                    b9VarArr[i10].e.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.photo.sizes, 50, true, closestPhotoSizeWithSize2, true), storyItem.media.photo), e2.c.h(d, "_", d), ImageLocation.getForPhoto(closestPhotoSizeWithSize2, storyItem.media.photo), e2.c.h(d, "_", d), 0L, null, storyItem, 0);
                }
            }
        } else if (user != null) {
            if (user.self && this.f23922a) {
                b9 b9Var2 = b9VarArr[i10];
                b9Var2.e.setImageBitmap(b9Var2.f23596a);
            } else {
                b9 b9Var3 = b9VarArr[i10];
                b9Var3.e.setForUserOrChat(user, b9Var3.f23596a);
            }
        } else {
            b9 b9Var4 = b9VarArr[i10];
            b9Var4.e.setForUserOrChat(chat, b9Var4.f23596a);
        }
        b9VarArr[i10].e.setRoundRadius(d / 2);
        float f10 = d;
        b9VarArr[i10].e.setImageCoords(0.0f, 0.0f, f10, f10);
        f();
    }

    public final void m(int i10) {
        this.f23937s = i10;
    }

    public final void n() {
        for (int i10 = 0; i10 < 3; i10++) {
            b9[] b9VarArr = this.f23923b;
            b9 b9Var = b9VarArr[i10];
            b9[] b9VarArr2 = this.f23924c;
            b9VarArr[i10] = b9VarArr2[i10];
            b9VarArr2[i10] = b9Var;
        }
    }
}
