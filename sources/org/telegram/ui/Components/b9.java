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
public final class b9 {
    public float A;
    public boolean B;
    public boolean f27074a;
    public boolean d;
    public ValueAnimator f27078f;
    public boolean f27079g;
    public Runnable f27081j;
    public int f27082k;
    public boolean f27083l;
    public final boolean f27084m;
    public int f27085n;
    public int f27086o;
    public int f27087p;
    public final View f27089r;
    public int f27090s;
    public boolean f27093w;
    public boolean f27094x;
    public ih.w6 f27095y;
    public final Random f27096z;
    public final a9[] f27075b = new a9[3];
    public final a9[] f27076c = new a9[3];
    public float f27077e = 1.0f;
    public final Paint h = new Paint(1);
    public final Paint f27080i = new Paint(1);
    public int f27088q = AndroidUtilities.dp(1.67f);
    public float f27091t = 0.8f;
    public float f27092u = 1.0f;
    public long v = 220;

    public b9(View view, boolean z10) {
        gr grVar = gr.f28844f;
        this.f27096z = new Random();
        this.f27089r = view;
        for (int i9 = 0; i9 < 3; i9++) {
            a9[] a9VarArr = this.f27075b;
            ?? obj = new Object();
            a9VarArr[i9] = obj;
            obj.f26730e = new ImageReceiver(view);
            this.f27075b[i9].f26730e.setInvalidateAll(true);
            this.f27075b[i9].f26730e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.f27075b[i9].f26727a = new z8((org.telegram.ui.ActionBar.b6) null);
            this.f27075b[i9].f26727a.u(AndroidUtilities.dp(12.0f));
            a9[] a9VarArr2 = this.f27076c;
            ?? obj2 = new Object();
            a9VarArr2[i9] = obj2;
            obj2.f26730e = new ImageReceiver(view);
            this.f27076c[i9].f26730e.setInvalidateAll(true);
            this.f27076c[i9].f26730e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.f27076c[i9].f26727a = new z8((org.telegram.ui.ActionBar.b6) null);
            this.f27076c[i9].f26727a.u(AndroidUtilities.dp(12.0f));
        }
        this.f27084m = z10;
        this.f27080i.setColor(0);
        this.f27080i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a() {
        b(false, true);
    }

    public final void b(boolean z10, boolean z11) {
        a9[] a9VarArr;
        a9[] a9VarArr2;
        if (this.d && z10) {
            a9[] a9VarArr3 = new a9[3];
            int i9 = 0;
            boolean z12 = false;
            while (true) {
                a9VarArr = this.f27075b;
                a9VarArr2 = this.f27076c;
                if (i9 >= 3) {
                    break;
                }
                a9VarArr3[i9] = a9VarArr[i9];
                a9 a9Var = a9VarArr[i9];
                long j10 = a9Var.f26732g;
                a9 a9Var2 = a9VarArr2[i9];
                if (j10 != a9Var2.f26732g) {
                    z12 = true;
                } else {
                    a9Var.d = a9Var2.d;
                }
                i9++;
            }
            if (!z12) {
                this.f27077e = 1.0f;
                return;
            }
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = 0;
                while (true) {
                    if (i11 < 3) {
                        if (a9VarArr[i11].f26732g == a9VarArr2[i10].f26732g) {
                            a9VarArr3[i11] = null;
                            if (i10 == i11) {
                                a9 a9Var3 = a9VarArr2[i10];
                                a9Var3.f26733i = -1;
                                org.telegram.ui.Cells.c4 c4Var = a9Var3.f26728b;
                                a9 a9Var4 = a9VarArr[i10];
                                a9Var3.f26728b = a9Var4.f26728b;
                                a9Var4.f26728b = c4Var;
                            } else {
                                a9 a9Var5 = a9VarArr2[i10];
                                a9Var5.f26733i = 2;
                                a9Var5.f26734j = i11;
                            }
                        } else {
                            i11++;
                        }
                    } else {
                        a9VarArr2[i10].f26733i = 0;
                        break;
                    }
                }
            }
            for (int i12 = 0; i12 < 3; i12++) {
                a9 a9Var6 = a9VarArr3[i12];
                if (a9Var6 != null) {
                    a9Var6.f26733i = 1;
                }
            }
            ValueAnimator valueAnimator = this.f27078f;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f27078f.cancel();
                if (this.f27093w) {
                    n();
                    this.f27093w = false;
                }
            }
            this.f27077e = 0.0f;
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f27078f = ofFloat;
                ofFloat.addUpdateListener(new e6(this, 4));
                this.f27078f.addListener(new org.telegram.ui.xp(this, 7));
                this.f27078f.setDuration(this.v);
                this.f27078f.setInterpolator(gr.f28844f);
                this.f27078f.start();
            } else {
                this.f27093w = true;
            }
            f();
            return;
        }
        this.f27077e = 1.0f;
        n();
    }

    public final float c() {
        return this.A;
    }

    public final int d() {
        float f10;
        int i9 = this.f27090s;
        if (i9 != 0) {
            return i9;
        }
        int i10 = this.f27082k;
        if (i10 != 4 && i10 != 10) {
            f10 = 24.0f;
        } else {
            f10 = 32.0f;
        }
        return AndroidUtilities.dp(f10);
    }

    public final float e() {
        boolean z10;
        float f10;
        int dp;
        int i9 = this.f27082k;
        int i10 = 0;
        if (i9 != 4 && i9 != 10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i9 == 11) {
            dp = AndroidUtilities.dp(12.0f);
        } else {
            int i11 = this.f27090s;
            if (i11 != 0) {
                dp = (int) (i11 * this.f27091t);
            } else {
                if (z10) {
                    f10 = 24.0f;
                } else {
                    f10 = 20.0f;
                }
                dp = AndroidUtilities.dp(f10);
            }
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 3; i13++) {
            if (this.f27075b[i13].f26732g != 0) {
                i12++;
            }
        }
        int max = Math.max(0, i12 - 1) * dp;
        if (i12 > 0) {
            i10 = d();
        }
        return max + i10;
    }

    public final void f() {
        View view = this.f27089r;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void g() {
        if (!this.B) {
            this.B = true;
            for (int i9 = 0; i9 < 3; i9++) {
                this.f27075b[i9].f26730e.onAttachedToWindow();
                this.f27076c[i9].f26730e.onAttachedToWindow();
            }
        }
    }

    public final void h() {
        if (this.B) {
            this.B = false;
            this.d = false;
            for (int i9 = 0; i9 < 3; i9++) {
                this.f27075b[i9].f26730e.onDetachedFromWindow();
                this.f27076c[i9].f26730e.onDetachedFromWindow();
            }
            if (this.f27082k == 3) {
                org.telegram.ui.ActionBar.f6.D0().a(0.0f);
            }
        }
    }

    public final void i(android.graphics.Canvas r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b9.i(android.graphics.Canvas):void");
    }

    public final void j(int i9) {
        z8 z8Var;
        z8 z8Var2;
        for (int i10 = 0; i10 < 3; i10++) {
            a9 a9Var = this.f27075b[i10];
            if (a9Var != null && (z8Var2 = a9Var.f26727a) != null) {
                z8Var2.u(i9);
            }
            a9 a9Var2 = this.f27076c[i10];
            if (a9Var2 != null && (z8Var = a9Var2.f26727a) != null) {
                z8Var.u(i9);
            }
        }
    }

    public final void k(int i9) {
        this.f27085n = i9;
        View view = this.f27089r;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final void l(int i9, TLObject tLObject, int i10) {
        TLRPC.User user;
        TLRPC.Chat chat;
        a9[] a9VarArr = this.f27076c;
        a9 a9Var = a9VarArr[i9];
        a9Var.f26732g = 0L;
        a9Var.f26731f = null;
        if (tLObject == null) {
            a9Var.f26730e.setImageBitmap((Drawable) null);
            f();
            return;
        }
        a9Var.d = -1L;
        a9Var.h = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            a9Var.f26731f = groupCallParticipant;
            long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
            if (DialogObject.isUserDialog(peerId)) {
                user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerId));
                a9VarArr[i9].f26727a.m(i10, user);
                chat = null;
            } else {
                TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerId));
                a9VarArr[i9].f26727a.k(i10, chat2);
                chat = chat2;
                user = null;
            }
            if (this.f27082k == 4) {
                if (peerId == AccountInstance.getInstance(i10).getUserConfig().getClientUserId()) {
                    a9VarArr[i9].d = 0L;
                } else if (this.f27084m) {
                    a9VarArr[i9].d = groupCallParticipant.lastActiveDate;
                } else {
                    a9VarArr[i9].d = groupCallParticipant.active_date;
                }
            } else {
                a9VarArr[i9].d = groupCallParticipant.active_date;
            }
            a9VarArr[i9].f26732g = peerId;
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            if (user2.self && this.f27074a) {
                a9Var.f26727a.g(1);
                a9VarArr[i9].f26727a.f35234p = 0.6f;
            } else {
                a9Var.f26727a.g(0);
                z8 z8Var = a9VarArr[i9].f26727a;
                z8Var.f35234p = 1.0f;
                z8Var.m(i10, user2);
            }
            a9VarArr[i9].f26732g = user2.f22527id;
            user = user2;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            a9Var.f26727a.g(0);
            z8 z8Var2 = a9VarArr[i9].f26727a;
            z8Var2.f35234p = 1.0f;
            z8Var2.k(i10, chat);
            a9VarArr[i9].f26732g = -chat.f22380id;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int d = d();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            a9VarArr[i9].f26732g = storyItem.f22617id;
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50, true, null, false);
                a9VarArr[i9].f26730e.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.document.thumbs, 50, true, closestPhotoSizeWithSize, true), storyItem.media.document), e2.c.l(d, "_", d), ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.document), e2.c.l(d, "_", d), 0L, null, storyItem, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 50, true, null, false);
                    a9VarArr[i9].f26730e.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.photo.sizes, 50, true, closestPhotoSizeWithSize2, true), storyItem.media.photo), e2.c.l(d, "_", d), ImageLocation.getForPhoto(closestPhotoSizeWithSize2, storyItem.media.photo), e2.c.l(d, "_", d), 0L, null, storyItem, 0);
                }
            }
        } else if (user != null) {
            if (user.self && this.f27074a) {
                a9 a9Var2 = a9VarArr[i9];
                a9Var2.f26730e.setImageBitmap(a9Var2.f26727a);
            } else {
                a9 a9Var3 = a9VarArr[i9];
                a9Var3.f26730e.setForUserOrChat(user, a9Var3.f26727a);
            }
        } else {
            a9 a9Var4 = a9VarArr[i9];
            a9Var4.f26730e.setForUserOrChat(chat, a9Var4.f26727a);
        }
        a9VarArr[i9].f26730e.setRoundRadius(d / 2);
        float f10 = d;
        a9VarArr[i9].f26730e.setImageCoords(0.0f, 0.0f, f10, f10);
        f();
    }

    public final void m(int i9) {
        this.f27090s = i9;
    }

    public final void n() {
        for (int i9 = 0; i9 < 3; i9++) {
            a9[] a9VarArr = this.f27075b;
            a9 a9Var = a9VarArr[i9];
            a9[] a9VarArr2 = this.f27076c;
            a9VarArr[i9] = a9VarArr2[i9];
            a9VarArr2[i9] = a9Var;
        }
    }
}
