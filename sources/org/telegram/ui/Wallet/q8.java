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
    public final String f44870a;
    public float f44871a0;
    public TL_wallet.nftItem f44872b;
    public float f44873b0;
    public final fi.s2 f44874c;
    public float f44875c0;
    public final ImageReceiver d;
    public final r8 f44876d0;
    public final p8 f44877e;
    public final p8 f44878f;
    public final p8 f44879g;
    public final p8 h;
    public final p8 f44880i;
    public final p8 f44881j;
    public final p8 f44882k;
    public final p8 f44883l;
    public final p8 f44884m;
    public final p8 f44885n;
    public final p8 f44886o;
    public final p8 f44887p;
    public final p8 f44888q;
    public final p8 f44889r;
    public final p8[] f44890s;
    public final TL_stars.starGiftAttributeBackdrop f44891t;
    public Bitmap f44892u;
    public Bitmap v;
    public Bitmap f44893w;
    public Canvas f44894x;
    public int[] f44895y;
    public int[] f44896z;

    public q8(r8 r8Var, TL_wallet.nftItem nftitem) {
        org.telegram.ui.ActionBar.g2 g2Var = r8Var.f44927a;
        this.f44876d0 = r8Var;
        this.f44874c = new fi.s2(this, r8Var, 6);
        this.d = new ImageReceiver(r8Var.N);
        p8 p8Var = new p8(0.0f, 900.0f, 0.86f);
        this.f44877e = p8Var;
        p8 p8Var2 = new p8(0.0f, 900.0f, 0.86f);
        this.f44878f = p8Var2;
        p8 p8Var3 = new p8(1.0f, 420.0f, 0.78f);
        this.f44879g = p8Var3;
        p8 p8Var4 = new p8(1.0f, 700.0f, 0.9f);
        this.h = p8Var4;
        p8 p8Var5 = new p8(0.0f, 700.0f, 0.9f);
        this.f44880i = p8Var5;
        p8 p8Var6 = new p8(0.0f, 380.0f, 0.82f);
        this.f44881j = p8Var6;
        p8 p8Var7 = new p8(0.0f, 30.0f, 1.0f);
        this.f44882k = p8Var7;
        p8 p8Var8 = new p8(0.0f, 520.0f, 0.62f);
        this.f44883l = p8Var8;
        p8 p8Var9 = new p8(0.0f, 300.0f, 1.0f);
        this.f44884m = p8Var9;
        p8 p8Var10 = new p8(0.0f, 150.0f, 0.82f);
        this.f44885n = p8Var10;
        p8 p8Var11 = new p8(0.0f, 150.0f, 0.82f);
        this.f44886o = p8Var11;
        p8 p8Var12 = new p8(0.0f, 240.0f, 1.0f);
        this.f44887p = p8Var12;
        p8 p8Var13 = new p8(0.0f, 700.0f, 1.0f);
        this.f44888q = p8Var13;
        p8 p8Var14 = new p8(1.0f, 260.0f, 1.0f);
        this.f44889r = p8Var14;
        this.f44890s = new p8[]{p8Var, p8Var2, p8Var3, p8Var4, p8Var5, p8Var6, p8Var7, p8Var8, p8Var9, p8Var10, p8Var11, p8Var12, p8Var13, p8Var14};
        this.E = -2;
        this.V = 1.0f;
        this.f44875c0 = 1.0f;
        this.f44872b = nftitem;
        this.f44870a = nftitem.address;
        ArrayList<TL_stars.StarGiftAttribute> arrayList = nftitem.gift.attributes;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i7);
            i7++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributeBackdrop) {
                this.f44891t = (TL_stars.starGiftAttributeBackdrop) starGiftAttribute2;
            }
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                this.d.q0(gc.b(((TL_stars.starGiftAttributePattern) starGiftAttribute2).document), "60_60_firstframe", null, null, nftitem.gift, 1);
            }
        }
        h3 h3Var = new h3(this, 5);
        fi.s2 s2Var = this.f44874c;
        s2Var.f22670h1 = h3Var;
        this.d.f22670h1 = h3Var;
        s2Var.d = g2Var.getCurrentAccount();
        this.d.d = g2Var.getCurrentAccount();
        fi.s2 s2Var2 = this.f44874c;
        s2Var2.f22697v0 = false;
        s2Var2.W(1);
        this.f44874c.q0(gc.b(nftitem.gift.getDocument()), "120_120_nolimit", null, null, nftitem.gift, 1);
        if (r8Var.isAttachedToWindow()) {
            this.f44874c.P();
            this.d.P();
        }
    }

    public final Bitmap a() {
        int i7;
        r8 r8Var = this.f44876d0;
        RectF rectF = r8Var.F;
        fi.s2 s2Var = this.f44874c;
        Bitmap n10 = s2Var.n();
        if (n10 != null && !n10.isRecycled()) {
            oh0 B = s2Var.B();
            if (B == null) {
                i7 = 0;
            } else {
                i7 = B.f38207b0;
            }
            Bitmap bitmap = this.v;
            if (bitmap != null && this.G == n10 && this.E == i7) {
                return this.f44892u;
            }
            this.G = n10;
            this.E = i7;
            if (bitmap == null) {
                this.v = Bitmap.createBitmap(288, 288, Bitmap.Config.ARGB_8888);
                this.f44894x = new Canvas(this.v);
            }
            this.v.eraseColor(0);
            rectF.set(10.0f, 10.0f, 278.0f, 278.0f);
            this.f44894x.drawBitmap(n10, (Rect) null, rectF, r8Var.E);
            if (this.C) {
                this.D = true;
            } else {
                c();
            }
            return this.f44892u;
        }
        return this.f44892u;
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
        if (this.f44895y == null) {
            this.f44895y = new int[82944];
            this.f44896z = new int[82944];
            this.A = new int[82944];
            org.telegram.messenger.r5 r5Var = sa.f45071a;
            this.B = new int[288];
        }
        this.v.getPixels(this.f44895y, 0, 288, 0, 0, 288, 288);
        this.C = true;
        this.D = false;
        if (this.f44893w == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int[] iArr = this.f44895y;
        int[] iArr2 = this.f44896z;
        int[] iArr3 = this.A;
        ?? r82 = this.B;
        if (sa.f45071a == null) {
            sa.f45071a = new org.telegram.messenger.r5("walletStickerOutline", true);
        }
        sa.f45071a.postRunnable(new di.o3(this, iArr, iArr2, iArr3, (Serializable) r82, z10, 9));
    }
}
