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
import org.telegram.ui.Components.vj0;
public final class s7 {
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
    public final String f34868a;
    public float f34869a0;
    public TL_wallet.nftItem f34870b;
    public float f34871b0;
    public final ci.g3 f34872c;
    public float f34873c0;
    public final ImageReceiver d;
    public final t7 f34874d0;
    public final r7 e;
    public final r7 f34875f;
    public final r7 f34876g;
    public final r7 h;
    public final r7 f34877i;
    public final r7 f34878j;
    public final r7 f34879k;
    public final r7 f34880l;
    public final r7 f34881m;
    public final r7 f34882n;
    public final r7 f34883o;
    public final r7 f34884p;
    public final r7 f34885q;
    public final r7 f34886r;
    public final r7[] f34887s;
    public final TL_stars.starGiftAttributeBackdrop f34888t;
    public Bitmap f34889u;
    public Bitmap v;
    public Bitmap f34890w;
    public Canvas f34891x;
    public int[] f34892y;
    public int[] f34893z;

    public s7(t7 t7Var, TL_wallet.nftItem nftitem) {
        org.telegram.ui.ActionBar.n2 n2Var = t7Var.f34915a;
        this.f34874d0 = t7Var;
        this.f34872c = new ci.g3(this, t7Var, 6);
        this.d = new ImageReceiver(t7Var.M);
        r7 r7Var = new r7(0.0f, 900.0f, 0.86f);
        this.e = r7Var;
        r7 r7Var2 = new r7(0.0f, 900.0f, 0.86f);
        this.f34875f = r7Var2;
        r7 r7Var3 = new r7(1.0f, 420.0f, 0.78f);
        this.f34876g = r7Var3;
        r7 r7Var4 = new r7(1.0f, 700.0f, 0.9f);
        this.h = r7Var4;
        r7 r7Var5 = new r7(0.0f, 700.0f, 0.9f);
        this.f34877i = r7Var5;
        r7 r7Var6 = new r7(0.0f, 380.0f, 0.82f);
        this.f34878j = r7Var6;
        r7 r7Var7 = new r7(0.0f, 30.0f, 1.0f);
        this.f34879k = r7Var7;
        r7 r7Var8 = new r7(0.0f, 520.0f, 0.62f);
        this.f34880l = r7Var8;
        r7 r7Var9 = new r7(0.0f, 300.0f, 1.0f);
        this.f34881m = r7Var9;
        r7 r7Var10 = new r7(0.0f, 150.0f, 0.82f);
        this.f34882n = r7Var10;
        r7 r7Var11 = new r7(0.0f, 150.0f, 0.82f);
        this.f34883o = r7Var11;
        r7 r7Var12 = new r7(0.0f, 240.0f, 1.0f);
        this.f34884p = r7Var12;
        r7 r7Var13 = new r7(0.0f, 700.0f, 1.0f);
        this.f34885q = r7Var13;
        r7 r7Var14 = new r7(1.0f, 260.0f, 1.0f);
        this.f34886r = r7Var14;
        this.f34887s = new r7[]{r7Var, r7Var2, r7Var3, r7Var4, r7Var5, r7Var6, r7Var7, r7Var8, r7Var9, r7Var10, r7Var11, r7Var12, r7Var13, r7Var14};
        this.E = -2;
        this.V = 1.0f;
        this.f34873c0 = 1.0f;
        this.f34870b = nftitem;
        this.f34868a = nftitem.address;
        ArrayList<TL_stars.StarGiftAttribute> arrayList = nftitem.gift.attributes;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i10);
            i10++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributeBackdrop) {
                this.f34888t = (TL_stars.starGiftAttributeBackdrop) starGiftAttribute2;
            }
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                this.d.setImage(ImageLocation.getForDocument(((TL_stars.starGiftAttributePattern) starGiftAttribute2).document), "60_60_firstframe", null, null, nftitem.gift, 1);
            }
        }
        o2 o2Var = new o2(this, 5);
        this.f34872c.setDelegate(o2Var);
        this.d.setDelegate(o2Var);
        this.f34872c.setCurrentAccount(n2Var.getCurrentAccount());
        this.d.setCurrentAccount(n2Var.getCurrentAccount());
        this.f34872c.setAllowStartLottieAnimation(false);
        this.f34872c.setAutoRepeat(1);
        this.f34872c.setImage(ImageLocation.getForDocument(nftitem.gift.getDocument()), "120_120_nolimit", null, null, nftitem.gift, 1);
        if (t7Var.isAttachedToWindow()) {
            this.f34872c.onAttachedToWindow();
            this.d.onAttachedToWindow();
        }
    }

    public final Bitmap a() {
        int i10;
        t7 t7Var = this.f34874d0;
        RectF rectF = t7Var.E;
        ci.g3 g3Var = this.f34872c;
        Bitmap bitmap = g3Var.getBitmap();
        if (bitmap != null && !bitmap.isRecycled()) {
            vj0 lottieAnimation = g3Var.getLottieAnimation();
            if (lottieAnimation == null) {
                i10 = 0;
            } else {
                i10 = lottieAnimation.f31268a0;
            }
            Bitmap bitmap2 = this.v;
            if (bitmap2 != null && this.G == bitmap && this.E == i10) {
                return this.f34889u;
            }
            this.G = bitmap;
            this.E = i10;
            if (bitmap2 == null) {
                this.v = Bitmap.createBitmap(288, 288, Bitmap.Config.ARGB_8888);
                this.f34891x = new Canvas(this.v);
            }
            this.v.eraseColor(0);
            rectF.set(10.0f, 10.0f, 278.0f, 278.0f);
            this.f34891x.drawBitmap(bitmap, (Rect) null, rectF, t7Var.f34970y);
            if (this.C) {
                this.D = true;
            } else {
                c();
            }
            return this.f34889u;
        }
        return this.f34889u;
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
        if (this.f34892y == null) {
            this.f34892y = new int[82944];
            this.f34893z = new int[82944];
            this.A = new int[82944];
            DispatchQueue dispatchQueue = w9.f35083a;
            this.B = new int[288];
        }
        this.v.getPixels(this.f34892y, 0, 288, 0, 0, 288, 288);
        this.C = true;
        this.D = false;
        if (this.f34890w == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int[] iArr = this.f34892y;
        int[] iArr2 = this.f34893z;
        int[] iArr3 = this.A;
        ?? r82 = this.B;
        if (w9.f35083a == null) {
            w9.f35083a = new DispatchQueue("walletStickerOutline");
        }
        w9.f35083a.postRunnable(new ai.p4(this, iArr, iArr2, iArr3, (Serializable) r82, z10, 13));
    }
}
