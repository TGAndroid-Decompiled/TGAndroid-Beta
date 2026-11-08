package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.zg0;
public final class a8 {
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
    public final String f42123a;
    public float f42124a0;
    public TL_wallet.nftItem f42125b;
    public float f42126b0;
    public final di.z2 f42127c;
    public float f42128c0;
    public final ImageReceiver d;
    public final b8 f42129d0;
    public final z7 f42130e;
    public final z7 f42131f;
    public final z7 f42132g;
    public final z7 h;
    public final z7 f42133i;
    public final z7 f42134j;
    public final z7 f42135k;
    public final z7 f42136l;
    public final z7 f42137m;
    public final z7 f42138n;
    public final z7 f42139o;
    public final z7 f42140p;
    public final z7 f42141q;
    public final z7 f42142r;
    public final z7[] f42143s;
    public final TL_stars.starGiftAttributeBackdrop f42144t;
    public Bitmap f42145u;
    public Bitmap v;
    public Bitmap f42146w;
    public Canvas f42147x;
    public int[] f42148y;
    public int[] f42149z;

    public a8(b8 b8Var, TL_wallet.nftItem nftitem) {
        org.telegram.ui.ActionBar.f2 f2Var = b8Var.f42216a;
        this.f42129d0 = b8Var;
        this.f42127c = new di.z2(this, b8Var, 6);
        this.d = new ImageReceiver(b8Var.M);
        z7 z7Var = new z7(0.0f, 900.0f, 0.86f);
        this.f42130e = z7Var;
        z7 z7Var2 = new z7(0.0f, 900.0f, 0.86f);
        this.f42131f = z7Var2;
        z7 z7Var3 = new z7(1.0f, 420.0f, 0.78f);
        this.f42132g = z7Var3;
        z7 z7Var4 = new z7(1.0f, 700.0f, 0.9f);
        this.h = z7Var4;
        z7 z7Var5 = new z7(0.0f, 700.0f, 0.9f);
        this.f42133i = z7Var5;
        z7 z7Var6 = new z7(0.0f, 380.0f, 0.82f);
        this.f42134j = z7Var6;
        z7 z7Var7 = new z7(0.0f, 30.0f, 1.0f);
        this.f42135k = z7Var7;
        z7 z7Var8 = new z7(0.0f, 520.0f, 0.62f);
        this.f42136l = z7Var8;
        z7 z7Var9 = new z7(0.0f, 300.0f, 1.0f);
        this.f42137m = z7Var9;
        z7 z7Var10 = new z7(0.0f, 150.0f, 0.82f);
        this.f42138n = z7Var10;
        z7 z7Var11 = new z7(0.0f, 150.0f, 0.82f);
        this.f42139o = z7Var11;
        z7 z7Var12 = new z7(0.0f, 240.0f, 1.0f);
        this.f42140p = z7Var12;
        z7 z7Var13 = new z7(0.0f, 700.0f, 1.0f);
        this.f42141q = z7Var13;
        z7 z7Var14 = new z7(1.0f, 260.0f, 1.0f);
        this.f42142r = z7Var14;
        this.f42143s = new z7[]{z7Var, z7Var2, z7Var3, z7Var4, z7Var5, z7Var6, z7Var7, z7Var8, z7Var9, z7Var10, z7Var11, z7Var12, z7Var13, z7Var14};
        this.E = -2;
        this.V = 1.0f;
        this.f42128c0 = 1.0f;
        this.f42125b = nftitem;
        this.f42123a = nftitem.address;
        ArrayList<TL_stars.StarGiftAttribute> arrayList = nftitem.gift.attributes;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i7);
            i7++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributeBackdrop) {
                this.f42144t = (TL_stars.starGiftAttributeBackdrop) starGiftAttribute2;
            }
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                this.d.q0(hc.b(((TL_stars.starGiftAttributePattern) starGiftAttribute2).document), "60_60_firstframe", null, null, nftitem.gift, 1);
            }
        }
        d3 d3Var = new d3(this, 5);
        di.z2 z2Var = this.f42127c;
        z2Var.f21195g1 = d3Var;
        this.d.f21195g1 = d3Var;
        z2Var.d = f2Var.getCurrentAccount();
        this.d.d = f2Var.getCurrentAccount();
        di.z2 z2Var2 = this.f42127c;
        z2Var2.f21222u0 = false;
        z2Var2.W(1);
        this.f42127c.q0(hc.b(nftitem.gift.getDocument()), "120_120_nolimit", null, null, nftitem.gift, 1);
        if (b8Var.isAttachedToWindow()) {
            this.f42127c.P();
            this.d.P();
        }
    }

    public final Bitmap a() {
        int i7;
        b8 b8Var = this.f42129d0;
        RectF rectF = b8Var.E;
        di.z2 z2Var = this.f42127c;
        Bitmap n10 = z2Var.n();
        if (n10 != null && !n10.isRecycled()) {
            zg0 B = z2Var.B();
            if (B == null) {
                i7 = 0;
            } else {
                i7 = B.f40989a0;
            }
            Bitmap bitmap = this.v;
            if (bitmap != null && this.G == n10 && this.E == i7) {
                return this.f42145u;
            }
            this.G = n10;
            this.E = i7;
            if (bitmap == null) {
                this.v = Bitmap.createBitmap(288, 288, Bitmap.Config.ARGB_8888);
                this.f42147x = new Canvas(this.v);
            }
            this.v.eraseColor(0);
            rectF.set(10.0f, 10.0f, 278.0f, 278.0f);
            this.f42147x.drawBitmap(n10, (Rect) null, rectF, b8Var.D);
            if (this.C) {
                this.D = true;
            } else {
                c();
            }
            return this.f42145u;
        }
        return this.f42145u;
    }

    public final boolean b() {
        int i7 = this.H;
        if (i7 == 2 || i7 == 1) {
            return true;
        }
        return false;
    }

    public final void c() {
        boolean z9;
        if (this.f42148y == null) {
            this.f42148y = new int[82944];
            this.f42149z = new int[82944];
            this.A = new int[82944];
            org.telegram.messenger.q5 q5Var = ba.f42279a;
            this.B = new int[288];
        }
        this.v.getPixels(this.f42148y, 0, 288, 0, 0, 288, 288);
        this.C = true;
        this.D = false;
        if (this.f42146w == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        int[] iArr = this.f42148y;
        int[] iArr2 = this.f42149z;
        int[] iArr3 = this.A;
        ?? r82 = this.B;
        if (ba.f42279a == null) {
            ba.f42279a = new org.telegram.messenger.q5("walletStickerOutline", true);
        }
        ba.f42279a.postRunnable(new bi.l4(this, iArr, iArr2, iArr3, (Serializable) r82, z9, 9));
    }
}
