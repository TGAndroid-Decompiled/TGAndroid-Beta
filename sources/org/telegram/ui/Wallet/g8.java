package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ic;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.bi0;
public final class g8 {
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
    public final String f34576a;
    public float f34577a0;
    public TL_wallet.nftItem f34578b;
    public float f34579b0;
    public final ag.c2 f34580c;
    public float f34581c0;
    public final ImageReceiver d;
    public final h8 f34582d0;
    public final f8 e;
    public final f8 f34583f;
    public final f8 f34584g;
    public final f8 h;
    public final f8 f34585i;
    public final f8 f34586j;
    public final f8 f34587k;
    public final f8 f34588l;
    public final f8 f34589m;
    public final f8 f34590n;
    public final f8 f34591o;
    public final f8 f34592p;
    public final f8 f34593q;
    public final f8 f34594r;
    public final f8[] f34595s;
    public final TL_stars.starGiftAttributeBackdrop f34596t;
    public Bitmap f34597u;
    public Bitmap v;
    public Bitmap f34598w;
    public Canvas f34599x;
    public int[] f34600y;
    public int[] f34601z;

    public g8(h8 h8Var, TL_wallet.nftItem nftitem) {
        org.telegram.ui.ActionBar.k2 k2Var = h8Var.f34626a;
        this.f34582d0 = h8Var;
        this.f34580c = new ag.c2(5, h8Var, this);
        this.d = new ImageReceiver(h8Var.M);
        f8 f8Var = new f8(0.0f, 900.0f, 0.86f);
        this.e = f8Var;
        f8 f8Var2 = new f8(0.0f, 900.0f, 0.86f);
        this.f34583f = f8Var2;
        f8 f8Var3 = new f8(1.0f, 420.0f, 0.78f);
        this.f34584g = f8Var3;
        f8 f8Var4 = new f8(1.0f, 700.0f, 0.9f);
        this.h = f8Var4;
        f8 f8Var5 = new f8(0.0f, 700.0f, 0.9f);
        this.f34585i = f8Var5;
        f8 f8Var6 = new f8(0.0f, 380.0f, 0.82f);
        this.f34586j = f8Var6;
        f8 f8Var7 = new f8(0.0f, 30.0f, 1.0f);
        this.f34587k = f8Var7;
        f8 f8Var8 = new f8(0.0f, 520.0f, 0.62f);
        this.f34588l = f8Var8;
        f8 f8Var9 = new f8(0.0f, 300.0f, 1.0f);
        this.f34589m = f8Var9;
        f8 f8Var10 = new f8(0.0f, 150.0f, 0.82f);
        this.f34590n = f8Var10;
        f8 f8Var11 = new f8(0.0f, 150.0f, 0.82f);
        this.f34591o = f8Var11;
        f8 f8Var12 = new f8(0.0f, 240.0f, 1.0f);
        this.f34592p = f8Var12;
        f8 f8Var13 = new f8(0.0f, 700.0f, 1.0f);
        this.f34593q = f8Var13;
        f8 f8Var14 = new f8(1.0f, 260.0f, 1.0f);
        this.f34594r = f8Var14;
        this.f34595s = new f8[]{f8Var, f8Var2, f8Var3, f8Var4, f8Var5, f8Var6, f8Var7, f8Var8, f8Var9, f8Var10, f8Var11, f8Var12, f8Var13, f8Var14};
        this.E = -2;
        this.V = 1.0f;
        this.f34581c0 = 1.0f;
        this.f34578b = nftitem;
        this.f34576a = nftitem.address;
        ArrayList<TL_stars.StarGiftAttribute> arrayList = nftitem.gift.attributes;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i10);
            i10++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributeBackdrop) {
                this.f34596t = (TL_stars.starGiftAttributeBackdrop) starGiftAttribute2;
            }
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                this.d.q0(ic.b(((TL_stars.starGiftAttributePattern) starGiftAttribute2).document), "60_60_firstframe", null, null, nftitem.gift, 1);
            }
        }
        d3 d3Var = new d3(this, 5);
        ag.c2 c2Var = this.f34580c;
        c2Var.f14382g1 = d3Var;
        this.d.f14382g1 = d3Var;
        c2Var.d = k2Var.getCurrentAccount();
        this.d.d = k2Var.getCurrentAccount();
        ag.c2 c2Var2 = this.f34580c;
        c2Var2.f14410u0 = false;
        c2Var2.W(1);
        this.f34580c.q0(ic.b(nftitem.gift.getDocument()), "120_120_nolimit", null, null, nftitem.gift, 1);
        if (h8Var.isAttachedToWindow()) {
            this.f34580c.P();
            this.d.P();
        }
    }

    public final Bitmap a() {
        int i10;
        h8 h8Var = this.f34582d0;
        RectF rectF = h8Var.E;
        ag.c2 c2Var = this.f34580c;
        Bitmap n10 = c2Var.n();
        if (n10 != null && !n10.isRecycled()) {
            bi0 B = c2Var.B();
            if (B == null) {
                i10 = 0;
            } else {
                i10 = B.f24752a0;
            }
            Bitmap bitmap = this.v;
            if (bitmap != null && this.G == n10 && this.E == i10) {
                return this.f34597u;
            }
            this.G = n10;
            this.E = i10;
            if (bitmap == null) {
                this.v = Bitmap.createBitmap(288, 288, Bitmap.Config.ARGB_8888);
                this.f34599x = new Canvas(this.v);
            }
            this.v.eraseColor(0);
            rectF.set(10.0f, 10.0f, 278.0f, 278.0f);
            this.f34599x.drawBitmap(n10, (Rect) null, rectF, h8Var.D);
            if (this.C) {
                this.D = true;
            } else {
                c();
            }
            return this.f34597u;
        }
        return this.f34597u;
    }

    public final boolean b() {
        int i10 = this.H;
        if (i10 == 2 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final void c() {
        boolean z10;
        if (this.f34600y == null) {
            this.f34600y = new int[82944];
            this.f34601z = new int[82944];
            this.A = new int[82944];
            org.telegram.messenger.s5 s5Var = ga.f34604a;
            this.B = new int[288];
        }
        this.v.getPixels(this.f34600y, 0, 288, 0, 0, 288, 288);
        this.C = true;
        this.D = false;
        if (this.f34598w == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int[] iArr = this.f34600y;
        int[] iArr2 = this.f34601z;
        int[] iArr3 = this.A;
        int[] iArr4 = this.B;
        if (ga.f34604a == null) {
            ga.f34604a = new org.telegram.messenger.s5("walletStickerOutline", true);
        }
        ga.f34604a.postRunnable(new i2.h1(this, iArr, iArr2, iArr3, iArr4, z10, 8));
    }
}
