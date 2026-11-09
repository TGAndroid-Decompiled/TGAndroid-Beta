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
import org.telegram.ui.Components.ah0;
public final class z7 {
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
    public final String f43435a;
    public float f43436a0;
    public TL_wallet.nftItem f43437b;
    public float f43438b0;
    public final di.z2 f43439c;
    public float f43440c0;
    public final ImageReceiver d;
    public final a8 f43441d0;
    public final y7 f43442e;
    public final y7 f43443f;
    public final y7 f43444g;
    public final y7 h;
    public final y7 f43445i;
    public final y7 f43446j;
    public final y7 f43447k;
    public final y7 f43448l;
    public final y7 f43449m;
    public final y7 f43450n;
    public final y7 f43451o;
    public final y7 f43452p;
    public final y7 f43453q;
    public final y7 f43454r;
    public final y7[] f43455s;
    public final TL_stars.starGiftAttributeBackdrop f43456t;
    public Bitmap f43457u;
    public Bitmap v;
    public Bitmap f43458w;
    public Canvas f43459x;
    public int[] f43460y;
    public int[] f43461z;

    public z7(a8 a8Var, TL_wallet.nftItem nftitem) {
        org.telegram.ui.ActionBar.f2 f2Var = a8Var.f42136a;
        this.f43441d0 = a8Var;
        this.f43439c = new di.z2(this, a8Var, 6);
        this.d = new ImageReceiver(a8Var.M);
        y7 y7Var = new y7(0.0f, 900.0f, 0.86f);
        this.f43442e = y7Var;
        y7 y7Var2 = new y7(0.0f, 900.0f, 0.86f);
        this.f43443f = y7Var2;
        y7 y7Var3 = new y7(1.0f, 420.0f, 0.78f);
        this.f43444g = y7Var3;
        y7 y7Var4 = new y7(1.0f, 700.0f, 0.9f);
        this.h = y7Var4;
        y7 y7Var5 = new y7(0.0f, 700.0f, 0.9f);
        this.f43445i = y7Var5;
        y7 y7Var6 = new y7(0.0f, 380.0f, 0.82f);
        this.f43446j = y7Var6;
        y7 y7Var7 = new y7(0.0f, 30.0f, 1.0f);
        this.f43447k = y7Var7;
        y7 y7Var8 = new y7(0.0f, 520.0f, 0.62f);
        this.f43448l = y7Var8;
        y7 y7Var9 = new y7(0.0f, 300.0f, 1.0f);
        this.f43449m = y7Var9;
        y7 y7Var10 = new y7(0.0f, 150.0f, 0.82f);
        this.f43450n = y7Var10;
        y7 y7Var11 = new y7(0.0f, 150.0f, 0.82f);
        this.f43451o = y7Var11;
        y7 y7Var12 = new y7(0.0f, 240.0f, 1.0f);
        this.f43452p = y7Var12;
        y7 y7Var13 = new y7(0.0f, 700.0f, 1.0f);
        this.f43453q = y7Var13;
        y7 y7Var14 = new y7(1.0f, 260.0f, 1.0f);
        this.f43454r = y7Var14;
        this.f43455s = new y7[]{y7Var, y7Var2, y7Var3, y7Var4, y7Var5, y7Var6, y7Var7, y7Var8, y7Var9, y7Var10, y7Var11, y7Var12, y7Var13, y7Var14};
        this.E = -2;
        this.V = 1.0f;
        this.f43440c0 = 1.0f;
        this.f43437b = nftitem;
        this.f43435a = nftitem.address;
        ArrayList<TL_stars.StarGiftAttribute> arrayList = nftitem.gift.attributes;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i7);
            i7++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributeBackdrop) {
                this.f43456t = (TL_stars.starGiftAttributeBackdrop) starGiftAttribute2;
            }
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                this.d.q0(hc.b(((TL_stars.starGiftAttributePattern) starGiftAttribute2).document), "60_60_firstframe", null, null, nftitem.gift, 1);
            }
        }
        c3 c3Var = new c3(this, 5);
        di.z2 z2Var = this.f43439c;
        z2Var.f21195g1 = c3Var;
        this.d.f21195g1 = c3Var;
        z2Var.d = f2Var.getCurrentAccount();
        this.d.d = f2Var.getCurrentAccount();
        di.z2 z2Var2 = this.f43439c;
        z2Var2.f21222u0 = false;
        z2Var2.W(1);
        this.f43439c.q0(hc.b(nftitem.gift.getDocument()), "120_120_nolimit", null, null, nftitem.gift, 1);
        if (a8Var.isAttachedToWindow()) {
            this.f43439c.P();
            this.d.P();
        }
    }

    public final Bitmap a() {
        int i7;
        a8 a8Var = this.f43441d0;
        RectF rectF = a8Var.E;
        di.z2 z2Var = this.f43439c;
        Bitmap n10 = z2Var.n();
        if (n10 != null && !n10.isRecycled()) {
            ah0 B = z2Var.B();
            if (B == null) {
                i7 = 0;
            } else {
                i7 = B.f31820a0;
            }
            Bitmap bitmap = this.v;
            if (bitmap != null && this.G == n10 && this.E == i7) {
                return this.f43457u;
            }
            this.G = n10;
            this.E = i7;
            if (bitmap == null) {
                this.v = Bitmap.createBitmap(288, 288, Bitmap.Config.ARGB_8888);
                this.f43459x = new Canvas(this.v);
            }
            this.v.eraseColor(0);
            rectF.set(10.0f, 10.0f, 278.0f, 278.0f);
            this.f43459x.drawBitmap(n10, (Rect) null, rectF, a8Var.D);
            if (this.C) {
                this.D = true;
            } else {
                c();
            }
            return this.f43457u;
        }
        return this.f43457u;
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
        if (this.f43460y == null) {
            this.f43460y = new int[82944];
            this.f43461z = new int[82944];
            this.A = new int[82944];
            org.telegram.messenger.q5 q5Var = aa.f42199a;
            this.B = new int[288];
        }
        this.v.getPixels(this.f43460y, 0, 288, 0, 0, 288, 288);
        this.C = true;
        this.D = false;
        if (this.f43458w == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        int[] iArr = this.f43460y;
        int[] iArr2 = this.f43461z;
        int[] iArr3 = this.A;
        ?? r82 = this.B;
        if (aa.f42199a == null) {
            aa.f42199a = new org.telegram.messenger.q5("walletStickerOutline", true);
        }
        aa.f42199a.postRunnable(new bi.l4(this, iArr, iArr2, iArr3, (Serializable) r82, z9, 9));
    }
}
