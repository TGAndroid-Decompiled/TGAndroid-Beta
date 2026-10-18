package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.uj0;
public final class y7 {
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
    public final String f35133a;
    public float f35134a0;
    public TL_wallet.nftItem f35135b;
    public float f35136b0;
    public final ci.g3 f35137c;
    public float f35138c0;
    public final ImageReceiver d;
    public final z7 f35139d0;
    public final x7 e;
    public final x7 f35140f;
    public final x7 f35141g;
    public final x7 h;
    public final x7 f35142i;
    public final x7 f35143j;
    public final x7 f35144k;
    public final x7 f35145l;
    public final x7 f35146m;
    public final x7 f35147n;
    public final x7 f35148o;
    public final x7 f35149p;
    public final x7 f35150q;
    public final x7 f35151r;
    public final x7[] f35152s;
    public final TL_stars.starGiftAttributeBackdrop f35153t;
    public Bitmap f35154u;
    public Bitmap v;
    public Bitmap f35155w;
    public Canvas f35156x;
    public int[] f35157y;
    public int[] f35158z;

    public y7(z7 z7Var, TL_wallet.nftItem nftitem) {
        org.telegram.ui.ActionBar.n2 n2Var = z7Var.f35178a;
        this.f35139d0 = z7Var;
        this.f35137c = new ci.g3(this, z7Var, 6);
        this.d = new ImageReceiver(z7Var.M);
        x7 x7Var = new x7(0.0f, 900.0f, 0.86f);
        this.e = x7Var;
        x7 x7Var2 = new x7(0.0f, 900.0f, 0.86f);
        this.f35140f = x7Var2;
        x7 x7Var3 = new x7(1.0f, 420.0f, 0.78f);
        this.f35141g = x7Var3;
        x7 x7Var4 = new x7(1.0f, 700.0f, 0.9f);
        this.h = x7Var4;
        x7 x7Var5 = new x7(0.0f, 700.0f, 0.9f);
        this.f35142i = x7Var5;
        x7 x7Var6 = new x7(0.0f, 380.0f, 0.82f);
        this.f35143j = x7Var6;
        x7 x7Var7 = new x7(0.0f, 30.0f, 1.0f);
        this.f35144k = x7Var7;
        x7 x7Var8 = new x7(0.0f, 520.0f, 0.62f);
        this.f35145l = x7Var8;
        x7 x7Var9 = new x7(0.0f, 300.0f, 1.0f);
        this.f35146m = x7Var9;
        x7 x7Var10 = new x7(0.0f, 150.0f, 0.82f);
        this.f35147n = x7Var10;
        x7 x7Var11 = new x7(0.0f, 150.0f, 0.82f);
        this.f35148o = x7Var11;
        x7 x7Var12 = new x7(0.0f, 240.0f, 1.0f);
        this.f35149p = x7Var12;
        x7 x7Var13 = new x7(0.0f, 700.0f, 1.0f);
        this.f35150q = x7Var13;
        x7 x7Var14 = new x7(1.0f, 260.0f, 1.0f);
        this.f35151r = x7Var14;
        this.f35152s = new x7[]{x7Var, x7Var2, x7Var3, x7Var4, x7Var5, x7Var6, x7Var7, x7Var8, x7Var9, x7Var10, x7Var11, x7Var12, x7Var13, x7Var14};
        this.E = -2;
        this.V = 1.0f;
        this.f35138c0 = 1.0f;
        this.f35135b = nftitem;
        this.f35133a = nftitem.address;
        ArrayList<TL_stars.StarGiftAttribute> arrayList = nftitem.gift.attributes;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i10);
            i10++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributeBackdrop) {
                this.f35153t = (TL_stars.starGiftAttributeBackdrop) starGiftAttribute2;
            }
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                this.d.setImage(ImageLocation.getForDocument(((TL_stars.starGiftAttributePattern) starGiftAttribute2).document), "60_60_firstframe", null, null, nftitem.gift, 1);
            }
        }
        o2 o2Var = new o2(this, 5);
        this.f35137c.setDelegate(o2Var);
        this.d.setDelegate(o2Var);
        this.f35137c.setCurrentAccount(n2Var.getCurrentAccount());
        this.d.setCurrentAccount(n2Var.getCurrentAccount());
        this.f35137c.setAllowStartLottieAnimation(false);
        this.f35137c.setAutoRepeat(1);
        this.f35137c.setImage(ImageLocation.getForDocument(nftitem.gift.getDocument()), "120_120_nolimit", null, null, nftitem.gift, 1);
        if (z7Var.isAttachedToWindow()) {
            this.f35137c.onAttachedToWindow();
            this.d.onAttachedToWindow();
        }
    }

    public final Bitmap a() {
        int i10;
        z7 z7Var = this.f35139d0;
        RectF rectF = z7Var.E;
        ci.g3 g3Var = this.f35137c;
        Bitmap bitmap = g3Var.getBitmap();
        if (bitmap != null && !bitmap.isRecycled()) {
            uj0 lottieAnimation = g3Var.getLottieAnimation();
            if (lottieAnimation == null) {
                i10 = 0;
            } else {
                i10 = lottieAnimation.f31008a0;
            }
            Bitmap bitmap2 = this.v;
            if (bitmap2 != null && this.G == bitmap && this.E == i10) {
                return this.f35154u;
            }
            this.G = bitmap;
            this.E = i10;
            if (bitmap2 == null) {
                this.v = Bitmap.createBitmap(288, 288, Bitmap.Config.ARGB_8888);
                this.f35156x = new Canvas(this.v);
            }
            this.v.eraseColor(0);
            rectF.set(10.0f, 10.0f, 278.0f, 278.0f);
            this.f35156x.drawBitmap(bitmap, (Rect) null, rectF, z7Var.f35233y);
            if (this.C) {
                this.D = true;
            } else {
                c();
            }
            return this.f35154u;
        }
        return this.f35154u;
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
        if (this.f35157y == null) {
            this.f35157y = new int[82944];
            this.f35158z = new int[82944];
            this.A = new int[82944];
            this.B = new int[945];
        }
        this.v.getPixels(this.f35157y, 0, 288, 0, 0, 288, 288);
        this.C = true;
        this.D = false;
        if (this.f35155w == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int[] iArr = this.f35157y;
        int[] iArr2 = this.f35158z;
        int[] iArr3 = this.A;
        ?? r82 = this.B;
        if (w7.k6.f48774a == null) {
            w7.k6.f48774a = new DispatchQueue("walletStickerOutline");
        }
        w7.k6.f48774a.postRunnable(new ai.m4(this, iArr, iArr2, iArr3, (Serializable) r82, z10, 13));
    }
}
