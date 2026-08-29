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
public final class g9 {
    public float A;
    public boolean B;
    public boolean f28823a;
    public boolean d;
    public ValueAnimator f28827f;
    public boolean f28828g;
    public Runnable f28830j;
    public int f28831k;
    public boolean f28832l;
    public final boolean f28833m;
    public int f28834n;
    public int f28835o;
    public int f28836p;
    public final View f28838r;
    public int f28839s;
    public boolean f28842w;
    public boolean f28843x;
    public lh.t6 f28844y;
    public final Random f28845z;
    public final f9[] f28824b = new f9[3];
    public final f9[] f28825c = new f9[3];
    public float f28826e = 1.0f;
    public final Paint h = new Paint(1);
    public final Paint f28829i = new Paint(1);
    public int f28837q = AndroidUtilities.dp(1.67f);
    public float f28840t = 0.8f;
    public float f28841u = 1.0f;
    public long v = 220;

    public g9(View view, boolean z10) {
        jr jrVar = jr.f29800f;
        this.f28845z = new Random();
        this.f28838r = view;
        for (int i10 = 0; i10 < 3; i10++) {
            f9[] f9VarArr = this.f28824b;
            ?? obj = new Object();
            f9VarArr[i10] = obj;
            obj.f28355e = new ImageReceiver(view);
            this.f28824b[i10].f28355e.setInvalidateAll(true);
            this.f28824b[i10].f28355e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.f28824b[i10].f28352a = new e9((org.telegram.ui.ActionBar.c6) null);
            this.f28824b[i10].f28352a.u(AndroidUtilities.dp(12.0f));
            f9[] f9VarArr2 = this.f28825c;
            ?? obj2 = new Object();
            f9VarArr2[i10] = obj2;
            obj2.f28355e = new ImageReceiver(view);
            this.f28825c[i10].f28355e.setInvalidateAll(true);
            this.f28825c[i10].f28355e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.f28825c[i10].f28352a = new e9((org.telegram.ui.ActionBar.c6) null);
            this.f28825c[i10].f28352a.u(AndroidUtilities.dp(12.0f));
        }
        this.f28833m = z10;
        this.f28829i.setColor(0);
        this.f28829i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a() {
        b(false, true);
    }

    public final void b(boolean z10, boolean z11) {
        f9[] f9VarArr;
        f9[] f9VarArr2;
        if (this.d && z10) {
            f9[] f9VarArr3 = new f9[3];
            int i10 = 0;
            boolean z12 = false;
            while (true) {
                f9VarArr = this.f28824b;
                f9VarArr2 = this.f28825c;
                if (i10 >= 3) {
                    break;
                }
                f9VarArr3[i10] = f9VarArr[i10];
                f9 f9Var = f9VarArr[i10];
                long j10 = f9Var.f28357g;
                f9 f9Var2 = f9VarArr2[i10];
                if (j10 != f9Var2.f28357g) {
                    z12 = true;
                } else {
                    f9Var.d = f9Var2.d;
                }
                i10++;
            }
            if (!z12) {
                this.f28826e = 1.0f;
                return;
            }
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = 0;
                while (true) {
                    if (i12 < 3) {
                        if (f9VarArr[i12].f28357g == f9VarArr2[i11].f28357g) {
                            f9VarArr3[i12] = null;
                            if (i11 == i12) {
                                f9 f9Var3 = f9VarArr2[i11];
                                f9Var3.f28358i = -1;
                                org.telegram.ui.Cells.a4 a4Var = f9Var3.f28353b;
                                f9 f9Var4 = f9VarArr[i11];
                                f9Var3.f28353b = f9Var4.f28353b;
                                f9Var4.f28353b = a4Var;
                            } else {
                                f9 f9Var5 = f9VarArr2[i11];
                                f9Var5.f28358i = 2;
                                f9Var5.f28359j = i12;
                            }
                        } else {
                            i12++;
                        }
                    } else {
                        f9VarArr2[i11].f28358i = 0;
                        break;
                    }
                }
            }
            for (int i13 = 0; i13 < 3; i13++) {
                f9 f9Var6 = f9VarArr3[i13];
                if (f9Var6 != null) {
                    f9Var6.f28358i = 1;
                }
            }
            ValueAnimator valueAnimator = this.f28827f;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f28827f.cancel();
                if (this.f28842w) {
                    n();
                    this.f28842w = false;
                }
            }
            this.f28826e = 0.0f;
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f28827f = ofFloat;
                ofFloat.addUpdateListener(new j6(this, 4));
                this.f28827f.addListener(new org.telegram.ui.bm(this, 9));
                this.f28827f.setDuration(this.v);
                this.f28827f.setInterpolator(jr.f29800f);
                this.f28827f.start();
            } else {
                this.f28842w = true;
            }
            f();
            return;
        }
        this.f28826e = 1.0f;
        n();
    }

    public final float c() {
        return this.A;
    }

    public final int d() {
        float f9;
        int i10 = this.f28839s;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f28831k;
        if (i11 != 4 && i11 != 10) {
            f9 = 24.0f;
        } else {
            f9 = 32.0f;
        }
        return AndroidUtilities.dp(f9);
    }

    public final float e() {
        boolean z10;
        float f9;
        int dp;
        int i10 = this.f28831k;
        int i11 = 0;
        if (i10 != 4 && i10 != 10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i10 == 11) {
            dp = AndroidUtilities.dp(12.0f);
        } else {
            int i12 = this.f28839s;
            if (i12 != 0) {
                dp = (int) (i12 * this.f28840t);
            } else {
                if (z10) {
                    f9 = 24.0f;
                } else {
                    f9 = 20.0f;
                }
                dp = AndroidUtilities.dp(f9);
            }
        }
        int i13 = 0;
        for (int i14 = 0; i14 < 3; i14++) {
            if (this.f28824b[i14].f28357g != 0) {
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
        View view = this.f28838r;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void g() {
        if (!this.B) {
            this.B = true;
            for (int i10 = 0; i10 < 3; i10++) {
                this.f28824b[i10].f28355e.onAttachedToWindow();
                this.f28825c[i10].f28355e.onAttachedToWindow();
            }
        }
    }

    public final void h() {
        if (this.B) {
            this.B = false;
            this.d = false;
            for (int i10 = 0; i10 < 3; i10++) {
                this.f28824b[i10].f28355e.onDetachedFromWindow();
                this.f28825c[i10].f28355e.onDetachedFromWindow();
            }
            if (this.f28831k == 3) {
                org.telegram.ui.ActionBar.g6.D0().a(0.0f);
            }
        }
    }

    public final void i(android.graphics.Canvas r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g9.i(android.graphics.Canvas):void");
    }

    public final void j(int i10) {
        e9 e9Var;
        e9 e9Var2;
        for (int i11 = 0; i11 < 3; i11++) {
            f9 f9Var = this.f28824b[i11];
            if (f9Var != null && (e9Var2 = f9Var.f28352a) != null) {
                e9Var2.u(i10);
            }
            f9 f9Var2 = this.f28825c[i11];
            if (f9Var2 != null && (e9Var = f9Var2.f28352a) != null) {
                e9Var.u(i10);
            }
        }
    }

    public final void k(int i10) {
        this.f28834n = i10;
        View view = this.f28838r;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final void l(int i10, TLObject tLObject, int i11) {
        TLRPC.User user;
        TLRPC.Chat chat;
        f9[] f9VarArr = this.f28825c;
        f9 f9Var = f9VarArr[i10];
        f9Var.f28357g = 0L;
        f9Var.f28356f = null;
        if (tLObject == null) {
            f9Var.f28355e.setImageBitmap((Drawable) null);
            f();
            return;
        }
        f9Var.d = -1L;
        f9Var.h = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            f9Var.f28356f = groupCallParticipant;
            long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
            if (DialogObject.isUserDialog(peerId)) {
                user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
                f9VarArr[i10].f28352a.m(i11, user);
                chat = null;
            } else {
                TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
                f9VarArr[i10].f28352a.k(i11, chat2);
                chat = chat2;
                user = null;
            }
            if (this.f28831k == 4) {
                if (peerId == AccountInstance.getInstance(i11).getUserConfig().getClientUserId()) {
                    f9VarArr[i10].d = 0L;
                } else if (this.f28833m) {
                    f9VarArr[i10].d = groupCallParticipant.lastActiveDate;
                } else {
                    f9VarArr[i10].d = groupCallParticipant.active_date;
                }
            } else {
                f9VarArr[i10].d = groupCallParticipant.active_date;
            }
            f9VarArr[i10].f28357g = peerId;
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            if (user2.self && this.f28823a) {
                f9Var.f28352a.g(1);
                f9VarArr[i10].f28352a.f27964p = 0.6f;
            } else {
                f9Var.f28352a.g(0);
                e9 e9Var = f9VarArr[i10].f28352a;
                e9Var.f27964p = 1.0f;
                e9Var.m(i11, user2);
            }
            f9VarArr[i10].f28357g = user2.f22539id;
            user = user2;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            f9Var.f28352a.g(0);
            e9 e9Var2 = f9VarArr[i10].f28352a;
            e9Var2.f27964p = 1.0f;
            e9Var2.k(i11, chat);
            f9VarArr[i10].f28357g = -chat.f22392id;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int d = d();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            f9VarArr[i10].f28357g = storyItem.f22629id;
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50, true, null, false);
                f9VarArr[i10].f28355e.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.document.thumbs, 50, true, closestPhotoSizeWithSize, true), storyItem.media.document), com.google.android.recaptcha.internal.a.k(d, "_", d), ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.document), com.google.android.recaptcha.internal.a.k(d, "_", d), 0L, null, storyItem, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 50, true, null, false);
                    f9VarArr[i10].f28355e.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.photo.sizes, 50, true, closestPhotoSizeWithSize2, true), storyItem.media.photo), com.google.android.recaptcha.internal.a.k(d, "_", d), ImageLocation.getForPhoto(closestPhotoSizeWithSize2, storyItem.media.photo), com.google.android.recaptcha.internal.a.k(d, "_", d), 0L, null, storyItem, 0);
                }
            }
        } else if (user != null) {
            if (user.self && this.f28823a) {
                f9 f9Var2 = f9VarArr[i10];
                f9Var2.f28355e.setImageBitmap(f9Var2.f28352a);
            } else {
                f9 f9Var3 = f9VarArr[i10];
                f9Var3.f28355e.setForUserOrChat(user, f9Var3.f28352a);
            }
        } else {
            f9 f9Var4 = f9VarArr[i10];
            f9Var4.f28355e.setForUserOrChat(chat, f9Var4.f28352a);
        }
        f9VarArr[i10].f28355e.setRoundRadius(d / 2);
        float f9 = d;
        f9VarArr[i10].f28355e.setImageCoords(0.0f, 0.0f, f9, f9);
        f();
    }

    public final void m(int i10) {
        this.f28839s = i10;
    }

    public final void n() {
        for (int i10 = 0; i10 < 3; i10++) {
            f9[] f9VarArr = this.f28824b;
            f9 f9Var = f9VarArr[i10];
            f9[] f9VarArr2 = this.f28825c;
            f9VarArr[i10] = f9VarArr2[i10];
            f9VarArr2[i10] = f9Var;
        }
    }
}
