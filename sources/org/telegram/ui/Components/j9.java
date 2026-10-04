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
public final class j9 {
    public float A;
    public boolean B;
    public boolean f27661a;
    public boolean d;
    public ValueAnimator f27665f;
    public boolean f27666g;
    public Runnable f27668j;
    public int f27669k;
    public boolean f27670l;
    public final boolean f27671m;
    public int f27672n;
    public int f27673o;
    public int f27674p;
    public final View f27676r;
    public int f27677s;
    public boolean f27680w;
    public boolean f27681x;
    public ai.m9 f27682y;
    public final Random f27683z;
    public final i9[] f27662b = new i9[3];
    public final i9[] f27663c = new i9[3];
    public float f27664e = 1.0f;
    public final Paint h = new Paint(1);
    public final Paint f27667i = new Paint(1);
    public int f27675q = AndroidUtilities.dp(1.67f);
    public float f27678t = 0.8f;
    public float f27679u = 1.0f;
    public long v = 220;

    public j9(View view, boolean z10) {
        tr trVar = tr.f31141f;
        this.f27683z = new Random();
        this.f27676r = view;
        for (int i10 = 0; i10 < 3; i10++) {
            i9[] i9VarArr = this.f27662b;
            ?? obj = new Object();
            i9VarArr[i10] = obj;
            obj.f27337e = new ImageReceiver(view);
            this.f27662b[i10].f27337e.setInvalidateAll(true);
            this.f27662b[i10].f27337e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.f27662b[i10].f27334a = new h9((org.telegram.ui.ActionBar.d6) null);
            this.f27662b[i10].f27334a.u(AndroidUtilities.dp(12.0f));
            i9[] i9VarArr2 = this.f27663c;
            ?? obj2 = new Object();
            i9VarArr2[i10] = obj2;
            obj2.f27337e = new ImageReceiver(view);
            this.f27663c[i10].f27337e.setInvalidateAll(true);
            this.f27663c[i10].f27337e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.f27663c[i10].f27334a = new h9((org.telegram.ui.ActionBar.d6) null);
            this.f27663c[i10].f27334a.u(AndroidUtilities.dp(12.0f));
        }
        this.f27671m = z10;
        this.f27667i.setColor(0);
        this.f27667i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a() {
        b(false, true);
    }

    public final void b(boolean z10, boolean z11) {
        i9[] i9VarArr;
        i9[] i9VarArr2;
        if (this.d && z10) {
            i9[] i9VarArr3 = new i9[3];
            int i10 = 0;
            boolean z12 = false;
            while (true) {
                i9VarArr = this.f27662b;
                i9VarArr2 = this.f27663c;
                if (i10 >= 3) {
                    break;
                }
                i9VarArr3[i10] = i9VarArr[i10];
                i9 i9Var = i9VarArr[i10];
                long j3 = i9Var.f27339g;
                i9 i9Var2 = i9VarArr2[i10];
                if (j3 != i9Var2.f27339g) {
                    z12 = true;
                } else {
                    i9Var.d = i9Var2.d;
                }
                i10++;
            }
            if (!z12) {
                this.f27664e = 1.0f;
                return;
            }
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = 0;
                while (true) {
                    if (i12 < 3) {
                        if (i9VarArr[i12].f27339g == i9VarArr2[i11].f27339g) {
                            i9VarArr3[i12] = null;
                            if (i11 == i12) {
                                i9 i9Var3 = i9VarArr2[i11];
                                i9Var3.f27340i = -1;
                                org.telegram.ui.Cells.c4 c4Var = i9Var3.f27335b;
                                i9 i9Var4 = i9VarArr[i11];
                                i9Var3.f27335b = i9Var4.f27335b;
                                i9Var4.f27335b = c4Var;
                            } else {
                                i9 i9Var5 = i9VarArr2[i11];
                                i9Var5.f27340i = 2;
                                i9Var5.f27341j = i12;
                            }
                        } else {
                            i12++;
                        }
                    } else {
                        i9VarArr2[i11].f27340i = 0;
                        break;
                    }
                }
            }
            for (int i13 = 0; i13 < 3; i13++) {
                i9 i9Var6 = i9VarArr3[i13];
                if (i9Var6 != null) {
                    i9Var6.f27340i = 1;
                }
            }
            ValueAnimator valueAnimator = this.f27665f;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f27665f.cancel();
                if (this.f27680w) {
                    n();
                    this.f27680w = false;
                }
            }
            this.f27664e = 0.0f;
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f27665f = ofFloat;
                ofFloat.addUpdateListener(new k6(this, 4));
                this.f27665f.addListener(new r8(this, 1));
                this.f27665f.setDuration(this.v);
                this.f27665f.setInterpolator(tr.f31141f);
                this.f27665f.start();
            } else {
                this.f27680w = true;
            }
            f();
            return;
        }
        this.f27664e = 1.0f;
        n();
    }

    public final float c() {
        return this.A;
    }

    public final int d() {
        float f7;
        int i10 = this.f27677s;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f27669k;
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
        int i10 = this.f27669k;
        int i11 = 0;
        if (i10 != 4 && i10 != 10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i10 == 11) {
            dp = AndroidUtilities.dp(12.0f);
        } else {
            int i12 = this.f27677s;
            if (i12 != 0) {
                dp = (int) (i12 * this.f27678t);
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
            if (this.f27662b[i14].f27339g != 0) {
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
        View view = this.f27676r;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void g() {
        if (!this.B) {
            this.B = true;
            for (int i10 = 0; i10 < 3; i10++) {
                this.f27662b[i10].f27337e.onAttachedToWindow();
                this.f27663c[i10].f27337e.onAttachedToWindow();
            }
        }
    }

    public final void h() {
        if (this.B) {
            this.B = false;
            this.d = false;
            for (int i10 = 0; i10 < 3; i10++) {
                this.f27662b[i10].f27337e.onDetachedFromWindow();
                this.f27663c[i10].f27337e.onDetachedFromWindow();
            }
            if (this.f27669k == 3) {
                org.telegram.ui.ActionBar.i6.D0().a(0.0f);
            }
        }
    }

    public final void i(android.graphics.Canvas r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j9.i(android.graphics.Canvas):void");
    }

    public final void j(int i10) {
        h9 h9Var;
        h9 h9Var2;
        for (int i11 = 0; i11 < 3; i11++) {
            i9 i9Var = this.f27662b[i11];
            if (i9Var != null && (h9Var2 = i9Var.f27334a) != null) {
                h9Var2.u(i10);
            }
            i9 i9Var2 = this.f27663c[i11];
            if (i9Var2 != null && (h9Var = i9Var2.f27334a) != null) {
                h9Var.u(i10);
            }
        }
    }

    public final void k(int i10) {
        this.f27672n = i10;
        View view = this.f27676r;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final void l(int i10, TLObject tLObject, int i11) {
        TLRPC.User user;
        TLRPC.Chat chat;
        i9[] i9VarArr = this.f27663c;
        i9 i9Var = i9VarArr[i10];
        i9Var.f27339g = 0L;
        i9Var.f27338f = null;
        if (tLObject == null) {
            i9Var.f27337e.setImageBitmap((Drawable) null);
            f();
            return;
        }
        i9Var.d = -1L;
        i9Var.h = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            i9Var.f27338f = groupCallParticipant;
            long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
            if (DialogObject.isUserDialog(peerId)) {
                user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
                i9VarArr[i10].f27334a.m(i11, user);
                chat = null;
            } else {
                TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
                i9VarArr[i10].f27334a.k(i11, chat2);
                chat = chat2;
                user = null;
            }
            if (this.f27669k == 4) {
                if (peerId == AccountInstance.getInstance(i11).getUserConfig().getClientUserId()) {
                    i9VarArr[i10].d = 0L;
                } else if (this.f27671m) {
                    i9VarArr[i10].d = groupCallParticipant.lastActiveDate;
                } else {
                    i9VarArr[i10].d = groupCallParticipant.active_date;
                }
            } else {
                i9VarArr[i10].d = groupCallParticipant.active_date;
            }
            i9VarArr[i10].f27339g = peerId;
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            if (user2.self && this.f27661a) {
                i9Var.f27334a.g(1);
                i9VarArr[i10].f27334a.f27057p = 0.6f;
            } else {
                i9Var.f27334a.g(0);
                h9 h9Var = i9VarArr[i10].f27334a;
                h9Var.f27057p = 1.0f;
                h9Var.m(i11, user2);
            }
            i9VarArr[i10].f27339g = user2.f20185id;
            user = user2;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            i9Var.f27334a.g(0);
            h9 h9Var2 = i9VarArr[i10].f27334a;
            h9Var2.f27057p = 1.0f;
            h9Var2.k(i11, chat);
            i9VarArr[i10].f27339g = -chat.f20038id;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int d = d();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            i9VarArr[i10].f27339g = storyItem.f20275id;
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50, true, null, false);
                i9VarArr[i10].f27337e.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.document.thumbs, 50, true, closestPhotoSizeWithSize, true), storyItem.media.document), a4.a.k(d, d, "_"), ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.document), a4.a.k(d, d, "_"), 0L, null, storyItem, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 50, true, null, false);
                    i9VarArr[i10].f27337e.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.photo.sizes, 50, true, closestPhotoSizeWithSize2, true), storyItem.media.photo), a4.a.k(d, d, "_"), ImageLocation.getForPhoto(closestPhotoSizeWithSize2, storyItem.media.photo), a4.a.k(d, d, "_"), 0L, null, storyItem, 0);
                }
            }
        } else if (user != null) {
            if (user.self && this.f27661a) {
                i9 i9Var2 = i9VarArr[i10];
                i9Var2.f27337e.setImageBitmap(i9Var2.f27334a);
            } else {
                i9 i9Var3 = i9VarArr[i10];
                i9Var3.f27337e.setForUserOrChat(user, i9Var3.f27334a);
            }
        } else {
            i9 i9Var4 = i9VarArr[i10];
            i9Var4.f27337e.setForUserOrChat(chat, i9Var4.f27334a);
        }
        i9VarArr[i10].f27337e.setRoundRadius(d / 2);
        float f7 = d;
        i9VarArr[i10].f27337e.setImageCoords(0.0f, 0.0f, f7, f7);
        f();
    }

    public final void m(int i10) {
        this.f27677s = i10;
    }

    public final void n() {
        for (int i10 = 0; i10 < 3; i10++) {
            i9[] i9VarArr = this.f27662b;
            i9 i9Var = i9VarArr[i10];
            i9[] i9VarArr2 = this.f27663c;
            i9VarArr[i10] = i9VarArr2[i10];
            i9VarArr2[i10] = i9Var;
        }
    }
}
