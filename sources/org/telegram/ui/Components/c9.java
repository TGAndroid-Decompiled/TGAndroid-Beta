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
    public boolean f25840a;
    public boolean d;
    public ValueAnimator f25844f;
    public boolean f25845g;
    public Runnable f25847j;
    public int f25848k;
    public boolean f25849l;
    public final boolean f25850m;
    public int f25851n;
    public int f25852o;
    public int f25853p;
    public final View f25855r;
    public int f25856s;
    public boolean f25859w;
    public boolean f25860x;
    public oh.u6 f25861y;
    public final Random f25862z;
    public final b9[] f25841b = new b9[3];
    public final b9[] f25842c = new b9[3];
    public float f25843e = 1.0f;
    public final Paint h = new Paint(1);
    public final Paint f25846i = new Paint(1);
    public int f25854q = AndroidUtilities.dp(1.67f);
    public float f25857t = 0.8f;
    public float f25858u = 1.0f;
    public long v = 220;

    public c9(View view, boolean z4) {
        pr prVar = pr.f30168f;
        this.f25862z = new Random();
        this.f25855r = view;
        for (int i10 = 0; i10 < 3; i10++) {
            b9[] b9VarArr = this.f25841b;
            ?? obj = new Object();
            b9VarArr[i10] = obj;
            obj.f25543e = new ImageReceiver(view);
            this.f25841b[i10].f25543e.setInvalidateAll(true);
            this.f25841b[i10].f25543e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.f25841b[i10].f25540a = new z8((org.telegram.ui.ActionBar.g6) null);
            this.f25841b[i10].f25540a.u(AndroidUtilities.dp(12.0f));
            b9[] b9VarArr2 = this.f25842c;
            ?? obj2 = new Object();
            b9VarArr2[i10] = obj2;
            obj2.f25543e = new ImageReceiver(view);
            this.f25842c[i10].f25543e.setInvalidateAll(true);
            this.f25842c[i10].f25543e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.f25842c[i10].f25540a = new z8((org.telegram.ui.ActionBar.g6) null);
            this.f25842c[i10].f25540a.u(AndroidUtilities.dp(12.0f));
        }
        this.f25850m = z4;
        this.f25846i.setColor(0);
        this.f25846i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
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
                b9VarArr = this.f25841b;
                b9VarArr2 = this.f25842c;
                if (i10 >= 3) {
                    break;
                }
                b9VarArr3[i10] = b9VarArr[i10];
                b9 b9Var = b9VarArr[i10];
                long j10 = b9Var.f25545g;
                b9 b9Var2 = b9VarArr2[i10];
                if (j10 != b9Var2.f25545g) {
                    z11 = true;
                } else {
                    b9Var.d = b9Var2.d;
                }
                i10++;
            }
            if (!z11) {
                this.f25843e = 1.0f;
                return;
            }
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = 0;
                while (true) {
                    if (i12 < 3) {
                        if (b9VarArr[i12].f25545g == b9VarArr2[i11].f25545g) {
                            b9VarArr3[i12] = null;
                            if (i11 == i12) {
                                b9 b9Var3 = b9VarArr2[i11];
                                b9Var3.f25546i = -1;
                                org.telegram.ui.Cells.c4 c4Var = b9Var3.f25541b;
                                b9 b9Var4 = b9VarArr[i11];
                                b9Var3.f25541b = b9Var4.f25541b;
                                b9Var4.f25541b = c4Var;
                            } else {
                                b9 b9Var5 = b9VarArr2[i11];
                                b9Var5.f25546i = 2;
                                b9Var5.f25547j = i12;
                            }
                        } else {
                            i12++;
                        }
                    } else {
                        b9VarArr2[i11].f25546i = 0;
                        break;
                    }
                }
            }
            for (int i13 = 0; i13 < 3; i13++) {
                b9 b9Var6 = b9VarArr3[i13];
                if (b9Var6 != null) {
                    b9Var6.f25546i = 1;
                }
            }
            ValueAnimator valueAnimator = this.f25844f;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f25844f.cancel();
                if (this.f25859w) {
                    n();
                    this.f25859w = false;
                }
            }
            this.f25843e = 0.0f;
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f25844f = ofFloat;
                ofFloat.addUpdateListener(new f6(this, 4));
                this.f25844f.addListener(new a9(this, 0));
                this.f25844f.setDuration(this.v);
                this.f25844f.setInterpolator(pr.f30168f);
                this.f25844f.start();
            } else {
                this.f25859w = true;
            }
            f();
            return;
        }
        this.f25843e = 1.0f;
        n();
    }

    public final float c() {
        return this.A;
    }

    public final int d() {
        float f10;
        int i10 = this.f25856s;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f25848k;
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
        int i10 = this.f25848k;
        int i11 = 0;
        if (i10 != 4 && i10 != 10) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (i10 == 11) {
            dp = AndroidUtilities.dp(12.0f);
        } else {
            int i12 = this.f25856s;
            if (i12 != 0) {
                dp = (int) (i12 * this.f25857t);
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
            if (this.f25841b[i14].f25545g != 0) {
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
        View view = this.f25855r;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void g() {
        if (!this.B) {
            this.B = true;
            for (int i10 = 0; i10 < 3; i10++) {
                this.f25841b[i10].f25543e.onAttachedToWindow();
                this.f25842c[i10].f25543e.onAttachedToWindow();
            }
        }
    }

    public final void h() {
        if (this.B) {
            this.B = false;
            this.d = false;
            for (int i10 = 0; i10 < 3; i10++) {
                this.f25841b[i10].f25543e.onDetachedFromWindow();
                this.f25842c[i10].f25543e.onDetachedFromWindow();
            }
            if (this.f25848k == 3) {
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
            b9 b9Var = this.f25841b[i11];
            if (b9Var != null && (z8Var2 = b9Var.f25540a) != null) {
                z8Var2.u(i10);
            }
            b9 b9Var2 = this.f25842c[i11];
            if (b9Var2 != null && (z8Var = b9Var2.f25540a) != null) {
                z8Var.u(i10);
            }
        }
    }

    public final void k(int i10) {
        this.f25851n = i10;
        View view = this.f25855r;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final void l(int i10, TLObject tLObject, int i11) {
        TLRPC.User user;
        TLRPC.Chat chat;
        b9[] b9VarArr = this.f25842c;
        b9 b9Var = b9VarArr[i10];
        b9Var.f25545g = 0L;
        b9Var.f25544f = null;
        if (tLObject == null) {
            b9Var.f25543e.setImageBitmap((Drawable) null);
            f();
            return;
        }
        b9Var.d = -1L;
        b9Var.h = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            b9Var.f25544f = groupCallParticipant;
            long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
            if (DialogObject.isUserDialog(peerId)) {
                user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
                b9VarArr[i10].f25540a.m(i11, user);
                chat = null;
            } else {
                TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
                b9VarArr[i10].f25540a.k(i11, chat2);
                chat = chat2;
                user = null;
            }
            if (this.f25848k == 4) {
                if (peerId == AccountInstance.getInstance(i11).getUserConfig().getClientUserId()) {
                    b9VarArr[i10].d = 0L;
                } else if (this.f25850m) {
                    b9VarArr[i10].d = groupCallParticipant.lastActiveDate;
                } else {
                    b9VarArr[i10].d = groupCallParticipant.active_date;
                }
            } else {
                b9VarArr[i10].d = groupCallParticipant.active_date;
            }
            b9VarArr[i10].f25545g = peerId;
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            if (user2.self && this.f25840a) {
                b9Var.f25540a.g(1);
                b9VarArr[i10].f25540a.f33847p = 0.6f;
            } else {
                b9Var.f25540a.g(0);
                z8 z8Var = b9VarArr[i10].f25540a;
                z8Var.f33847p = 1.0f;
                z8Var.m(i11, user2);
            }
            b9VarArr[i10].f25545g = user2.f20992id;
            user = user2;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            b9Var.f25540a.g(0);
            z8 z8Var2 = b9VarArr[i10].f25540a;
            z8Var2.f33847p = 1.0f;
            z8Var2.k(i11, chat);
            b9VarArr[i10].f25545g = -chat.f20845id;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int d = d();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            b9VarArr[i10].f25545g = storyItem.f21082id;
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50, true, null, false);
                b9VarArr[i10].f25543e.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.document.thumbs, 50, true, closestPhotoSizeWithSize, true), storyItem.media.document), e2.c.h(d, "_", d), ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.document), e2.c.h(d, "_", d), 0L, null, storyItem, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 50, true, null, false);
                    b9VarArr[i10].f25543e.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.photo.sizes, 50, true, closestPhotoSizeWithSize2, true), storyItem.media.photo), e2.c.h(d, "_", d), ImageLocation.getForPhoto(closestPhotoSizeWithSize2, storyItem.media.photo), e2.c.h(d, "_", d), 0L, null, storyItem, 0);
                }
            }
        } else if (user != null) {
            if (user.self && this.f25840a) {
                b9 b9Var2 = b9VarArr[i10];
                b9Var2.f25543e.setImageBitmap(b9Var2.f25540a);
            } else {
                b9 b9Var3 = b9VarArr[i10];
                b9Var3.f25543e.setForUserOrChat(user, b9Var3.f25540a);
            }
        } else {
            b9 b9Var4 = b9VarArr[i10];
            b9Var4.f25543e.setForUserOrChat(chat, b9Var4.f25540a);
        }
        b9VarArr[i10].f25543e.setRoundRadius(d / 2);
        float f10 = d;
        b9VarArr[i10].f25543e.setImageCoords(0.0f, 0.0f, f10, f10);
        f();
    }

    public final void m(int i10) {
        this.f25856s = i10;
    }

    public final void n() {
        for (int i10 = 0; i10 < 3; i10++) {
            b9[] b9VarArr = this.f25841b;
            b9 b9Var = b9VarArr[i10];
            b9[] b9VarArr2 = this.f25842c;
            b9VarArr[i10] = b9VarArr2[i10];
            b9VarArr2[i10] = b9Var;
        }
    }
}
