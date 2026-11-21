package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.oh0;
public final class q8 {
    public int[] A;
    public int[] B;
    public boolean C;
    public boolean D;
    public int E;
    public Path F;
    public Bitmap G;
    public int H;
    public long I;
    public long J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public float U;
    public float V;
    public float W;
    public float X;
    public float Y;
    public float Z;
    public final String f44866a;
    public float f44867a0;
    public TL_wallet.nftItem f44868b;
    public float f44869b0;
    public final fi.s2 f44870c;
    public float f44871c0;
    public final ImageReceiver d;
    public final r8 f44872d0;
    public final p8 f44873e;
    public final p8 f44874f;
    public final p8 f44875g;
    public final p8 h;
    public final p8 f44876i;
    public final p8 f44877j;
    public final p8 f44878k;
    public final p8 f44879l;
    public final p8 f44880m;
    public final p8 f44881n;
    public final p8 f44882o;
    public final p8 f44883p;
    public final p8 f44884q;
    public final p8 f44885r;
    public final p8[] f44886s;
    public final TL_stars.starGiftAttributeBackdrop f44887t;
    public Bitmap f44888u;
    public Bitmap v;
    public Bitmap f44889w;
    public Canvas f44890x;
    public int[] f44891y;
    public int[] f44892z;

    public q8(r8 r8Var, TL_wallet.nftItem nftitem) {
        org.telegram.ui.ActionBar.g2 g2Var = r8Var.f44923a;
        this.f44872d0 = r8Var;
        this.f44870c = new fi.s2(this, r8Var, 6);
        this.d = new ImageReceiver(r8Var.N);
        p8 p8Var = new p8(0.0f, 900.0f, 0.86f);
        this.f44873e = p8Var;
        p8 p8Var2 = new p8(0.0f, 900.0f, 0.86f);
        this.f44874f = p8Var2;
        p8 p8Var3 = new p8(1.0f, 420.0f, 0.78f);
        this.f44875g = p8Var3;
        p8 p8Var4 = new p8(1.0f, 700.0f, 0.9f);
        this.h = p8Var4;
        p8 p8Var5 = new p8(0.0f, 700.0f, 0.9f);
        this.f44876i = p8Var5;
        p8 p8Var6 = new p8(0.0f, 380.0f, 0.82f);
        this.f44877j = p8Var6;
        p8 p8Var7 = new p8(0.0f, 30.0f, 1.0f);
        this.f44878k = p8Var7;
        p8 p8Var8 = new p8(0.0f, 520.0f, 0.62f);
        this.f44879l = p8Var8;
        p8 p8Var9 = new p8(0.0f, 300.0f, 1.0f);
        this.f44880m = p8Var9;
        p8 p8Var10 = new p8(0.0f, 150.0f, 0.82f);
        this.f44881n = p8Var10;
        p8 p8Var11 = new p8(0.0f, 150.0f, 0.82f);
        this.f44882o = p8Var11;
        p8 p8Var12 = new p8(0.0f, 240.0f, 1.0f);
        this.f44883p = p8Var12;
        p8 p8Var13 = new p8(0.0f, 700.0f, 1.0f);
        this.f44884q = p8Var13;
        p8 p8Var14 = new p8(1.0f, 260.0f, 1.0f);
        this.f44885r = p8Var14;
        this.f44886s = new p8[]{p8Var, p8Var2, p8Var3, p8Var4, p8Var5, p8Var6, p8Var7, p8Var8, p8Var9, p8Var10, p8Var11, p8Var12, p8Var13, p8Var14};
        this.E = -2;
        this.V = 1.0f;
        this.f44871c0 = 1.0f;
        this.f44868b = nftitem;
        this.f44866a = nftitem.address;
        ArrayList<TL_stars.StarGiftAttribute> arrayList = nftitem.gift.attributes;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i7);
            i7++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributeBackdrop) {
                this.f44887t = (TL_stars.starGiftAttributeBackdrop) starGiftAttribute2;
            }
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                this.d.q0(fc.b(((TL_stars.starGiftAttributePattern) starGiftAttribute2).document), "60_60_firstframe", null, null, nftitem.gift, 1);
            }
        }
        h3 h3Var = new h3(this, 5);
        fi.s2 s2Var = this.f44870c;
        s2Var.f22667h1 = h3Var;
        this.d.f22667h1 = h3Var;
        s2Var.d = g2Var.getCurrentAccount();
        this.d.d = g2Var.getCurrentAccount();
        fi.s2 s2Var2 = this.f44870c;
        s2Var2.f22694v0 = false;
        s2Var2.W(1);
        this.f44870c.q0(fc.b(nftitem.gift.getDocument()), "120_120_nolimit", null, null, nftitem.gift, 1);
        if (r8Var.isAttachedToWindow()) {
            this.f44870c.P();
            this.d.P();
        }
    }

    public final Bitmap a() {
        int i7;
        r8 r8Var = this.f44872d0;
        RectF rectF = r8Var.F;
        fi.s2 s2Var = this.f44870c;
        Bitmap n10 = s2Var.n();
        if (n10 != null && !n10.isRecycled()) {
            oh0 B = s2Var.B();
            if (B == null) {
                i7 = 0;
            } else {
                i7 = B.f38213b0;
            }
            Bitmap bitmap = this.v;
            if (bitmap != null && this.G == n10 && this.E == i7) {
                return this.f44888u;
            }
            this.G = n10;
            this.E = i7;
            if (bitmap == null) {
                this.v = Bitmap.createBitmap(288, 288, Bitmap.Config.ARGB_8888);
                this.f44890x = new Canvas(this.v);
            }
            this.v.eraseColor(0);
            rectF.set(10.0f, 10.0f, 278.0f, 278.0f);
            this.f44890x.drawBitmap(n10, (Rect) null, rectF, r8Var.E);
            if (this.C) {
                this.D = true;
            } else {
                c();
            }
            return this.f44888u;
        }
        return this.f44888u;
    }

    public final boolean b() {
        int i7 = this.H;
        if (i7 == 2 || i7 == 1) {
            return true;
        }
        return false;
    }

    public final void c() {
        boolean z10;
        if (this.f44891y == null) {
            this.f44891y = new int[82944];
            this.f44892z = new int[82944];
            this.A = new int[82944];
            org.telegram.messenger.r5 r5Var = sa.f45067a;
            this.B = new int[288];
        }
        this.v.getPixels(this.f44891y, 0, 288, 0, 0, 288, 288);
        this.C = true;
        this.D = false;
        if (this.f44889w == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int[] iArr = this.f44891y;
        int[] iArr2 = this.f44892z;
        int[] iArr3 = this.A;
        ?? r82 = this.B;
        if (sa.f45067a == null) {
            sa.f45067a = new org.telegram.messenger.r5("walletStickerOutline", true);
        }
        sa.f45067a.postRunnable(new di.o3(this, iArr, iArr2, iArr3, (Serializable) r82, z10, 9));
    }
}
