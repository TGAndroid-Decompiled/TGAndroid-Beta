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
    public boolean f28288a;
    public boolean d;
    public ValueAnimator f28292f;
    public boolean f28293g;
    public Runnable f28295j;
    public int f28296k;
    public boolean f28297l;
    public final boolean f28298m;
    public int f28299n;
    public int f28300o;
    public int f28301p;
    public final View f28303r;
    public int f28304s;
    public boolean f28307w;
    public boolean f28308x;
    public ai.n9 f28309y;
    public final Random f28310z;
    public final k9[] f28289b = new k9[3];
    public final k9[] f28290c = new k9[3];
    public float f28291e = 1.0f;
    public final Paint h = new Paint(1);
    public final Paint f28294i = new Paint(1);
    public int f28302q = AndroidUtilities.dp(1.67f);
    public float f28305t = 0.8f;
    public float f28306u = 1.0f;
    public long v = 220;

    public l9(View view, boolean z10) {
        is isVar = is.f27500f;
        this.f28310z = new Random();
        this.f28303r = view;
        for (int i10 = 0; i10 < 3; i10++) {
            k9[] k9VarArr = this.f28289b;
            ?? obj = new Object();
            k9VarArr[i10] = obj;
            obj.f27992e = new ImageReceiver(view);
            this.f28289b[i10].f27992e.setInvalidateAll(true);
            this.f28289b[i10].f27992e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.f28289b[i10].f27989a = new j9((org.telegram.ui.ActionBar.d6) null);
            this.f28289b[i10].f27989a.u(AndroidUtilities.dp(12.0f));
            k9[] k9VarArr2 = this.f28290c;
            ?? obj2 = new Object();
            k9VarArr2[i10] = obj2;
            obj2.f27992e = new ImageReceiver(view);
            this.f28290c[i10].f27992e.setInvalidateAll(true);
            this.f28290c[i10].f27992e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.f28290c[i10].f27989a = new j9((org.telegram.ui.ActionBar.d6) null);
            this.f28290c[i10].f27989a.u(AndroidUtilities.dp(12.0f));
        }
        this.f28298m = z10;
        this.f28294i.setColor(0);
        this.f28294i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
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
                k9VarArr = this.f28289b;
                k9VarArr2 = this.f28290c;
                if (i10 >= 3) {
                    break;
                }
                k9VarArr3[i10] = k9VarArr[i10];
                k9 k9Var = k9VarArr[i10];
                long j3 = k9Var.f27994g;
                k9 k9Var2 = k9VarArr2[i10];
                if (j3 != k9Var2.f27994g) {
                    z12 = true;
                } else {
                    k9Var.d = k9Var2.d;
                }
                i10++;
            }
            if (!z12) {
                this.f28291e = 1.0f;
                return;
            }
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = 0;
                while (true) {
                    if (i12 < 3) {
                        if (k9VarArr[i12].f27994g == k9VarArr2[i11].f27994g) {
                            k9VarArr3[i12] = null;
                            if (i11 == i12) {
                                k9 k9Var3 = k9VarArr2[i11];
                                k9Var3.f27995i = -1;
                                org.telegram.ui.Cells.c4 c4Var = k9Var3.f27990b;
                                k9 k9Var4 = k9VarArr[i11];
                                k9Var3.f27990b = k9Var4.f27990b;
                                k9Var4.f27990b = c4Var;
                            } else {
                                k9 k9Var5 = k9VarArr2[i11];
                                k9Var5.f27995i = 2;
                                k9Var5.f27996j = i12;
                            }
                        } else {
                            i12++;
                        }
                    } else {
                        k9VarArr2[i11].f27995i = 0;
                        break;
                    }
                }
            }
            for (int i13 = 0; i13 < 3; i13++) {
                k9 k9Var6 = k9VarArr3[i13];
                if (k9Var6 != null) {
                    k9Var6.f27995i = 1;
                }
            }
            ValueAnimator valueAnimator = this.f28292f;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f28292f.cancel();
                if (this.f28307w) {
                    n();
                    this.f28307w = false;
                }
            }
            this.f28291e = 0.0f;
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f28292f = ofFloat;
                ofFloat.addUpdateListener(new m6(this, 4));
                this.f28292f.addListener(new t8(this, 1));
                this.f28292f.setDuration(this.v);
                this.f28292f.setInterpolator(is.f27500f);
                this.f28292f.start();
            } else {
                this.f28307w = true;
            }
            f();
            return;
        }
        this.f28291e = 1.0f;
        n();
    }

    public final float c() {
        return this.A;
    }

    public final int d() {
        float f7;
        int i10 = this.f28304s;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f28296k;
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
        int i10 = this.f28296k;
        int i11 = 0;
        if (i10 != 4 && i10 != 10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i10 == 11) {
            dp = AndroidUtilities.dp(12.0f);
        } else {
            int i12 = this.f28304s;
            if (i12 != 0) {
                dp = (int) (i12 * this.f28305t);
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
            if (this.f28289b[i14].f27994g != 0) {
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
        View view = this.f28303r;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void g() {
        if (!this.B) {
            this.B = true;
            for (int i10 = 0; i10 < 3; i10++) {
                this.f28289b[i10].f27992e.onAttachedToWindow();
                this.f28290c[i10].f27992e.onAttachedToWindow();
            }
        }
    }

    public final void h() {
        if (this.B) {
            this.B = false;
            this.d = false;
            for (int i10 = 0; i10 < 3; i10++) {
                this.f28289b[i10].f27992e.onDetachedFromWindow();
                this.f28290c[i10].f27992e.onDetachedFromWindow();
            }
            if (this.f28296k == 3) {
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
            k9 k9Var = this.f28289b[i11];
            if (k9Var != null && (j9Var2 = k9Var.f27989a) != null) {
                j9Var2.u(i10);
            }
            k9 k9Var2 = this.f28290c[i11];
            if (k9Var2 != null && (j9Var = k9Var2.f27989a) != null) {
                j9Var.u(i10);
            }
        }
    }

    public final void k(int i10) {
        this.f28299n = i10;
        View view = this.f28303r;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final void l(int i10, TLObject tLObject, int i11) {
        TLRPC.User user;
        TLRPC.Chat chat;
        k9[] k9VarArr = this.f28290c;
        k9 k9Var = k9VarArr[i10];
        k9Var.f27994g = 0L;
        k9Var.f27993f = null;
        if (tLObject == null) {
            k9Var.f27992e.setImageBitmap((Drawable) null);
            f();
            return;
        }
        k9Var.d = -1L;
        k9Var.h = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            k9Var.f27993f = groupCallParticipant;
            long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
            if (DialogObject.isUserDialog(peerId)) {
                user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
                k9VarArr[i10].f27989a.m(i11, user);
                chat = null;
            } else {
                TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
                k9VarArr[i10].f27989a.k(i11, chat2);
                chat = chat2;
                user = null;
            }
            if (this.f28296k == 4) {
                if (peerId == AccountInstance.getInstance(i11).getUserConfig().getClientUserId()) {
                    k9VarArr[i10].d = 0L;
                } else if (this.f28298m) {
                    k9VarArr[i10].d = groupCallParticipant.lastActiveDate;
                } else {
                    k9VarArr[i10].d = groupCallParticipant.active_date;
                }
            } else {
                k9VarArr[i10].d = groupCallParticipant.active_date;
            }
            k9VarArr[i10].f27994g = peerId;
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            if (user2.self && this.f28288a) {
                k9Var.f27989a.g(1);
                k9VarArr[i10].f27989a.f27666p = 0.6f;
            } else {
                k9Var.f27989a.g(0);
                j9 j9Var = k9VarArr[i10].f27989a;
                j9Var.f27666p = 1.0f;
                j9Var.m(i11, user2);
            }
            k9VarArr[i10].f27994g = user2.f20215id;
            user = user2;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            k9Var.f27989a.g(0);
            j9 j9Var2 = k9VarArr[i10].f27989a;
            j9Var2.f27666p = 1.0f;
            j9Var2.k(i11, chat);
            k9VarArr[i10].f27994g = -chat.f20068id;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int d = d();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            k9VarArr[i10].f27994g = storyItem.f20305id;
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50, true, null, false);
                k9VarArr[i10].f27992e.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.document.thumbs, 50, true, closestPhotoSizeWithSize, true), storyItem.media.document), a1.g.l(d, d, "_"), ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.document), a1.g.l(d, d, "_"), 0L, null, storyItem, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 50, true, null, false);
                    k9VarArr[i10].f27992e.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.photo.sizes, 50, true, closestPhotoSizeWithSize2, true), storyItem.media.photo), a1.g.l(d, d, "_"), ImageLocation.getForPhoto(closestPhotoSizeWithSize2, storyItem.media.photo), a1.g.l(d, d, "_"), 0L, null, storyItem, 0);
                }
            }
        } else if (user != null) {
            if (user.self && this.f28288a) {
                k9 k9Var2 = k9VarArr[i10];
                k9Var2.f27992e.setImageBitmap(k9Var2.f27989a);
            } else {
                k9 k9Var3 = k9VarArr[i10];
                k9Var3.f27992e.setForUserOrChat(user, k9Var3.f27989a);
            }
        } else {
            k9 k9Var4 = k9VarArr[i10];
            k9Var4.f27992e.setForUserOrChat(chat, k9Var4.f27989a);
        }
        k9VarArr[i10].f27992e.setRoundRadius(d / 2);
        float f7 = d;
        k9VarArr[i10].f27992e.setImageCoords(0.0f, 0.0f, f7, f7);
        f();
    }

    public final void m(int i10) {
        this.f28304s = i10;
    }

    public final void n() {
        for (int i10 = 0; i10 < 3; i10++) {
            k9[] k9VarArr = this.f28289b;
            k9 k9Var = k9VarArr[i10];
            k9[] k9VarArr2 = this.f28290c;
            k9VarArr[i10] = k9VarArr2[i10];
            k9VarArr2[i10] = k9Var;
        }
    }
}
