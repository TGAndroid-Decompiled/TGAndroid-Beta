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
    public final String f42151a;
    public float f42152a0;
    public TL_wallet.nftItem f42153b;
    public float f42154b0;
    public final di.z2 f42155c;
    public float f42156c0;
    public final ImageReceiver d;
    public final c8 f42157d0;
    public final a8 f42158e;
    public final a8 f42159f;
    public final a8 f42160g;
    public final a8 h;
    public final a8 f42161i;
    public final a8 f42162j;
    public final a8 f42163k;
    public final a8 f42164l;
    public final a8 f42165m;
    public final a8 f42166n;
    public final a8 f42167o;
    public final a8 f42168p;
    public final a8 f42169q;
    public final a8 f42170r;
    public final a8[] f42171s;
    public final TL_stars.starGiftAttributeBackdrop f42172t;
    public Bitmap f42173u;
    public Bitmap v;
    public Bitmap f42174w;
    public Canvas f42175x;
    public int[] f42176y;
    public int[] f42177z;

    public b8(c8 c8Var, TL_wallet.nftItem nftitem) {
        org.telegram.ui.ActionBar.f2 f2Var = c8Var.f42250a;
        this.f42157d0 = c8Var;
        this.f42155c = new di.z2(this, c8Var, 6);
        this.d = new ImageReceiver(c8Var.M);
        a8 a8Var = new a8(0.0f, 900.0f, 0.86f);
        this.f42158e = a8Var;
        a8 a8Var2 = new a8(0.0f, 900.0f, 0.86f);
        this.f42159f = a8Var2;
        a8 a8Var3 = new a8(1.0f, 420.0f, 0.78f);
        this.f42160g = a8Var3;
        a8 a8Var4 = new a8(1.0f, 700.0f, 0.9f);
        this.h = a8Var4;
        a8 a8Var5 = new a8(0.0f, 700.0f, 0.9f);
        this.f42161i = a8Var5;
        a8 a8Var6 = new a8(0.0f, 380.0f, 0.82f);
        this.f42162j = a8Var6;
        a8 a8Var7 = new a8(0.0f, 30.0f, 1.0f);
        this.f42163k = a8Var7;
        a8 a8Var8 = new a8(0.0f, 520.0f, 0.62f);
        this.f42164l = a8Var8;
        a8 a8Var9 = new a8(0.0f, 300.0f, 1.0f);
        this.f42165m = a8Var9;
        a8 a8Var10 = new a8(0.0f, 150.0f, 0.82f);
        this.f42166n = a8Var10;
        a8 a8Var11 = new a8(0.0f, 150.0f, 0.82f);
        this.f42167o = a8Var11;
        a8 a8Var12 = new a8(0.0f, 240.0f, 1.0f);
        this.f42168p = a8Var12;
        a8 a8Var13 = new a8(0.0f, 700.0f, 1.0f);
        this.f42169q = a8Var13;
        a8 a8Var14 = new a8(1.0f, 260.0f, 1.0f);
        this.f42170r = a8Var14;
        this.f42171s = new a8[]{a8Var, a8Var2, a8Var3, a8Var4, a8Var5, a8Var6, a8Var7, a8Var8, a8Var9, a8Var10, a8Var11, a8Var12, a8Var13, a8Var14};
        this.E = -2;
        this.V = 1.0f;
        this.f42156c0 = 1.0f;
        this.f42153b = nftitem;
        this.f42151a = nftitem.address;
        ArrayList<TL_stars.StarGiftAttribute> arrayList = nftitem.gift.attributes;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i7);
            i7++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributeBackdrop) {
                this.f42172t = (TL_stars.starGiftAttributeBackdrop) starGiftAttribute2;
            }
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                this.d.q0(hc.b(((TL_stars.starGiftAttributePattern) starGiftAttribute2).document), "60_60_firstframe", null, null, nftitem.gift, 1);
            }
        }
        e3 e3Var = new e3(this, 5);
        di.z2 z2Var = this.f42155c;
        z2Var.f21192g1 = e3Var;
        this.d.f21192g1 = e3Var;
        z2Var.d = f2Var.getCurrentAccount();
        this.d.d = f2Var.getCurrentAccount();
        di.z2 z2Var2 = this.f42155c;
        z2Var2.f21219u0 = false;
        z2Var2.W(1);
        this.f42155c.q0(hc.b(nftitem.gift.getDocument()), "120_120_nolimit", null, null, nftitem.gift, 1);
        if (c8Var.isAttachedToWindow()) {
            this.f42155c.P();
            this.d.P();
        }
    }

    public final Bitmap a() {
        int i7;
        c8 c8Var = this.f42157d0;
        RectF rectF = c8Var.E;
        di.z2 z2Var = this.f42155c;
        Bitmap n10 = z2Var.n();
        if (n10 != null && !n10.isRecycled()) {
            zg0 B = z2Var.B();
            if (B == null) {
                i7 = 0;
            } else {
                i7 = B.f40970a0;
            }
            Bitmap bitmap = this.v;
            if (bitmap != null && this.G == n10 && this.E == i7) {
                return this.f42173u;
            }
            this.G = n10;
            this.E = i7;
            if (bitmap == null) {
                this.v = Bitmap.createBitmap(288, 288, Bitmap.Config.ARGB_8888);
                this.f42175x = new Canvas(this.v);
            }
            this.v.eraseColor(0);
            rectF.set(10.0f, 10.0f, 278.0f, 278.0f);
            this.f42175x.drawBitmap(n10, (Rect) null, rectF, c8Var.D);
            if (this.C) {
                this.D = true;
            } else {
                c();
            }
            return this.f42173u;
        }
        return this.f42173u;
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
        if (this.f42176y == null) {
            this.f42176y = new int[82944];
            this.f42177z = new int[82944];
            this.A = new int[82944];
            org.telegram.messenger.q5 q5Var = ca.f42313a;
            this.B = new int[288];
        }
        this.v.getPixels(this.f42176y, 0, 288, 0, 0, 288, 288);
        this.C = true;
        this.D = false;
        if (this.f42174w == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        int[] iArr = this.f42176y;
        int[] iArr2 = this.f42177z;
        int[] iArr3 = this.A;
        ?? r82 = this.B;
        if (ca.f42313a == null) {
            ca.f42313a = new org.telegram.messenger.q5("walletStickerOutline", true);
        }
        ca.f42313a.postRunnable(new bi.l4(this, iArr, iArr2, iArr3, (Serializable) r82, z9, 9));
    }
}
