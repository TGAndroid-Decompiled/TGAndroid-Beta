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
import org.telegram.ui.Components.xj0;
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
    public final String f35155a;
    public float f35156a0;
    public TL_wallet.nftItem f35157b;
    public float f35158b0;
    public final ci.f3 f35159c;
    public float f35160c0;
    public final ImageReceiver d;
    public final t7 f35161d0;
    public final r7 e;
    public final r7 f35162f;
    public final r7 f35163g;
    public final r7 h;
    public final r7 f35164i;
    public final r7 f35165j;
    public final r7 f35166k;
    public final r7 f35167l;
    public final r7 f35168m;
    public final r7 f35169n;
    public final r7 f35170o;
    public final r7 f35171p;
    public final r7 f35172q;
    public final r7 f35173r;
    public final r7[] f35174s;
    public final TL_stars.starGiftAttributeBackdrop f35175t;
    public Bitmap f35176u;
    public Bitmap v;
    public Bitmap f35177w;
    public Canvas f35178x;
    public int[] f35179y;
    public int[] f35180z;

    public s7(t7 t7Var, TL_wallet.nftItem nftitem) {
        org.telegram.ui.ActionBar.o2 o2Var = t7Var.f35220a;
        this.f35161d0 = t7Var;
        this.f35159c = new ci.f3(this, t7Var, 6);
        this.d = new ImageReceiver(t7Var.M);
        r7 r7Var = new r7(0.0f, 900.0f, 0.86f);
        this.e = r7Var;
        r7 r7Var2 = new r7(0.0f, 900.0f, 0.86f);
        this.f35162f = r7Var2;
        r7 r7Var3 = new r7(1.0f, 420.0f, 0.78f);
        this.f35163g = r7Var3;
        r7 r7Var4 = new r7(1.0f, 700.0f, 0.9f);
        this.h = r7Var4;
        r7 r7Var5 = new r7(0.0f, 700.0f, 0.9f);
        this.f35164i = r7Var5;
        r7 r7Var6 = new r7(0.0f, 380.0f, 0.82f);
        this.f35165j = r7Var6;
        r7 r7Var7 = new r7(0.0f, 30.0f, 1.0f);
        this.f35166k = r7Var7;
        r7 r7Var8 = new r7(0.0f, 520.0f, 0.62f);
        this.f35167l = r7Var8;
        r7 r7Var9 = new r7(0.0f, 300.0f, 1.0f);
        this.f35168m = r7Var9;
        r7 r7Var10 = new r7(0.0f, 150.0f, 0.82f);
        this.f35169n = r7Var10;
        r7 r7Var11 = new r7(0.0f, 150.0f, 0.82f);
        this.f35170o = r7Var11;
        r7 r7Var12 = new r7(0.0f, 240.0f, 1.0f);
        this.f35171p = r7Var12;
        r7 r7Var13 = new r7(0.0f, 700.0f, 1.0f);
        this.f35172q = r7Var13;
        r7 r7Var14 = new r7(1.0f, 260.0f, 1.0f);
        this.f35173r = r7Var14;
        this.f35174s = new r7[]{r7Var, r7Var2, r7Var3, r7Var4, r7Var5, r7Var6, r7Var7, r7Var8, r7Var9, r7Var10, r7Var11, r7Var12, r7Var13, r7Var14};
        this.E = -2;
        this.V = 1.0f;
        this.f35160c0 = 1.0f;
        this.f35157b = nftitem;
        this.f35155a = nftitem.address;
        ArrayList<TL_stars.StarGiftAttribute> arrayList = nftitem.gift.attributes;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i10);
            i10++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributeBackdrop) {
                this.f35175t = (TL_stars.starGiftAttributeBackdrop) starGiftAttribute2;
            }
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                this.d.setImage(ImageLocation.getForDocument(((TL_stars.starGiftAttributePattern) starGiftAttribute2).document), "60_60_firstframe", null, null, nftitem.gift, 1);
            }
        }
        n2 n2Var = new n2(this, 5);
        this.f35159c.setDelegate(n2Var);
        this.d.setDelegate(n2Var);
        this.f35159c.setCurrentAccount(o2Var.getCurrentAccount());
        this.d.setCurrentAccount(o2Var.getCurrentAccount());
        this.f35159c.setAllowStartLottieAnimation(false);
        this.f35159c.setAutoRepeat(1);
        this.f35159c.setImage(ImageLocation.getForDocument(nftitem.gift.getDocument()), "120_120_nolimit", null, null, nftitem.gift, 1);
        if (t7Var.isAttachedToWindow()) {
            this.f35159c.onAttachedToWindow();
            this.d.onAttachedToWindow();
        }
    }

    public final Bitmap a() {
        int i10;
        t7 t7Var = this.f35161d0;
        RectF rectF = t7Var.E;
        ci.f3 f3Var = this.f35159c;
        Bitmap bitmap = f3Var.getBitmap();
        if (bitmap != null && !bitmap.isRecycled()) {
            xj0 lottieAnimation = f3Var.getLottieAnimation();
            if (lottieAnimation == null) {
                i10 = 0;
            } else {
                i10 = lottieAnimation.f32594a0;
            }
            Bitmap bitmap2 = this.v;
            if (bitmap2 != null && this.G == bitmap && this.E == i10) {
                return this.f35176u;
            }
            this.G = bitmap;
            this.E = i10;
            if (bitmap2 == null) {
                this.v = Bitmap.createBitmap(288, 288, Bitmap.Config.ARGB_8888);
                this.f35178x = new Canvas(this.v);
            }
            this.v.eraseColor(0);
            rectF.set(10.0f, 10.0f, 278.0f, 278.0f);
            this.f35178x.drawBitmap(bitmap, (Rect) null, rectF, t7Var.f35275y);
            if (this.C) {
                this.D = true;
            } else {
                c();
            }
            return this.f35176u;
        }
        return this.f35176u;
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
        if (this.f35179y == null) {
            this.f35179y = new int[82944];
            this.f35180z = new int[82944];
            this.A = new int[82944];
            DispatchQueue dispatchQueue = x9.f35425a;
            this.B = new int[288];
        }
        this.v.getPixels(this.f35179y, 0, 288, 0, 0, 288, 288);
        this.C = true;
        this.D = false;
        if (this.f35177w == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int[] iArr = this.f35179y;
        int[] iArr2 = this.f35180z;
        int[] iArr3 = this.A;
        ?? r82 = this.B;
        if (x9.f35425a == null) {
            x9.f35425a = new DispatchQueue("walletStickerOutline");
        }
        x9.f35425a.postRunnable(new ai.p4(this, iArr, iArr2, iArr3, (Serializable) r82, z10, 13));
    }
}
