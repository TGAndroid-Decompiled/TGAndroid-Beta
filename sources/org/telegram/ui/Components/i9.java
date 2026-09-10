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
    public boolean f23935a;
    public boolean d;
    public ValueAnimator f23938f;
    public boolean f23939g;
    public Runnable f23941j;
    public int f23942k;
    public boolean f23943l;
    public final boolean f23944m;
    public int f23945n;
    public int f23946o;
    public int f23947p;
    public final View f23949r;
    public int f23950s;
    public boolean f23953w;
    public boolean f23954x;
    public zh.j5 f23955y;
    public final Random f23956z;
    public final h9[] f23936b = new h9[3];
    public final h9[] f23937c = new h9[3];
    public float e = 1.0f;
    public final Paint h = new Paint(1);
    public final Paint f23940i = new Paint(1);
    public int f23948q = AndroidUtilities.dp(1.67f);
    public float f23951t = 0.8f;
    public float f23952u = 1.0f;
    public long v = 220;

    public i9(View view, boolean z10) {
        wr wrVar = wr.f28819f;
        this.f23956z = new Random();
        this.f23949r = view;
        for (int i10 = 0; i10 < 3; i10++) {
            h9[] h9VarArr = this.f23936b;
            ?? obj = new Object();
            h9VarArr[i10] = obj;
            obj.e = new ImageReceiver(view);
            this.f23936b[i10].e.setInvalidateAll(true);
            this.f23936b[i10].e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.f23936b[i10].f23548a = new g9((org.telegram.ui.ActionBar.f6) null);
            this.f23936b[i10].f23548a.u(AndroidUtilities.dp(12.0f));
            h9[] h9VarArr2 = this.f23937c;
            ?? obj2 = new Object();
            h9VarArr2[i10] = obj2;
            obj2.e = new ImageReceiver(view);
            this.f23937c[i10].e.setInvalidateAll(true);
            this.f23937c[i10].e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.f23937c[i10].f23548a = new g9((org.telegram.ui.ActionBar.f6) null);
            this.f23937c[i10].f23548a.u(AndroidUtilities.dp(12.0f));
        }
        this.f23944m = z10;
        this.f23940i.setColor(0);
        this.f23940i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
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
                h9VarArr = this.f23936b;
                h9VarArr2 = this.f23937c;
                if (i10 >= 3) {
                    break;
                }
                h9VarArr3[i10] = h9VarArr[i10];
                h9 h9Var = h9VarArr[i10];
                long j3 = h9Var.f23552g;
                h9 h9Var2 = h9VarArr2[i10];
                if (j3 != h9Var2.f23552g) {
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
                        if (h9VarArr[i12].f23552g == h9VarArr2[i11].f23552g) {
                            h9VarArr3[i12] = null;
                            if (i11 == i12) {
                                h9 h9Var3 = h9VarArr2[i11];
                                h9Var3.f23553i = -1;
                                org.telegram.ui.Cells.b4 b4Var = h9Var3.f23549b;
                                h9 h9Var4 = h9VarArr[i11];
                                h9Var3.f23549b = h9Var4.f23549b;
                                h9Var4.f23549b = b4Var;
                            } else {
                                h9 h9Var5 = h9VarArr2[i11];
                                h9Var5.f23553i = 2;
                                h9Var5.f23554j = i12;
                            }
                        } else {
                            i12++;
                        }
                    } else {
                        h9VarArr2[i11].f23553i = 0;
                        break;
                    }
                }
            }
            for (int i13 = 0; i13 < 3; i13++) {
                h9 h9Var6 = h9VarArr3[i13];
                if (h9Var6 != null) {
                    h9Var6.f23553i = 1;
                }
            }
            ValueAnimator valueAnimator = this.f23938f;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f23938f.cancel();
                if (this.f23953w) {
                    n();
                    this.f23953w = false;
                }
            }
            this.e = 0.0f;
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f23938f = ofFloat;
                ofFloat.addUpdateListener(new j6(this, 4));
                this.f23938f.addListener(new org.telegram.ui.Cells.v5(this, 21));
                this.f23938f.setDuration(this.v);
                this.f23938f.setInterpolator(wr.f28819f);
                this.f23938f.start();
            } else {
                this.f23953w = true;
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
        int i10 = this.f23950s;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f23942k;
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
        int i10 = this.f23942k;
        int i11 = 0;
        if (i10 != 4 && i10 != 10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i10 == 11) {
            dp = AndroidUtilities.dp(12.0f);
        } else {
            int i12 = this.f23950s;
            if (i12 != 0) {
                dp = (int) (i12 * this.f23951t);
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
            if (this.f23936b[i14].f23552g != 0) {
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
        View view = this.f23949r;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void g() {
        if (!this.B) {
            this.B = true;
            for (int i10 = 0; i10 < 3; i10++) {
                this.f23936b[i10].e.onAttachedToWindow();
                this.f23937c[i10].e.onAttachedToWindow();
            }
        }
    }

    public final void h() {
        if (this.B) {
            this.B = false;
            this.d = false;
            for (int i10 = 0; i10 < 3; i10++) {
                this.f23936b[i10].e.onDetachedFromWindow();
                this.f23937c[i10].e.onDetachedFromWindow();
            }
            if (this.f23942k == 3) {
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
            h9 h9Var = this.f23936b[i11];
            if (h9Var != null && (g9Var2 = h9Var.f23548a) != null) {
                g9Var2.u(i10);
            }
            h9 h9Var2 = this.f23937c[i11];
            if (h9Var2 != null && (g9Var = h9Var2.f23548a) != null) {
                g9Var.u(i10);
            }
        }
    }

    public final void k(int i10) {
        this.f23945n = i10;
        View view = this.f23949r;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final void l(int i10, TLObject tLObject, int i11) {
        TLRPC.User user;
        TLRPC.Chat chat;
        h9[] h9VarArr = this.f23937c;
        h9 h9Var = h9VarArr[i10];
        h9Var.f23552g = 0L;
        h9Var.f23551f = null;
        if (tLObject == null) {
            h9Var.e.setImageBitmap((Drawable) null);
            f();
            return;
        }
        h9Var.d = -1L;
        h9Var.h = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            h9Var.f23551f = groupCallParticipant;
            long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
            if (DialogObject.isUserDialog(peerId)) {
                user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
                h9VarArr[i10].f23548a.m(i11, user);
                chat = null;
            } else {
                TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
                h9VarArr[i10].f23548a.k(i11, chat2);
                chat = chat2;
                user = null;
            }
            if (this.f23942k == 4) {
                if (peerId == AccountInstance.getInstance(i11).getUserConfig().getClientUserId()) {
                    h9VarArr[i10].d = 0L;
                } else if (this.f23944m) {
                    h9VarArr[i10].d = groupCallParticipant.lastActiveDate;
                } else {
                    h9VarArr[i10].d = groupCallParticipant.active_date;
                }
            } else {
                h9VarArr[i10].d = groupCallParticipant.active_date;
            }
            h9VarArr[i10].f23552g = peerId;
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            if (user2.self && this.f23935a) {
                h9Var.f23548a.g(1);
                h9VarArr[i10].f23548a.f23286p = 0.6f;
            } else {
                h9Var.f23548a.g(0);
                g9 g9Var = h9VarArr[i10].f23548a;
                g9Var.f23286p = 1.0f;
                g9Var.m(i11, user2);
            }
            h9VarArr[i10].f23552g = user2.f17342id;
            user = user2;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            h9Var.f23548a.g(0);
            g9 g9Var2 = h9VarArr[i10].f23548a;
            g9Var2.f23286p = 1.0f;
            g9Var2.k(i11, chat);
            h9VarArr[i10].f23552g = -chat.f17195id;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int d = d();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            h9VarArr[i10].f23552g = storyItem.f17435id;
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
            if (user.self && this.f23935a) {
                h9 h9Var2 = h9VarArr[i10];
                h9Var2.e.setImageBitmap(h9Var2.f23548a);
            } else {
                h9 h9Var3 = h9VarArr[i10];
                h9Var3.e.setForUserOrChat(user, h9Var3.f23548a);
            }
        } else {
            h9 h9Var4 = h9VarArr[i10];
            h9Var4.e.setForUserOrChat(chat, h9Var4.f23548a);
        }
        h9VarArr[i10].e.setRoundRadius(d / 2);
        float f7 = d;
        h9VarArr[i10].e.setImageCoords(0.0f, 0.0f, f7, f7);
        f();
    }

    public final void m(int i10) {
        this.f23950s = i10;
    }

    public final void n() {
        for (int i10 = 0; i10 < 3; i10++) {
            h9[] h9VarArr = this.f23936b;
            h9 h9Var = h9VarArr[i10];
            h9[] h9VarArr2 = this.f23937c;
            h9VarArr[i10] = h9VarArr2[i10];
            h9VarArr2[i10] = h9Var;
        }
    }
}
