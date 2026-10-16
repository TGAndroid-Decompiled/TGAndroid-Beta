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
public final class m9 {
    public float A;
    public boolean B;
    public boolean f27008a;
    public boolean d;
    public ValueAnimator f27011f;
    public boolean f27012g;
    public Runnable f27014j;
    public int f27015k;
    public boolean f27016l;
    public final boolean f27017m;
    public int f27018n;
    public int f27019o;
    public int f27020p;
    public final View f27022r;
    public int f27023s;
    public boolean f27026w;
    public boolean f27027x;
    public bi.y8 f27028y;
    public final Random f27029z;
    public final l9[] f27009b = new l9[3];
    public final l9[] f27010c = new l9[3];
    public float e = 1.0f;
    public final Paint h = new Paint(1);
    public final Paint f27013i = new Paint(1);
    public int f27021q = AndroidUtilities.dp(1.67f);
    public float f27024t = 0.8f;
    public float f27025u = 1.0f;
    public long v = 220;

    public m9(View view, boolean z10) {
        es esVar = es.f24465f;
        this.f27029z = new Random();
        this.f27022r = view;
        for (int i10 = 0; i10 < 3; i10++) {
            l9[] l9VarArr = this.f27009b;
            ?? obj = new Object();
            l9VarArr[i10] = obj;
            obj.e = new ImageReceiver(view);
            this.f27009b[i10].e.setInvalidateAll(true);
            this.f27009b[i10].e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.f27009b[i10].f26677a = new k9((org.telegram.ui.ActionBar.c6) null);
            this.f27009b[i10].f26677a.u(AndroidUtilities.dp(12.0f));
            l9[] l9VarArr2 = this.f27010c;
            ?? obj2 = new Object();
            l9VarArr2[i10] = obj2;
            obj2.e = new ImageReceiver(view);
            this.f27010c[i10].e.setInvalidateAll(true);
            this.f27010c[i10].e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.f27010c[i10].f26677a = new k9((org.telegram.ui.ActionBar.c6) null);
            this.f27010c[i10].f26677a.u(AndroidUtilities.dp(12.0f));
        }
        this.f27017m = z10;
        this.f27013i.setColor(0);
        this.f27013i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a() {
        b(false, true);
    }

    public final void b(boolean z10, boolean z11) {
        l9[] l9VarArr;
        l9[] l9VarArr2;
        if (this.d && z10) {
            l9[] l9VarArr3 = new l9[3];
            int i10 = 0;
            boolean z12 = false;
            while (true) {
                l9VarArr = this.f27009b;
                l9VarArr2 = this.f27010c;
                if (i10 >= 3) {
                    break;
                }
                l9VarArr3[i10] = l9VarArr[i10];
                l9 l9Var = l9VarArr[i10];
                long j10 = l9Var.f26681g;
                l9 l9Var2 = l9VarArr2[i10];
                if (j10 != l9Var2.f26681g) {
                    z12 = true;
                } else {
                    l9Var.d = l9Var2.d;
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
                        if (l9VarArr[i12].f26681g == l9VarArr2[i11].f26681g) {
                            l9VarArr3[i12] = null;
                            if (i11 == i12) {
                                l9 l9Var3 = l9VarArr2[i11];
                                l9Var3.f26682i = -1;
                                org.telegram.ui.Cells.c4 c4Var = l9Var3.f26678b;
                                l9 l9Var4 = l9VarArr[i11];
                                l9Var3.f26678b = l9Var4.f26678b;
                                l9Var4.f26678b = c4Var;
                            } else {
                                l9 l9Var5 = l9VarArr2[i11];
                                l9Var5.f26682i = 2;
                                l9Var5.f26683j = i12;
                            }
                        } else {
                            i12++;
                        }
                    } else {
                        l9VarArr2[i11].f26682i = 0;
                        break;
                    }
                }
            }
            for (int i13 = 0; i13 < 3; i13++) {
                l9 l9Var6 = l9VarArr3[i13];
                if (l9Var6 != null) {
                    l9Var6.f26682i = 1;
                }
            }
            ValueAnimator valueAnimator = this.f27011f;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f27011f.cancel();
                if (this.f27026w) {
                    n();
                    this.f27026w = false;
                }
            }
            this.e = 0.0f;
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f27011f = ofFloat;
                ofFloat.addUpdateListener(new n6(this, 4));
                this.f27011f.addListener(new l6(this, 4));
                this.f27011f.setDuration(this.v);
                this.f27011f.setInterpolator(es.f24465f);
                this.f27011f.start();
            } else {
                this.f27026w = true;
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
        int i10 = this.f27023s;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f27015k;
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
        int i10 = this.f27015k;
        int i11 = 0;
        if (i10 != 4 && i10 != 10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i10 == 11) {
            dp = AndroidUtilities.dp(12.0f);
        } else {
            int i12 = this.f27023s;
            if (i12 != 0) {
                dp = (int) (i12 * this.f27024t);
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
            if (this.f27009b[i14].f26681g != 0) {
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
        View view = this.f27022r;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void g() {
        if (!this.B) {
            this.B = true;
            for (int i10 = 0; i10 < 3; i10++) {
                this.f27009b[i10].e.onAttachedToWindow();
                this.f27010c[i10].e.onAttachedToWindow();
            }
        }
    }

    public final void h() {
        if (this.B) {
            this.B = false;
            this.d = false;
            for (int i10 = 0; i10 < 3; i10++) {
                this.f27009b[i10].e.onDetachedFromWindow();
                this.f27010c[i10].e.onDetachedFromWindow();
            }
            if (this.f27015k == 3) {
                org.telegram.ui.ActionBar.g6.E0().a(0.0f);
            }
        }
    }

    public final void i(android.graphics.Canvas r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m9.i(android.graphics.Canvas):void");
    }

    public final void j(int i10) {
        k9 k9Var;
        k9 k9Var2;
        for (int i11 = 0; i11 < 3; i11++) {
            l9 l9Var = this.f27009b[i11];
            if (l9Var != null && (k9Var2 = l9Var.f26677a) != null) {
                k9Var2.u(i10);
            }
            l9 l9Var2 = this.f27010c[i11];
            if (l9Var2 != null && (k9Var = l9Var2.f26677a) != null) {
                k9Var.u(i10);
            }
        }
    }

    public final void k(int i10) {
        this.f27018n = i10;
        View view = this.f27022r;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final void l(int i10, TLObject tLObject, int i11) {
        TLRPC.User user;
        TLRPC.Chat chat;
        l9[] l9VarArr = this.f27010c;
        l9 l9Var = l9VarArr[i10];
        l9Var.f26681g = 0L;
        l9Var.f26680f = null;
        if (tLObject == null) {
            l9Var.e.setImageBitmap((Drawable) null);
            f();
            return;
        }
        l9Var.d = -1L;
        l9Var.h = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            l9Var.f26680f = groupCallParticipant;
            long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
            if (DialogObject.isUserDialog(peerId)) {
                user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
                l9VarArr[i10].f26677a.m(i11, user);
                chat = null;
            } else {
                TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
                l9VarArr[i10].f26677a.k(i11, chat2);
                chat = chat2;
                user = null;
            }
            if (this.f27015k == 4) {
                if (peerId == AccountInstance.getInstance(i11).getUserConfig().getClientUserId()) {
                    l9VarArr[i10].d = 0L;
                } else if (this.f27017m) {
                    l9VarArr[i10].d = groupCallParticipant.lastActiveDate;
                } else {
                    l9VarArr[i10].d = groupCallParticipant.active_date;
                }
            } else {
                l9VarArr[i10].d = groupCallParticipant.active_date;
            }
            l9VarArr[i10].f26681g = peerId;
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            if (user2.self && this.f27008a) {
                l9Var.f26677a.g(1);
                l9VarArr[i10].f26677a.f26292p = 0.6f;
            } else {
                l9Var.f26677a.g(0);
                k9 k9Var = l9VarArr[i10].f26677a;
                k9Var.f26292p = 1.0f;
                k9Var.m(i11, user2);
            }
            l9VarArr[i10].f26681g = user2.f19063id;
            user = user2;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            l9Var.f26677a.g(0);
            k9 k9Var2 = l9VarArr[i10].f26677a;
            k9Var2.f26292p = 1.0f;
            k9Var2.k(i11, chat);
            l9VarArr[i10].f26681g = -chat.f18916id;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int d = d();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            l9VarArr[i10].f26681g = storyItem.f19151id;
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50, true, null, false);
                l9VarArr[i10].e.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.document.thumbs, 50, true, closestPhotoSizeWithSize, true), storyItem.media.document), a1.g.k(d, d, "_"), ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.document), a1.g.k(d, d, "_"), 0L, null, storyItem, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 50, true, null, false);
                    l9VarArr[i10].e.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.photo.sizes, 50, true, closestPhotoSizeWithSize2, true), storyItem.media.photo), a1.g.k(d, d, "_"), ImageLocation.getForPhoto(closestPhotoSizeWithSize2, storyItem.media.photo), a1.g.k(d, d, "_"), 0L, null, storyItem, 0);
                }
            }
        } else if (user != null) {
            if (user.self && this.f27008a) {
                l9 l9Var2 = l9VarArr[i10];
                l9Var2.e.setImageBitmap(l9Var2.f26677a);
            } else {
                l9 l9Var3 = l9VarArr[i10];
                l9Var3.e.setForUserOrChat(user, l9Var3.f26677a);
            }
        } else {
            l9 l9Var4 = l9VarArr[i10];
            l9Var4.e.setForUserOrChat(chat, l9Var4.f26677a);
        }
        l9VarArr[i10].e.setRoundRadius(d / 2);
        float f7 = d;
        l9VarArr[i10].e.setImageCoords(0.0f, 0.0f, f7, f7);
        f();
    }

    public final void m(int i10) {
        this.f27023s = i10;
    }

    public final void n() {
        for (int i10 = 0; i10 < 3; i10++) {
            l9[] l9VarArr = this.f27009b;
            l9 l9Var = l9VarArr[i10];
            l9[] l9VarArr2 = this.f27010c;
            l9VarArr[i10] = l9VarArr2[i10];
            l9VarArr2[i10] = l9Var;
        }
    }
}
