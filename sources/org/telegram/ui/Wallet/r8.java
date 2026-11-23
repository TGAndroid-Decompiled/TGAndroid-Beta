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
import org.telegram.ui.Components.nh0;
public final class r8 {
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
    public final String f44998a;
    public float f44999a0;
    public TL_wallet.nftItem f45000b;
    public float f45001b0;
    public final fi.s2 f45002c;
    public float f45003c0;
    public final ImageReceiver d;
    public final s8 f45004d0;
    public final q8 f45005e;
    public final q8 f45006f;
    public final q8 f45007g;
    public final q8 h;
    public final q8 f45008i;
    public final q8 f45009j;
    public final q8 f45010k;
    public final q8 f45011l;
    public final q8 f45012m;
    public final q8 f45013n;
    public final q8 f45014o;
    public final q8 f45015p;
    public final q8 f45016q;
    public final q8 f45017r;
    public final q8[] f45018s;
    public final TL_stars.starGiftAttributeBackdrop f45019t;
    public Bitmap f45020u;
    public Bitmap v;
    public Bitmap f45021w;
    public Canvas f45022x;
    public int[] f45023y;
    public int[] f45024z;

    public r8(s8 s8Var, TL_wallet.nftItem nftitem) {
        org.telegram.ui.ActionBar.g2 g2Var = s8Var.f45055a;
        this.f45004d0 = s8Var;
        this.f45002c = new fi.s2(this, s8Var, 6);
        this.d = new ImageReceiver(s8Var.N);
        q8 q8Var = new q8(0.0f, 900.0f, 0.86f);
        this.f45005e = q8Var;
        q8 q8Var2 = new q8(0.0f, 900.0f, 0.86f);
        this.f45006f = q8Var2;
        q8 q8Var3 = new q8(1.0f, 420.0f, 0.78f);
        this.f45007g = q8Var3;
        q8 q8Var4 = new q8(1.0f, 700.0f, 0.9f);
        this.h = q8Var4;
        q8 q8Var5 = new q8(0.0f, 700.0f, 0.9f);
        this.f45008i = q8Var5;
        q8 q8Var6 = new q8(0.0f, 380.0f, 0.82f);
        this.f45009j = q8Var6;
        q8 q8Var7 = new q8(0.0f, 30.0f, 1.0f);
        this.f45010k = q8Var7;
        q8 q8Var8 = new q8(0.0f, 520.0f, 0.62f);
        this.f45011l = q8Var8;
        q8 q8Var9 = new q8(0.0f, 300.0f, 1.0f);
        this.f45012m = q8Var9;
        q8 q8Var10 = new q8(0.0f, 150.0f, 0.82f);
        this.f45013n = q8Var10;
        q8 q8Var11 = new q8(0.0f, 150.0f, 0.82f);
        this.f45014o = q8Var11;
        q8 q8Var12 = new q8(0.0f, 240.0f, 1.0f);
        this.f45015p = q8Var12;
        q8 q8Var13 = new q8(0.0f, 700.0f, 1.0f);
        this.f45016q = q8Var13;
        q8 q8Var14 = new q8(1.0f, 260.0f, 1.0f);
        this.f45017r = q8Var14;
        this.f45018s = new q8[]{q8Var, q8Var2, q8Var3, q8Var4, q8Var5, q8Var6, q8Var7, q8Var8, q8Var9, q8Var10, q8Var11, q8Var12, q8Var13, q8Var14};
        this.E = -2;
        this.V = 1.0f;
        this.f45003c0 = 1.0f;
        this.f45000b = nftitem;
        this.f44998a = nftitem.address;
        ArrayList<TL_stars.StarGiftAttribute> arrayList = nftitem.gift.attributes;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i7);
            i7++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributeBackdrop) {
                this.f45019t = (TL_stars.starGiftAttributeBackdrop) starGiftAttribute2;
            }
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                this.d.r0(fc.b(((TL_stars.starGiftAttributePattern) starGiftAttribute2).document), "60_60_firstframe", null, null, nftitem.gift, 1);
            }
        }
        i3 i3Var = new i3(this, 5);
        fi.s2 s2Var = this.f45002c;
        s2Var.f22737h1 = i3Var;
        this.d.f22737h1 = i3Var;
        s2Var.d = g2Var.getCurrentAccount();
        this.d.d = g2Var.getCurrentAccount();
        fi.s2 s2Var2 = this.f45002c;
        s2Var2.f22764v0 = false;
        s2Var2.X(1);
        this.f45002c.r0(fc.b(nftitem.gift.getDocument()), "120_120_nolimit", null, null, nftitem.gift, 1);
        if (s8Var.isAttachedToWindow()) {
            this.f45002c.Q();
            this.d.Q();
        }
    }

    public final Bitmap a() {
        int i7;
        s8 s8Var = this.f45004d0;
        RectF rectF = s8Var.F;
        fi.s2 s2Var = this.f45002c;
        Bitmap n10 = s2Var.n();
        if (n10 != null && !n10.isRecycled()) {
            nh0 C = s2Var.C();
            if (C == null) {
                i7 = 0;
            } else {
                i7 = C.f37801b0;
            }
            Bitmap bitmap = this.v;
            if (bitmap != null && this.G == n10 && this.E == i7) {
                return this.f45020u;
            }
            this.G = n10;
            this.E = i7;
            if (bitmap == null) {
                this.v = Bitmap.createBitmap(288, 288, Bitmap.Config.ARGB_8888);
                this.f45022x = new Canvas(this.v);
            }
            this.v.eraseColor(0);
            rectF.set(10.0f, 10.0f, 278.0f, 278.0f);
            this.f45022x.drawBitmap(n10, (Rect) null, rectF, s8Var.E);
            if (this.C) {
                this.D = true;
            } else {
                c();
            }
            return this.f45020u;
        }
        return this.f45020u;
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
        if (this.f45023y == null) {
            this.f45023y = new int[82944];
            this.f45024z = new int[82944];
            this.A = new int[82944];
            org.telegram.messenger.r5 r5Var = ta.f45199a;
            this.B = new int[288];
        }
        this.v.getPixels(this.f45023y, 0, 288, 0, 0, 288, 288);
        this.C = true;
        this.D = false;
        if (this.f45021w == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int[] iArr = this.f45023y;
        int[] iArr2 = this.f45024z;
        int[] iArr3 = this.A;
        ?? r82 = this.B;
        if (ta.f45199a == null) {
            ta.f45199a = new org.telegram.messenger.r5("walletStickerOutline", true);
        }
        ta.f45199a.postRunnable(new di.o3(this, iArr, iArr2, iArr3, (Serializable) r82, z10, 9));
    }
}
