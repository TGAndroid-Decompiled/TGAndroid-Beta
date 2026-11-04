package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ch0;
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
    public final String f42162a;
    public float f42163a0;
    public TL_wallet.nftItem f42164b;
    public float f42165b0;
    public final ei.c3 f42166c;
    public float f42167c0;
    public final ImageReceiver d;
    public final b8 f42168d0;
    public final z7 f42169e;
    public final z7 f42170f;
    public final z7 f42171g;
    public final z7 h;
    public final z7 f42172i;
    public final z7 f42173j;
    public final z7 f42174k;
    public final z7 f42175l;
    public final z7 f42176m;
    public final z7 f42177n;
    public final z7 f42178o;
    public final z7 f42179p;
    public final z7 f42180q;
    public final z7 f42181r;
    public final z7[] f42182s;
    public final TL_stars.starGiftAttributeBackdrop f42183t;
    public Bitmap f42184u;
    public Bitmap v;
    public Bitmap f42185w;
    public Canvas f42186x;
    public int[] f42187y;
    public int[] f42188z;

    public a8(b8 b8Var, TL_wallet.nftItem nftitem) {
        org.telegram.ui.ActionBar.d2 d2Var = b8Var.f42288a;
        this.f42168d0 = b8Var;
        this.f42166c = new ei.c3(this, b8Var, 6);
        this.d = new ImageReceiver(b8Var.N);
        z7 z7Var = new z7(0.0f, 900.0f, 0.86f);
        this.f42169e = z7Var;
        z7 z7Var2 = new z7(0.0f, 900.0f, 0.86f);
        this.f42170f = z7Var2;
        z7 z7Var3 = new z7(1.0f, 420.0f, 0.78f);
        this.f42171g = z7Var3;
        z7 z7Var4 = new z7(1.0f, 700.0f, 0.9f);
        this.h = z7Var4;
        z7 z7Var5 = new z7(0.0f, 700.0f, 0.9f);
        this.f42172i = z7Var5;
        z7 z7Var6 = new z7(0.0f, 380.0f, 0.82f);
        this.f42173j = z7Var6;
        z7 z7Var7 = new z7(0.0f, 30.0f, 1.0f);
        this.f42174k = z7Var7;
        z7 z7Var8 = new z7(0.0f, 520.0f, 0.62f);
        this.f42175l = z7Var8;
        z7 z7Var9 = new z7(0.0f, 300.0f, 1.0f);
        this.f42176m = z7Var9;
        z7 z7Var10 = new z7(0.0f, 150.0f, 0.82f);
        this.f42177n = z7Var10;
        z7 z7Var11 = new z7(0.0f, 150.0f, 0.82f);
        this.f42178o = z7Var11;
        z7 z7Var12 = new z7(0.0f, 240.0f, 1.0f);
        this.f42179p = z7Var12;
        z7 z7Var13 = new z7(0.0f, 700.0f, 1.0f);
        this.f42180q = z7Var13;
        z7 z7Var14 = new z7(1.0f, 260.0f, 1.0f);
        this.f42181r = z7Var14;
        this.f42182s = new z7[]{z7Var, z7Var2, z7Var3, z7Var4, z7Var5, z7Var6, z7Var7, z7Var8, z7Var9, z7Var10, z7Var11, z7Var12, z7Var13, z7Var14};
        this.E = -2;
        this.V = 1.0f;
        this.f42167c0 = 1.0f;
        this.f42164b = nftitem;
        this.f42162a = nftitem.address;
        ArrayList<TL_stars.StarGiftAttribute> arrayList = nftitem.gift.attributes;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i3);
            i3++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributeBackdrop) {
                this.f42183t = (TL_stars.starGiftAttributeBackdrop) starGiftAttribute2;
            }
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                this.d.q0(ac.b(((TL_stars.starGiftAttributePattern) starGiftAttribute2).document), "60_60_firstframe", null, null, nftitem.gift, 1);
            }
        }
        c3 c3Var = new c3(this, 5);
        ei.c3 c3Var2 = this.f42166c;
        c3Var2.f21247h1 = c3Var;
        this.d.f21247h1 = c3Var;
        c3Var2.d = d2Var.getCurrentAccount();
        this.d.d = d2Var.getCurrentAccount();
        ei.c3 c3Var3 = this.f42166c;
        c3Var3.f21274v0 = false;
        c3Var3.W(1);
        this.f42166c.q0(ac.b(nftitem.gift.getDocument()), "120_120_nolimit", null, null, nftitem.gift, 1);
        if (b8Var.isAttachedToWindow()) {
            this.f42166c.P();
            this.d.P();
        }
    }

    public final Bitmap a() {
        int i3;
        b8 b8Var = this.f42168d0;
        RectF rectF = b8Var.F;
        ei.c3 c3Var = this.f42166c;
        Bitmap n4 = c3Var.n();
        if (n4 != null && !n4.isRecycled()) {
            ch0 B = c3Var.B();
            if (B == null) {
                i3 = 0;
            } else {
                i3 = B.f32721b0;
            }
            Bitmap bitmap = this.v;
            if (bitmap != null && this.G == n4 && this.E == i3) {
                return this.f42184u;
            }
            this.G = n4;
            this.E = i3;
            if (bitmap == null) {
                this.v = Bitmap.createBitmap(288, 288, Bitmap.Config.ARGB_8888);
                this.f42186x = new Canvas(this.v);
            }
            this.v.eraseColor(0);
            rectF.set(10.0f, 10.0f, 278.0f, 278.0f);
            this.f42186x.drawBitmap(n4, (Rect) null, rectF, b8Var.E);
            if (this.C) {
                this.D = true;
            } else {
                c();
            }
            return this.f42184u;
        }
        return this.f42184u;
    }

    public final boolean b() {
        int i3 = this.H;
        if (i3 == 2 || i3 == 1) {
            return true;
        }
        return false;
    }

    public final void c() {
        boolean z10;
        if (this.f42187y == null) {
            this.f42187y = new int[82944];
            this.f42188z = new int[82944];
            this.A = new int[82944];
            org.telegram.messenger.q5 q5Var = ba.f42351a;
            this.B = new int[288];
        }
        this.v.getPixels(this.f42187y, 0, 288, 0, 0, 288, 288);
        this.C = true;
        this.D = false;
        if (this.f42185w == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int[] iArr = this.f42187y;
        int[] iArr2 = this.f42188z;
        int[] iArr3 = this.A;
        ?? r82 = this.B;
        if (ba.f42351a == null) {
            ba.f42351a = new org.telegram.messenger.q5("walletStickerOutline", true);
        }
        ba.f42351a.postRunnable(new ci.v3(this, iArr, iArr2, iArr3, (Serializable) r82, z10, 9));
    }
}
