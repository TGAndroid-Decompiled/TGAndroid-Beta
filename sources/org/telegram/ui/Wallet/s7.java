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
import org.telegram.ui.Components.yj0;
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
    public final String f37248a;
    public float f37249a0;
    public TL_wallet.nftItem f37250b;
    public float f37251b0;
    public final di.f3 f37252c;
    public float f37253c0;
    public final ImageReceiver d;
    public final t7 f37254d0;
    public final r7 e;
    public final r7 f37255f;
    public final r7 f37256g;
    public final r7 h;
    public final r7 f37257i;
    public final r7 f37258j;
    public final r7 f37259k;
    public final r7 f37260l;
    public final r7 f37261m;
    public final r7 f37262n;
    public final r7 f37263o;
    public final r7 f37264p;
    public final r7 f37265q;
    public final r7 f37266r;
    public final r7[] f37267s;
    public final TL_stars.starGiftAttributeBackdrop f37268t;
    public Bitmap f37269u;
    public Bitmap v;
    public Bitmap f37270w;
    public Canvas f37271x;
    public int[] f37272y;
    public int[] f37273z;

    public s7(t7 t7Var, TL_wallet.nftItem nftitem) {
        org.telegram.ui.ActionBar.r2 r2Var = t7Var.f37299a;
        this.f37254d0 = t7Var;
        this.f37252c = new di.f3(this, t7Var, 6);
        this.d = new ImageReceiver(t7Var.M);
        r7 r7Var = new r7(0.0f, 900.0f, 0.86f);
        this.e = r7Var;
        r7 r7Var2 = new r7(0.0f, 900.0f, 0.86f);
        this.f37255f = r7Var2;
        r7 r7Var3 = new r7(1.0f, 420.0f, 0.78f);
        this.f37256g = r7Var3;
        r7 r7Var4 = new r7(1.0f, 700.0f, 0.9f);
        this.h = r7Var4;
        r7 r7Var5 = new r7(0.0f, 700.0f, 0.9f);
        this.f37257i = r7Var5;
        r7 r7Var6 = new r7(0.0f, 380.0f, 0.82f);
        this.f37258j = r7Var6;
        r7 r7Var7 = new r7(0.0f, 30.0f, 1.0f);
        this.f37259k = r7Var7;
        r7 r7Var8 = new r7(0.0f, 520.0f, 0.62f);
        this.f37260l = r7Var8;
        r7 r7Var9 = new r7(0.0f, 300.0f, 1.0f);
        this.f37261m = r7Var9;
        r7 r7Var10 = new r7(0.0f, 150.0f, 0.82f);
        this.f37262n = r7Var10;
        r7 r7Var11 = new r7(0.0f, 150.0f, 0.82f);
        this.f37263o = r7Var11;
        r7 r7Var12 = new r7(0.0f, 240.0f, 1.0f);
        this.f37264p = r7Var12;
        r7 r7Var13 = new r7(0.0f, 700.0f, 1.0f);
        this.f37265q = r7Var13;
        r7 r7Var14 = new r7(1.0f, 260.0f, 1.0f);
        this.f37266r = r7Var14;
        this.f37267s = new r7[]{r7Var, r7Var2, r7Var3, r7Var4, r7Var5, r7Var6, r7Var7, r7Var8, r7Var9, r7Var10, r7Var11, r7Var12, r7Var13, r7Var14};
        this.E = -2;
        this.V = 1.0f;
        this.f37253c0 = 1.0f;
        this.f37250b = nftitem;
        this.f37248a = nftitem.address;
        ArrayList<TL_stars.StarGiftAttribute> arrayList = nftitem.gift.attributes;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i10);
            i10++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributeBackdrop) {
                this.f37268t = (TL_stars.starGiftAttributeBackdrop) starGiftAttribute2;
            }
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                this.d.setImage(ImageLocation.getForDocument(((TL_stars.starGiftAttributePattern) starGiftAttribute2).document), "60_60_firstframe", null, null, nftitem.gift, 1);
            }
        }
        n2 n2Var = new n2(this, 5);
        this.f37252c.setDelegate(n2Var);
        this.d.setDelegate(n2Var);
        this.f37252c.setCurrentAccount(r2Var.getCurrentAccount());
        this.d.setCurrentAccount(r2Var.getCurrentAccount());
        this.f37252c.setAllowStartLottieAnimation(false);
        this.f37252c.setAutoRepeat(1);
        this.f37252c.setImage(ImageLocation.getForDocument(nftitem.gift.getDocument()), "120_120_nolimit", null, null, nftitem.gift, 1);
        if (t7Var.isAttachedToWindow()) {
            this.f37252c.onAttachedToWindow();
            this.d.onAttachedToWindow();
        }
    }

    public final Bitmap a() {
        int i10;
        t7 t7Var = this.f37254d0;
        RectF rectF = t7Var.E;
        di.f3 f3Var = this.f37252c;
        Bitmap bitmap = f3Var.getBitmap();
        if (bitmap != null && !bitmap.isRecycled()) {
            yj0 lottieAnimation = f3Var.getLottieAnimation();
            if (lottieAnimation == null) {
                i10 = 0;
            } else {
                i10 = lottieAnimation.f35067a0;
            }
            Bitmap bitmap2 = this.v;
            if (bitmap2 != null && this.G == bitmap && this.E == i10) {
                return this.f37269u;
            }
            this.G = bitmap;
            this.E = i10;
            if (bitmap2 == null) {
                this.v = Bitmap.createBitmap(288, 288, Bitmap.Config.ARGB_8888);
                this.f37271x = new Canvas(this.v);
            }
            this.v.eraseColor(0);
            rectF.set(10.0f, 10.0f, 278.0f, 278.0f);
            this.f37271x.drawBitmap(bitmap, (Rect) null, rectF, t7Var.f37354y);
            if (this.C) {
                this.D = true;
            } else {
                c();
            }
            return this.f37269u;
        }
        return this.f37269u;
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
        if (this.f37272y == null) {
            this.f37272y = new int[82944];
            this.f37273z = new int[82944];
            this.A = new int[82944];
            DispatchQueue dispatchQueue = w9.f37476a;
            this.B = new int[288];
        }
        this.v.getPixels(this.f37272y, 0, 288, 0, 0, 288, 288);
        this.C = true;
        this.D = false;
        if (this.f37270w == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int[] iArr = this.f37272y;
        int[] iArr2 = this.f37273z;
        int[] iArr3 = this.A;
        ?? r82 = this.B;
        if (w9.f37476a == null) {
            w9.f37476a = new DispatchQueue("walletStickerOutline");
        }
        w9.f37476a.postRunnable(new bi.k4(this, iArr, iArr2, iArr3, (Serializable) r82, z10, 13));
    }
}
