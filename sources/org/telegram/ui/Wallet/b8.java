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
    public final String f42152a;
    public float f42153a0;
    public TL_wallet.nftItem f42154b;
    public float f42155b0;
    public final di.z2 f42156c;
    public float f42157c0;
    public final ImageReceiver d;
    public final c8 f42158d0;
    public final a8 f42159e;
    public final a8 f42160f;
    public final a8 f42161g;
    public final a8 h;
    public final a8 f42162i;
    public final a8 f42163j;
    public final a8 f42164k;
    public final a8 f42165l;
    public final a8 f42166m;
    public final a8 f42167n;
    public final a8 f42168o;
    public final a8 f42169p;
    public final a8 f42170q;
    public final a8 f42171r;
    public final a8[] f42172s;
    public final TL_stars.starGiftAttributeBackdrop f42173t;
    public Bitmap f42174u;
    public Bitmap v;
    public Bitmap f42175w;
    public Canvas f42176x;
    public int[] f42177y;
    public int[] f42178z;

    public b8(c8 c8Var, TL_wallet.nftItem nftitem) {
        org.telegram.ui.ActionBar.f2 f2Var = c8Var.f42251a;
        this.f42158d0 = c8Var;
        this.f42156c = new di.z2(this, c8Var, 6);
        this.d = new ImageReceiver(c8Var.M);
        a8 a8Var = new a8(0.0f, 900.0f, 0.86f);
        this.f42159e = a8Var;
        a8 a8Var2 = new a8(0.0f, 900.0f, 0.86f);
        this.f42160f = a8Var2;
        a8 a8Var3 = new a8(1.0f, 420.0f, 0.78f);
        this.f42161g = a8Var3;
        a8 a8Var4 = new a8(1.0f, 700.0f, 0.9f);
        this.h = a8Var4;
        a8 a8Var5 = new a8(0.0f, 700.0f, 0.9f);
        this.f42162i = a8Var5;
        a8 a8Var6 = new a8(0.0f, 380.0f, 0.82f);
        this.f42163j = a8Var6;
        a8 a8Var7 = new a8(0.0f, 30.0f, 1.0f);
        this.f42164k = a8Var7;
        a8 a8Var8 = new a8(0.0f, 520.0f, 0.62f);
        this.f42165l = a8Var8;
        a8 a8Var9 = new a8(0.0f, 300.0f, 1.0f);
        this.f42166m = a8Var9;
        a8 a8Var10 = new a8(0.0f, 150.0f, 0.82f);
        this.f42167n = a8Var10;
        a8 a8Var11 = new a8(0.0f, 150.0f, 0.82f);
        this.f42168o = a8Var11;
        a8 a8Var12 = new a8(0.0f, 240.0f, 1.0f);
        this.f42169p = a8Var12;
        a8 a8Var13 = new a8(0.0f, 700.0f, 1.0f);
        this.f42170q = a8Var13;
        a8 a8Var14 = new a8(1.0f, 260.0f, 1.0f);
        this.f42171r = a8Var14;
        this.f42172s = new a8[]{a8Var, a8Var2, a8Var3, a8Var4, a8Var5, a8Var6, a8Var7, a8Var8, a8Var9, a8Var10, a8Var11, a8Var12, a8Var13, a8Var14};
        this.E = -2;
        this.V = 1.0f;
        this.f42157c0 = 1.0f;
        this.f42154b = nftitem;
        this.f42152a = nftitem.address;
        ArrayList<TL_stars.StarGiftAttribute> arrayList = nftitem.gift.attributes;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i7);
            i7++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributeBackdrop) {
                this.f42173t = (TL_stars.starGiftAttributeBackdrop) starGiftAttribute2;
            }
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                this.d.q0(hc.b(((TL_stars.starGiftAttributePattern) starGiftAttribute2).document), "60_60_firstframe", null, null, nftitem.gift, 1);
            }
        }
        e3 e3Var = new e3(this, 5);
        di.z2 z2Var = this.f42156c;
        z2Var.f21192g1 = e3Var;
        this.d.f21192g1 = e3Var;
        z2Var.d = f2Var.getCurrentAccount();
        this.d.d = f2Var.getCurrentAccount();
        di.z2 z2Var2 = this.f42156c;
        z2Var2.f21219u0 = false;
        z2Var2.W(1);
        this.f42156c.q0(hc.b(nftitem.gift.getDocument()), "120_120_nolimit", null, null, nftitem.gift, 1);
        if (c8Var.isAttachedToWindow()) {
            this.f42156c.P();
            this.d.P();
        }
    }

    public final Bitmap a() {
        int i7;
        c8 c8Var = this.f42158d0;
        RectF rectF = c8Var.E;
        di.z2 z2Var = this.f42156c;
        Bitmap n10 = z2Var.n();
        if (n10 != null && !n10.isRecycled()) {
            zg0 B = z2Var.B();
            if (B == null) {
                i7 = 0;
            } else {
                i7 = B.f40950a0;
            }
            Bitmap bitmap = this.v;
            if (bitmap != null && this.G == n10 && this.E == i7) {
                return this.f42174u;
            }
            this.G = n10;
            this.E = i7;
            if (bitmap == null) {
                this.v = Bitmap.createBitmap(288, 288, Bitmap.Config.ARGB_8888);
                this.f42176x = new Canvas(this.v);
            }
            this.v.eraseColor(0);
            rectF.set(10.0f, 10.0f, 278.0f, 278.0f);
            this.f42176x.drawBitmap(n10, (Rect) null, rectF, c8Var.D);
            if (this.C) {
                this.D = true;
            } else {
                c();
            }
            return this.f42174u;
        }
        return this.f42174u;
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
        if (this.f42177y == null) {
            this.f42177y = new int[82944];
            this.f42178z = new int[82944];
            this.A = new int[82944];
            org.telegram.messenger.q5 q5Var = ca.f42314a;
            this.B = new int[288];
        }
        this.v.getPixels(this.f42177y, 0, 288, 0, 0, 288, 288);
        this.C = true;
        this.D = false;
        if (this.f42175w == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        int[] iArr = this.f42177y;
        int[] iArr2 = this.f42178z;
        int[] iArr3 = this.A;
        ?? r82 = this.B;
        if (ca.f42314a == null) {
            ca.f42314a = new org.telegram.messenger.q5("walletStickerOutline", true);
        }
        ca.f42314a.postRunnable(new bi.l4(this, iArr, iArr2, iArr3, (Serializable) r82, z9, 9));
    }
}
