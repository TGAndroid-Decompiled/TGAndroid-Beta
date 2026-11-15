package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ch0;
public final class b8 {
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
    public final String f43511a;
    public float f43512a0;
    public TL_wallet.nftItem f43513b;
    public float f43514b0;
    public final fi.u2 f43515c;
    public float f43516c0;
    public final ImageReceiver d;
    public final c8 f43517d0;
    public final a8 f43518e;
    public final a8 f43519f;
    public final a8 f43520g;
    public final a8 h;
    public final a8 f43521i;
    public final a8 f43522j;
    public final a8 f43523k;
    public final a8 f43524l;
    public final a8 f43525m;
    public final a8 f43526n;
    public final a8 f43527o;
    public final a8 f43528p;
    public final a8 f43529q;
    public final a8 f43530r;
    public final a8[] f43531s;
    public final TL_stars.starGiftAttributeBackdrop f43532t;
    public Bitmap f43533u;
    public Bitmap v;
    public Bitmap f43534w;
    public Canvas f43535x;
    public int[] f43536y;
    public int[] f43537z;

    public b8(c8 c8Var, TL_wallet.nftItem nftitem) {
        org.telegram.ui.ActionBar.e2 e2Var = c8Var.f43645a;
        this.f43517d0 = c8Var;
        this.f43515c = new fi.u2(this, c8Var, 6);
        this.d = new ImageReceiver(c8Var.N);
        a8 a8Var = new a8(0.0f, 900.0f, 0.86f);
        this.f43518e = a8Var;
        a8 a8Var2 = new a8(0.0f, 900.0f, 0.86f);
        this.f43519f = a8Var2;
        a8 a8Var3 = new a8(1.0f, 420.0f, 0.78f);
        this.f43520g = a8Var3;
        a8 a8Var4 = new a8(1.0f, 700.0f, 0.9f);
        this.h = a8Var4;
        a8 a8Var5 = new a8(0.0f, 700.0f, 0.9f);
        this.f43521i = a8Var5;
        a8 a8Var6 = new a8(0.0f, 380.0f, 0.82f);
        this.f43522j = a8Var6;
        a8 a8Var7 = new a8(0.0f, 30.0f, 1.0f);
        this.f43523k = a8Var7;
        a8 a8Var8 = new a8(0.0f, 520.0f, 0.62f);
        this.f43524l = a8Var8;
        a8 a8Var9 = new a8(0.0f, 300.0f, 1.0f);
        this.f43525m = a8Var9;
        a8 a8Var10 = new a8(0.0f, 150.0f, 0.82f);
        this.f43526n = a8Var10;
        a8 a8Var11 = new a8(0.0f, 150.0f, 0.82f);
        this.f43527o = a8Var11;
        a8 a8Var12 = new a8(0.0f, 240.0f, 1.0f);
        this.f43528p = a8Var12;
        a8 a8Var13 = new a8(0.0f, 700.0f, 1.0f);
        this.f43529q = a8Var13;
        a8 a8Var14 = new a8(1.0f, 260.0f, 1.0f);
        this.f43530r = a8Var14;
        this.f43531s = new a8[]{a8Var, a8Var2, a8Var3, a8Var4, a8Var5, a8Var6, a8Var7, a8Var8, a8Var9, a8Var10, a8Var11, a8Var12, a8Var13, a8Var14};
        this.E = -2;
        this.V = 1.0f;
        this.f43516c0 = 1.0f;
        this.f43513b = nftitem;
        this.f43511a = nftitem.address;
        ArrayList<TL_stars.StarGiftAttribute> arrayList = nftitem.gift.attributes;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i7);
            i7++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributeBackdrop) {
                this.f43532t = (TL_stars.starGiftAttributeBackdrop) starGiftAttribute2;
            }
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                this.d.q0(gc.b(((TL_stars.starGiftAttributePattern) starGiftAttribute2).document), "60_60_firstframe", null, null, nftitem.gift, 1);
            }
        }
        b3 b3Var = new b3(this, 5);
        fi.u2 u2Var = this.f43515c;
        u2Var.f22276h1 = b3Var;
        this.d.f22276h1 = b3Var;
        u2Var.d = e2Var.getCurrentAccount();
        this.d.d = e2Var.getCurrentAccount();
        fi.u2 u2Var2 = this.f43515c;
        u2Var2.f22303v0 = false;
        u2Var2.W(1);
        this.f43515c.q0(gc.b(nftitem.gift.getDocument()), "120_120_nolimit", null, null, nftitem.gift, 1);
        if (c8Var.isAttachedToWindow()) {
            this.f43515c.P();
            this.d.P();
        }
    }

    public final Bitmap a() {
        int i7;
        c8 c8Var = this.f43517d0;
        RectF rectF = c8Var.F;
        fi.u2 u2Var = this.f43515c;
        Bitmap n10 = u2Var.n();
        if (n10 != null && !n10.isRecycled()) {
            ch0 B = u2Var.B();
            if (B == null) {
                i7 = 0;
            } else {
                i7 = B.f33575b0;
            }
            Bitmap bitmap = this.v;
            if (bitmap != null && this.G == n10 && this.E == i7) {
                return this.f43533u;
            }
            this.G = n10;
            this.E = i7;
            if (bitmap == null) {
                this.v = Bitmap.createBitmap(288, 288, Bitmap.Config.ARGB_8888);
                this.f43535x = new Canvas(this.v);
            }
            this.v.eraseColor(0);
            rectF.set(10.0f, 10.0f, 278.0f, 278.0f);
            this.f43535x.drawBitmap(n10, (Rect) null, rectF, c8Var.E);
            if (this.C) {
                this.D = true;
            } else {
                c();
            }
            return this.f43533u;
        }
        return this.f43533u;
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
        if (this.f43536y == null) {
            this.f43536y = new int[82944];
            this.f43537z = new int[82944];
            this.A = new int[82944];
            org.telegram.messenger.q5 q5Var = ea.f43808a;
            this.B = new int[288];
        }
        this.v.getPixels(this.f43536y, 0, 288, 0, 0, 288, 288);
        this.C = true;
        this.D = false;
        if (this.f43534w == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int[] iArr = this.f43536y;
        int[] iArr2 = this.f43537z;
        int[] iArr3 = this.A;
        ?? r82 = this.B;
        if (ea.f43808a == null) {
            ea.f43808a = new org.telegram.messenger.q5("walletStickerOutline", true);
        }
        ea.f43808a.postRunnable(new di.m3(this, iArr, iArr2, iArr3, (Serializable) r82, z10, 9));
    }
}
