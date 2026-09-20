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
    public boolean f24946a;
    public boolean d;
    public ValueAnimator f24949f;
    public boolean f24950g;
    public Runnable f24952j;
    public int f24953k;
    public boolean f24954l;
    public final boolean f24955m;
    public int f24956n;
    public int f24957o;
    public int f24958p;
    public final View f24960r;
    public int f24961s;
    public boolean f24964w;
    public boolean f24965x;
    public ai.m9 f24966y;
    public final Random f24967z;
    public final h9[] f24947b = new h9[3];
    public final h9[] f24948c = new h9[3];
    public float e = 1.0f;
    public final Paint h = new Paint(1);
    public final Paint f24951i = new Paint(1);
    public int f24959q = AndroidUtilities.dp(1.67f);
    public float f24962t = 0.8f;
    public float f24963u = 1.0f;
    public long v = 220;

    public i9(View view, boolean z10) {
        qr qrVar = qr.f27642f;
        this.f24967z = new Random();
        this.f24960r = view;
        for (int i10 = 0; i10 < 3; i10++) {
            h9[] h9VarArr = this.f24947b;
            ?? obj = new Object();
            h9VarArr[i10] = obj;
            obj.e = new ImageReceiver(view);
            this.f24947b[i10].e.setInvalidateAll(true);
            this.f24947b[i10].e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.f24947b[i10].f24572a = new g9((org.telegram.ui.ActionBar.f6) null);
            this.f24947b[i10].f24572a.u(AndroidUtilities.dp(12.0f));
            h9[] h9VarArr2 = this.f24948c;
            ?? obj2 = new Object();
            h9VarArr2[i10] = obj2;
            obj2.e = new ImageReceiver(view);
            this.f24948c[i10].e.setInvalidateAll(true);
            this.f24948c[i10].e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.f24948c[i10].f24572a = new g9((org.telegram.ui.ActionBar.f6) null);
            this.f24948c[i10].f24572a.u(AndroidUtilities.dp(12.0f));
        }
        this.f24955m = z10;
        this.f24951i.setColor(0);
        this.f24951i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
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
                h9VarArr = this.f24947b;
                h9VarArr2 = this.f24948c;
                if (i10 >= 3) {
                    break;
                }
                h9VarArr3[i10] = h9VarArr[i10];
                h9 h9Var = h9VarArr[i10];
                long j3 = h9Var.f24576g;
                h9 h9Var2 = h9VarArr2[i10];
                if (j3 != h9Var2.f24576g) {
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
                        if (h9VarArr[i12].f24576g == h9VarArr2[i11].f24576g) {
                            h9VarArr3[i12] = null;
                            if (i11 == i12) {
                                h9 h9Var3 = h9VarArr2[i11];
                                h9Var3.f24577i = -1;
                                org.telegram.ui.Cells.d4 d4Var = h9Var3.f24573b;
                                h9 h9Var4 = h9VarArr[i11];
                                h9Var3.f24573b = h9Var4.f24573b;
                                h9Var4.f24573b = d4Var;
                            } else {
                                h9 h9Var5 = h9VarArr2[i11];
                                h9Var5.f24577i = 2;
                                h9Var5.f24578j = i12;
                            }
                        } else {
                            i12++;
                        }
                    } else {
                        h9VarArr2[i11].f24577i = 0;
                        break;
                    }
                }
            }
            for (int i13 = 0; i13 < 3; i13++) {
                h9 h9Var6 = h9VarArr3[i13];
                if (h9Var6 != null) {
                    h9Var6.f24577i = 1;
                }
            }
            ValueAnimator valueAnimator = this.f24949f;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f24949f.cancel();
                if (this.f24964w) {
                    n();
                    this.f24964w = false;
                }
            }
            this.e = 0.0f;
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f24949f = ofFloat;
                ofFloat.addUpdateListener(new j6(this, 4));
                this.f24949f.addListener(new q8(this, 1));
                this.f24949f.setDuration(this.v);
                this.f24949f.setInterpolator(qr.f27642f);
                this.f24949f.start();
            } else {
                this.f24964w = true;
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
        int i10 = this.f24961s;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f24953k;
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
        int i10 = this.f24953k;
        int i11 = 0;
        if (i10 != 4 && i10 != 10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i10 == 11) {
            dp = AndroidUtilities.dp(12.0f);
        } else {
            int i12 = this.f24961s;
            if (i12 != 0) {
                dp = (int) (i12 * this.f24962t);
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
            if (this.f24947b[i14].f24576g != 0) {
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
        View view = this.f24960r;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void g() {
        if (!this.B) {
            this.B = true;
            for (int i10 = 0; i10 < 3; i10++) {
                this.f24947b[i10].e.onAttachedToWindow();
                this.f24948c[i10].e.onAttachedToWindow();
            }
        }
    }

    public final void h() {
        if (this.B) {
            this.B = false;
            this.d = false;
            for (int i10 = 0; i10 < 3; i10++) {
                this.f24947b[i10].e.onDetachedFromWindow();
                this.f24948c[i10].e.onDetachedFromWindow();
            }
            if (this.f24953k == 3) {
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
            h9 h9Var = this.f24947b[i11];
            if (h9Var != null && (g9Var2 = h9Var.f24572a) != null) {
                g9Var2.u(i10);
            }
            h9 h9Var2 = this.f24948c[i11];
            if (h9Var2 != null && (g9Var = h9Var2.f24572a) != null) {
                g9Var.u(i10);
            }
        }
    }

    public final void k(int i10) {
        this.f24956n = i10;
        View view = this.f24960r;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final void l(int i10, TLObject tLObject, int i11) {
        TLRPC.User user;
        TLRPC.Chat chat;
        h9[] h9VarArr = this.f24948c;
        h9 h9Var = h9VarArr[i10];
        h9Var.f24576g = 0L;
        h9Var.f24575f = null;
        if (tLObject == null) {
            h9Var.e.setImageBitmap((Drawable) null);
            f();
            return;
        }
        h9Var.d = -1L;
        h9Var.h = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            h9Var.f24575f = groupCallParticipant;
            long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
            if (DialogObject.isUserDialog(peerId)) {
                user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
                h9VarArr[i10].f24572a.m(i11, user);
                chat = null;
            } else {
                TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
                h9VarArr[i10].f24572a.k(i11, chat2);
                chat = chat2;
                user = null;
            }
            if (this.f24953k == 4) {
                if (peerId == AccountInstance.getInstance(i11).getUserConfig().getClientUserId()) {
                    h9VarArr[i10].d = 0L;
                } else if (this.f24955m) {
                    h9VarArr[i10].d = groupCallParticipant.lastActiveDate;
                } else {
                    h9VarArr[i10].d = groupCallParticipant.active_date;
                }
            } else {
                h9VarArr[i10].d = groupCallParticipant.active_date;
            }
            h9VarArr[i10].f24576g = peerId;
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            if (user2.self && this.f24946a) {
                h9Var.f24572a.g(1);
                h9VarArr[i10].f24572a.f24302p = 0.6f;
            } else {
                h9Var.f24572a.g(0);
                g9 g9Var = h9VarArr[i10].f24572a;
                g9Var.f24302p = 1.0f;
                g9Var.m(i11, user2);
            }
            h9VarArr[i10].f24576g = user2.f18475id;
            user = user2;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            h9Var.f24572a.g(0);
            g9 g9Var2 = h9VarArr[i10].f24572a;
            g9Var2.f24302p = 1.0f;
            g9Var2.k(i11, chat);
            h9VarArr[i10].f24576g = -chat.f18328id;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int d = d();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            h9VarArr[i10].f24576g = storyItem.f18563id;
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
            if (user.self && this.f24946a) {
                h9 h9Var2 = h9VarArr[i10];
                h9Var2.e.setImageBitmap(h9Var2.f24572a);
            } else {
                h9 h9Var3 = h9VarArr[i10];
                h9Var3.e.setForUserOrChat(user, h9Var3.f24572a);
            }
        } else {
            h9 h9Var4 = h9VarArr[i10];
            h9Var4.e.setForUserOrChat(chat, h9Var4.f24572a);
        }
        h9VarArr[i10].e.setRoundRadius(d / 2);
        float f7 = d;
        h9VarArr[i10].e.setImageCoords(0.0f, 0.0f, f7, f7);
        f();
    }

    public final void m(int i10) {
        this.f24961s = i10;
    }

    public final void n() {
        for (int i10 = 0; i10 < 3; i10++) {
            h9[] h9VarArr = this.f24947b;
            h9 h9Var = h9VarArr[i10];
            h9[] h9VarArr2 = this.f24948c;
            h9VarArr[i10] = h9VarArr2[i10];
            h9VarArr2[i10] = h9Var;
        }
    }
}
