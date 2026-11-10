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
public final class c8 {
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
    public final String f42219a;
    public float f42220a0;
    public TL_wallet.nftItem f42221b;
    public float f42222b0;
    public final di.z2 f42223c;
    public float f42224c0;
    public final ImageReceiver d;
    public final d8 f42225d0;
    public final b8 f42226e;
    public final b8 f42227f;
    public final b8 f42228g;
    public final b8 h;
    public final b8 f42229i;
    public final b8 f42230j;
    public final b8 f42231k;
    public final b8 f42232l;
    public final b8 f42233m;
    public final b8 f42234n;
    public final b8 f42235o;
    public final b8 f42236p;
    public final b8 f42237q;
    public final b8 f42238r;
    public final b8[] f42239s;
    public final TL_stars.starGiftAttributeBackdrop f42240t;
    public Bitmap f42241u;
    public Bitmap v;
    public Bitmap f42242w;
    public Canvas f42243x;
    public int[] f42244y;
    public int[] f42245z;

    public c8(d8 d8Var, TL_wallet.nftItem nftitem) {
        org.telegram.ui.ActionBar.f2 f2Var = d8Var.f42375a;
        this.f42225d0 = d8Var;
        this.f42223c = new di.z2(this, d8Var, 6);
        this.d = new ImageReceiver(d8Var.M);
        b8 b8Var = new b8(0.0f, 900.0f, 0.86f);
        this.f42226e = b8Var;
        b8 b8Var2 = new b8(0.0f, 900.0f, 0.86f);
        this.f42227f = b8Var2;
        b8 b8Var3 = new b8(1.0f, 420.0f, 0.78f);
        this.f42228g = b8Var3;
        b8 b8Var4 = new b8(1.0f, 700.0f, 0.9f);
        this.h = b8Var4;
        b8 b8Var5 = new b8(0.0f, 700.0f, 0.9f);
        this.f42229i = b8Var5;
        b8 b8Var6 = new b8(0.0f, 380.0f, 0.82f);
        this.f42230j = b8Var6;
        b8 b8Var7 = new b8(0.0f, 30.0f, 1.0f);
        this.f42231k = b8Var7;
        b8 b8Var8 = new b8(0.0f, 520.0f, 0.62f);
        this.f42232l = b8Var8;
        b8 b8Var9 = new b8(0.0f, 300.0f, 1.0f);
        this.f42233m = b8Var9;
        b8 b8Var10 = new b8(0.0f, 150.0f, 0.82f);
        this.f42234n = b8Var10;
        b8 b8Var11 = new b8(0.0f, 150.0f, 0.82f);
        this.f42235o = b8Var11;
        b8 b8Var12 = new b8(0.0f, 240.0f, 1.0f);
        this.f42236p = b8Var12;
        b8 b8Var13 = new b8(0.0f, 700.0f, 1.0f);
        this.f42237q = b8Var13;
        b8 b8Var14 = new b8(1.0f, 260.0f, 1.0f);
        this.f42238r = b8Var14;
        this.f42239s = new b8[]{b8Var, b8Var2, b8Var3, b8Var4, b8Var5, b8Var6, b8Var7, b8Var8, b8Var9, b8Var10, b8Var11, b8Var12, b8Var13, b8Var14};
        this.E = -2;
        this.V = 1.0f;
        this.f42224c0 = 1.0f;
        this.f42221b = nftitem;
        this.f42219a = nftitem.address;
        ArrayList<TL_stars.StarGiftAttribute> arrayList = nftitem.gift.attributes;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i7);
            i7++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributeBackdrop) {
                this.f42240t = (TL_stars.starGiftAttributeBackdrop) starGiftAttribute2;
            }
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                this.d.q0(hc.b(((TL_stars.starGiftAttributePattern) starGiftAttribute2).document), "60_60_firstframe", null, null, nftitem.gift, 1);
            }
        }
        c3 c3Var = new c3(this, 5);
        di.z2 z2Var = this.f42223c;
        z2Var.f21200g1 = c3Var;
        this.d.f21200g1 = c3Var;
        z2Var.d = f2Var.getCurrentAccount();
        this.d.d = f2Var.getCurrentAccount();
        di.z2 z2Var2 = this.f42223c;
        z2Var2.f21227u0 = false;
        z2Var2.W(1);
        this.f42223c.q0(hc.b(nftitem.gift.getDocument()), "120_120_nolimit", null, null, nftitem.gift, 1);
        if (d8Var.isAttachedToWindow()) {
            this.f42223c.P();
            this.d.P();
        }
    }

    public final Bitmap a() {
        int i7;
        d8 d8Var = this.f42225d0;
        RectF rectF = d8Var.E;
        di.z2 z2Var = this.f42223c;
        Bitmap n10 = z2Var.n();
        if (n10 != null && !n10.isRecycled()) {
            zg0 B = z2Var.B();
            if (B == null) {
                i7 = 0;
            } else {
                i7 = B.f40962a0;
            }
            Bitmap bitmap = this.v;
            if (bitmap != null && this.G == n10 && this.E == i7) {
                return this.f42241u;
            }
            this.G = n10;
            this.E = i7;
            if (bitmap == null) {
                this.v = Bitmap.createBitmap(288, 288, Bitmap.Config.ARGB_8888);
                this.f42243x = new Canvas(this.v);
            }
            this.v.eraseColor(0);
            rectF.set(10.0f, 10.0f, 278.0f, 278.0f);
            this.f42243x.drawBitmap(n10, (Rect) null, rectF, d8Var.D);
            if (this.C) {
                this.D = true;
            } else {
                c();
            }
            return this.f42241u;
        }
        return this.f42241u;
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
        if (this.f42244y == null) {
            this.f42244y = new int[82944];
            this.f42245z = new int[82944];
            this.A = new int[82944];
            org.telegram.messenger.q5 q5Var = da.f42438a;
            this.B = new int[288];
        }
        this.v.getPixels(this.f42244y, 0, 288, 0, 0, 288, 288);
        this.C = true;
        this.D = false;
        if (this.f42242w == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        int[] iArr = this.f42244y;
        int[] iArr2 = this.f42245z;
        int[] iArr3 = this.A;
        ?? r82 = this.B;
        if (da.f42438a == null) {
            da.f42438a = new org.telegram.messenger.q5("walletStickerOutline", true);
        }
        da.f42438a.postRunnable(new bi.l4(this, iArr, iArr2, iArr3, (Serializable) r82, z9, 9));
    }
}
