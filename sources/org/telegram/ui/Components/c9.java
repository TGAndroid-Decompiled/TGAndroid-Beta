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
    public boolean f25864a;
    public boolean d;
    public ValueAnimator f25868f;
    public boolean f25869g;
    public Runnable f25871j;
    public int f25872k;
    public boolean f25873l;
    public final boolean f25874m;
    public int f25875n;
    public int f25876o;
    public int f25877p;
    public final View f25879r;
    public int f25880s;
    public boolean f25883w;
    public boolean f25884x;
    public oh.u6 f25885y;
    public final Random f25886z;
    public final b9[] f25865b = new b9[3];
    public final b9[] f25866c = new b9[3];
    public float f25867e = 1.0f;
    public final Paint h = new Paint(1);
    public final Paint f25870i = new Paint(1);
    public int f25878q = AndroidUtilities.dp(1.67f);
    public float f25881t = 0.8f;
    public float f25882u = 1.0f;
    public long v = 220;

    public c9(View view, boolean z4) {
        pr prVar = pr.f30183f;
        this.f25886z = new Random();
        this.f25879r = view;
        for (int i10 = 0; i10 < 3; i10++) {
            b9[] b9VarArr = this.f25865b;
            ?? obj = new Object();
            b9VarArr[i10] = obj;
            obj.f25524e = new ImageReceiver(view);
            this.f25865b[i10].f25524e.setInvalidateAll(true);
            this.f25865b[i10].f25524e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.f25865b[i10].f25521a = new z8((org.telegram.ui.ActionBar.g6) null);
            this.f25865b[i10].f25521a.u(AndroidUtilities.dp(12.0f));
            b9[] b9VarArr2 = this.f25866c;
            ?? obj2 = new Object();
            b9VarArr2[i10] = obj2;
            obj2.f25524e = new ImageReceiver(view);
            this.f25866c[i10].f25524e.setInvalidateAll(true);
            this.f25866c[i10].f25524e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.f25866c[i10].f25521a = new z8((org.telegram.ui.ActionBar.g6) null);
            this.f25866c[i10].f25521a.u(AndroidUtilities.dp(12.0f));
        }
        this.f25874m = z4;
        this.f25870i.setColor(0);
        this.f25870i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
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
                b9VarArr = this.f25865b;
                b9VarArr2 = this.f25866c;
                if (i10 >= 3) {
                    break;
                }
                b9VarArr3[i10] = b9VarArr[i10];
                b9 b9Var = b9VarArr[i10];
                long j10 = b9Var.f25526g;
                b9 b9Var2 = b9VarArr2[i10];
                if (j10 != b9Var2.f25526g) {
                    z11 = true;
                } else {
                    b9Var.d = b9Var2.d;
                }
                i10++;
            }
            if (!z11) {
                this.f25867e = 1.0f;
                return;
            }
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = 0;
                while (true) {
                    if (i12 < 3) {
                        if (b9VarArr[i12].f25526g == b9VarArr2[i11].f25526g) {
                            b9VarArr3[i12] = null;
                            if (i11 == i12) {
                                b9 b9Var3 = b9VarArr2[i11];
                                b9Var3.f25527i = -1;
                                org.telegram.ui.Cells.c4 c4Var = b9Var3.f25522b;
                                b9 b9Var4 = b9VarArr[i11];
                                b9Var3.f25522b = b9Var4.f25522b;
                                b9Var4.f25522b = c4Var;
                            } else {
                                b9 b9Var5 = b9VarArr2[i11];
                                b9Var5.f25527i = 2;
                                b9Var5.f25528j = i12;
                            }
                        } else {
                            i12++;
                        }
                    } else {
                        b9VarArr2[i11].f25527i = 0;
                        break;
                    }
                }
            }
            for (int i13 = 0; i13 < 3; i13++) {
                b9 b9Var6 = b9VarArr3[i13];
                if (b9Var6 != null) {
                    b9Var6.f25527i = 1;
                }
            }
            ValueAnimator valueAnimator = this.f25868f;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f25868f.cancel();
                if (this.f25883w) {
                    n();
                    this.f25883w = false;
                }
            }
            this.f25867e = 0.0f;
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f25868f = ofFloat;
                ofFloat.addUpdateListener(new f6(this, 4));
                this.f25868f.addListener(new a9(this, 0));
                this.f25868f.setDuration(this.v);
                this.f25868f.setInterpolator(pr.f30183f);
                this.f25868f.start();
            } else {
                this.f25883w = true;
            }
            f();
            return;
        }
        this.f25867e = 1.0f;
        n();
    }

    public final float c() {
        return this.A;
    }

    public final int d() {
        float f10;
        int i10 = this.f25880s;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f25872k;
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
        int i10 = this.f25872k;
        int i11 = 0;
        if (i10 != 4 && i10 != 10) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (i10 == 11) {
            dp = AndroidUtilities.dp(12.0f);
        } else {
            int i12 = this.f25880s;
            if (i12 != 0) {
                dp = (int) (i12 * this.f25881t);
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
            if (this.f25865b[i14].f25526g != 0) {
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
        View view = this.f25879r;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void g() {
        if (!this.B) {
            this.B = true;
            for (int i10 = 0; i10 < 3; i10++) {
                this.f25865b[i10].f25524e.onAttachedToWindow();
                this.f25866c[i10].f25524e.onAttachedToWindow();
            }
        }
    }

    public final void h() {
        if (this.B) {
            this.B = false;
            this.d = false;
            for (int i10 = 0; i10 < 3; i10++) {
                this.f25865b[i10].f25524e.onDetachedFromWindow();
                this.f25866c[i10].f25524e.onDetachedFromWindow();
            }
            if (this.f25872k == 3) {
                org.telegram.ui.ActionBar.k6.D0().a(0.0f);
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
            b9 b9Var = this.f25865b[i11];
            if (b9Var != null && (z8Var2 = b9Var.f25521a) != null) {
                z8Var2.u(i10);
            }
            b9 b9Var2 = this.f25866c[i11];
            if (b9Var2 != null && (z8Var = b9Var2.f25521a) != null) {
                z8Var.u(i10);
            }
        }
    }

    public final void k(int i10) {
        this.f25875n = i10;
        View view = this.f25879r;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final void l(int i10, TLObject tLObject, int i11) {
        TLRPC.User user;
        TLRPC.Chat chat;
        b9[] b9VarArr = this.f25866c;
        b9 b9Var = b9VarArr[i10];
        b9Var.f25526g = 0L;
        b9Var.f25525f = null;
        if (tLObject == null) {
            b9Var.f25524e.setImageBitmap((Drawable) null);
            f();
            return;
        }
        b9Var.d = -1L;
        b9Var.h = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            b9Var.f25525f = groupCallParticipant;
            long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
            if (DialogObject.isUserDialog(peerId)) {
                user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
                b9VarArr[i10].f25521a.m(i11, user);
                chat = null;
            } else {
                TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
                b9VarArr[i10].f25521a.k(i11, chat2);
                chat = chat2;
                user = null;
            }
            if (this.f25872k == 4) {
                if (peerId == AccountInstance.getInstance(i11).getUserConfig().getClientUserId()) {
                    b9VarArr[i10].d = 0L;
                } else if (this.f25874m) {
                    b9VarArr[i10].d = groupCallParticipant.lastActiveDate;
                } else {
                    b9VarArr[i10].d = groupCallParticipant.active_date;
                }
            } else {
                b9VarArr[i10].d = groupCallParticipant.active_date;
            }
            b9VarArr[i10].f25526g = peerId;
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            if (user2.self && this.f25864a) {
                b9Var.f25521a.g(1);
                b9VarArr[i10].f25521a.f33803p = 0.6f;
            } else {
                b9Var.f25521a.g(0);
                z8 z8Var = b9VarArr[i10].f25521a;
                z8Var.f33803p = 1.0f;
                z8Var.m(i11, user2);
            }
            b9VarArr[i10].f25526g = user2.f20990id;
            user = user2;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            b9Var.f25521a.g(0);
            z8 z8Var2 = b9VarArr[i10].f25521a;
            z8Var2.f33803p = 1.0f;
            z8Var2.k(i11, chat);
            b9VarArr[i10].f25526g = -chat.f20843id;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int d = d();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            b9VarArr[i10].f25526g = storyItem.f21080id;
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50, true, null, false);
                b9VarArr[i10].f25524e.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.document.thumbs, 50, true, closestPhotoSizeWithSize, true), storyItem.media.document), e2.c.h(d, "_", d), ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.document), e2.c.h(d, "_", d), 0L, null, storyItem, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 50, true, null, false);
                    b9VarArr[i10].f25524e.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.photo.sizes, 50, true, closestPhotoSizeWithSize2, true), storyItem.media.photo), e2.c.h(d, "_", d), ImageLocation.getForPhoto(closestPhotoSizeWithSize2, storyItem.media.photo), e2.c.h(d, "_", d), 0L, null, storyItem, 0);
                }
            }
        } else if (user != null) {
            if (user.self && this.f25864a) {
                b9 b9Var2 = b9VarArr[i10];
                b9Var2.f25524e.setImageBitmap(b9Var2.f25521a);
            } else {
                b9 b9Var3 = b9VarArr[i10];
                b9Var3.f25524e.setForUserOrChat(user, b9Var3.f25521a);
            }
        } else {
            b9 b9Var4 = b9VarArr[i10];
            b9Var4.f25524e.setForUserOrChat(chat, b9Var4.f25521a);
        }
        b9VarArr[i10].f25524e.setRoundRadius(d / 2);
        float f10 = d;
        b9VarArr[i10].f25524e.setImageCoords(0.0f, 0.0f, f10, f10);
        f();
    }

    public final void m(int i10) {
        this.f25880s = i10;
    }

    public final void n() {
        for (int i10 = 0; i10 < 3; i10++) {
            b9[] b9VarArr = this.f25865b;
            b9 b9Var = b9VarArr[i10];
            b9[] b9VarArr2 = this.f25866c;
            b9VarArr[i10] = b9VarArr2[i10];
            b9VarArr2[i10] = b9Var;
        }
    }
}
