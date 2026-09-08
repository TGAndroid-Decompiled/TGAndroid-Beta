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
public final class k9 {
    public float A;
    public boolean B;
    public boolean f27783a;
    public boolean d;
    public ValueAnimator f27787f;
    public boolean f27788g;
    public Runnable f27790j;
    public int f27791k;
    public boolean f27792l;
    public final boolean f27793m;
    public int f27794n;
    public int f27795o;
    public int f27796p;
    public final View f27798r;
    public int f27799s;
    public boolean f27802w;
    public boolean f27803x;
    public bi.v8 f27804y;
    public final Random f27805z;
    public final j9[] f27784b = new j9[3];
    public final j9[] f27785c = new j9[3];
    public float f27786e = 1.0f;
    public final Paint h = new Paint(1);
    public final Paint f27789i = new Paint(1);
    public int f27797q = AndroidUtilities.dp(1.67f);
    public float f27800t = 0.8f;
    public float f27801u = 1.0f;
    public long v = 220;

    public k9(View view, boolean z10) {
        pr prVar = pr.f29493f;
        this.f27805z = new Random();
        this.f27798r = view;
        for (int i10 = 0; i10 < 3; i10++) {
            j9[] j9VarArr = this.f27784b;
            ?? obj = new Object();
            j9VarArr[i10] = obj;
            obj.f27421e = new ImageReceiver(view);
            this.f27784b[i10].f27421e.setInvalidateAll(true);
            this.f27784b[i10].f27421e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.f27784b[i10].f27418a = new i9((org.telegram.ui.ActionBar.f6) null);
            this.f27784b[i10].f27418a.u(AndroidUtilities.dp(12.0f));
            j9[] j9VarArr2 = this.f27785c;
            ?? obj2 = new Object();
            j9VarArr2[i10] = obj2;
            obj2.f27421e = new ImageReceiver(view);
            this.f27785c[i10].f27421e.setInvalidateAll(true);
            this.f27785c[i10].f27421e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.f27785c[i10].f27418a = new i9((org.telegram.ui.ActionBar.f6) null);
            this.f27785c[i10].f27418a.u(AndroidUtilities.dp(12.0f));
        }
        this.f27793m = z10;
        this.f27789i.setColor(0);
        this.f27789i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a() {
        b(false, true);
    }

    public final void b(boolean z10, boolean z11) {
        j9[] j9VarArr;
        j9[] j9VarArr2;
        if (this.d && z10) {
            j9[] j9VarArr3 = new j9[3];
            int i10 = 0;
            boolean z12 = false;
            while (true) {
                j9VarArr = this.f27784b;
                j9VarArr2 = this.f27785c;
                if (i10 >= 3) {
                    break;
                }
                j9VarArr3[i10] = j9VarArr[i10];
                j9 j9Var = j9VarArr[i10];
                long j3 = j9Var.f27423g;
                j9 j9Var2 = j9VarArr2[i10];
                if (j3 != j9Var2.f27423g) {
                    z12 = true;
                } else {
                    j9Var.d = j9Var2.d;
                }
                i10++;
            }
            if (!z12) {
                this.f27786e = 1.0f;
                return;
            }
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = 0;
                while (true) {
                    if (i12 < 3) {
                        if (j9VarArr[i12].f27423g == j9VarArr2[i11].f27423g) {
                            j9VarArr3[i12] = null;
                            if (i11 == i12) {
                                j9 j9Var3 = j9VarArr2[i11];
                                j9Var3.f27424i = -1;
                                org.telegram.ui.Cells.b4 b4Var = j9Var3.f27419b;
                                j9 j9Var4 = j9VarArr[i11];
                                j9Var3.f27419b = j9Var4.f27419b;
                                j9Var4.f27419b = b4Var;
                            } else {
                                j9 j9Var5 = j9VarArr2[i11];
                                j9Var5.f27424i = 2;
                                j9Var5.f27425j = i12;
                            }
                        } else {
                            i12++;
                        }
                    } else {
                        j9VarArr2[i11].f27424i = 0;
                        break;
                    }
                }
            }
            for (int i13 = 0; i13 < 3; i13++) {
                j9 j9Var6 = j9VarArr3[i13];
                if (j9Var6 != null) {
                    j9Var6.f27424i = 1;
                }
            }
            ValueAnimator valueAnimator = this.f27787f;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f27787f.cancel();
                if (this.f27802w) {
                    n();
                    this.f27802w = false;
                }
            }
            this.f27786e = 0.0f;
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f27787f = ofFloat;
                ofFloat.addUpdateListener(new l6(this, 4));
                this.f27787f.addListener(new j6(this, 4));
                this.f27787f.setDuration(this.v);
                this.f27787f.setInterpolator(pr.f29493f);
                this.f27787f.start();
            } else {
                this.f27802w = true;
            }
            f();
            return;
        }
        this.f27786e = 1.0f;
        n();
    }

    public final float c() {
        return this.A;
    }

    public final int d() {
        float f7;
        int i10 = this.f27799s;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f27791k;
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
        int i10 = this.f27791k;
        int i11 = 0;
        if (i10 != 4 && i10 != 10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i10 == 11) {
            dp = AndroidUtilities.dp(12.0f);
        } else {
            int i12 = this.f27799s;
            if (i12 != 0) {
                dp = (int) (i12 * this.f27800t);
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
            if (this.f27784b[i14].f27423g != 0) {
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
        View view = this.f27798r;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void g() {
        if (!this.B) {
            this.B = true;
            for (int i10 = 0; i10 < 3; i10++) {
                this.f27784b[i10].f27421e.onAttachedToWindow();
                this.f27785c[i10].f27421e.onAttachedToWindow();
            }
        }
    }

    public final void h() {
        if (this.B) {
            this.B = false;
            this.d = false;
            for (int i10 = 0; i10 < 3; i10++) {
                this.f27784b[i10].f27421e.onDetachedFromWindow();
                this.f27785c[i10].f27421e.onDetachedFromWindow();
            }
            if (this.f27791k == 3) {
                org.telegram.ui.ActionBar.j6.D0().a(0.0f);
            }
        }
    }

    public final void i(android.graphics.Canvas r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k9.i(android.graphics.Canvas):void");
    }

    public final void j(int i10) {
        i9 i9Var;
        i9 i9Var2;
        for (int i11 = 0; i11 < 3; i11++) {
            j9 j9Var = this.f27784b[i11];
            if (j9Var != null && (i9Var2 = j9Var.f27418a) != null) {
                i9Var2.u(i10);
            }
            j9 j9Var2 = this.f27785c[i11];
            if (j9Var2 != null && (i9Var = j9Var2.f27418a) != null) {
                i9Var.u(i10);
            }
        }
    }

    public final void k(int i10) {
        this.f27794n = i10;
        View view = this.f27798r;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final void l(int i10, TLObject tLObject, int i11) {
        TLRPC.User user;
        TLRPC.Chat chat;
        j9[] j9VarArr = this.f27785c;
        j9 j9Var = j9VarArr[i10];
        j9Var.f27423g = 0L;
        j9Var.f27422f = null;
        if (tLObject == null) {
            j9Var.f27421e.setImageBitmap((Drawable) null);
            f();
            return;
        }
        j9Var.d = -1L;
        j9Var.h = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            j9Var.f27422f = groupCallParticipant;
            long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
            if (DialogObject.isUserDialog(peerId)) {
                user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
                j9VarArr[i10].f27418a.m(i11, user);
                chat = null;
            } else {
                TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
                j9VarArr[i10].f27418a.k(i11, chat2);
                chat = chat2;
                user = null;
            }
            if (this.f27791k == 4) {
                if (peerId == AccountInstance.getInstance(i11).getUserConfig().getClientUserId()) {
                    j9VarArr[i10].d = 0L;
                } else if (this.f27793m) {
                    j9VarArr[i10].d = groupCallParticipant.lastActiveDate;
                } else {
                    j9VarArr[i10].d = groupCallParticipant.active_date;
                }
            } else {
                j9VarArr[i10].d = groupCallParticipant.active_date;
            }
            j9VarArr[i10].f27423g = peerId;
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            if (user2.self && this.f27783a) {
                j9Var.f27418a.g(1);
                j9VarArr[i10].f27418a.f27065p = 0.6f;
            } else {
                j9Var.f27418a.g(0);
                i9 i9Var = j9VarArr[i10].f27418a;
                i9Var.f27065p = 1.0f;
                i9Var.m(i11, user2);
            }
            j9VarArr[i10].f27423g = user2.f20043id;
            user = user2;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            j9Var.f27418a.g(0);
            i9 i9Var2 = j9VarArr[i10].f27418a;
            i9Var2.f27065p = 1.0f;
            i9Var2.k(i11, chat);
            j9VarArr[i10].f27423g = -chat.f19896id;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int d = d();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            j9VarArr[i10].f27423g = storyItem.f20134id;
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50, true, null, false);
                j9VarArr[i10].f27421e.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.document.thumbs, 50, true, closestPhotoSizeWithSize, true), storyItem.media.document), a4.a.k(d, d, "_"), ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.document), a4.a.k(d, d, "_"), 0L, null, storyItem, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 50, true, null, false);
                    j9VarArr[i10].f27421e.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.photo.sizes, 50, true, closestPhotoSizeWithSize2, true), storyItem.media.photo), a4.a.k(d, d, "_"), ImageLocation.getForPhoto(closestPhotoSizeWithSize2, storyItem.media.photo), a4.a.k(d, d, "_"), 0L, null, storyItem, 0);
                }
            }
        } else if (user != null) {
            if (user.self && this.f27783a) {
                j9 j9Var2 = j9VarArr[i10];
                j9Var2.f27421e.setImageBitmap(j9Var2.f27418a);
            } else {
                j9 j9Var3 = j9VarArr[i10];
                j9Var3.f27421e.setForUserOrChat(user, j9Var3.f27418a);
            }
        } else {
            j9 j9Var4 = j9VarArr[i10];
            j9Var4.f27421e.setForUserOrChat(chat, j9Var4.f27418a);
        }
        j9VarArr[i10].f27421e.setRoundRadius(d / 2);
        float f7 = d;
        j9VarArr[i10].f27421e.setImageCoords(0.0f, 0.0f, f7, f7);
        f();
    }

    public final void m(int i10) {
        this.f27799s = i10;
    }

    public final void n() {
        for (int i10 = 0; i10 < 3; i10++) {
            j9[] j9VarArr = this.f27784b;
            j9 j9Var = j9VarArr[i10];
            j9[] j9VarArr2 = this.f27785c;
            j9VarArr[i10] = j9VarArr2[i10];
            j9VarArr2[i10] = j9Var;
        }
    }
}
