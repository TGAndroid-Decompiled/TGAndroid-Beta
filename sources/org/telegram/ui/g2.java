package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;
public final class g2 extends FrameLayout implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.k9 {
    public boolean B;
    public int C;
    public int D;
    public TLRPC.PhotoSize E;
    public String F;
    public TLRPC.PhotoSize G;
    public String H;
    public TLRPC.Photo I;
    public final int J;
    public TL_iv.pageBlockPhoto K;
    public TLObject L;
    public TL_iv.PageBlock M;
    public boolean N;
    public MessageObject.GroupedMessagePosition O;
    public Drawable P;
    public boolean Q;
    public final p70 f34289a;
    public final l4 f34290b;
    public f3 f34291c;
    public f3 d;
    public final ImageReceiver e;
    public final RadialProgress2 f34292f;
    public final g1 h;
    public final int f34293n;
    public boolean f34294r;
    public int f34295s;
    public int v;
    public int f34296w;
    public int f34297x;
    public int f34298y;

    public g2(Context context, p70 p70Var, l4 l4Var, int i10) {
        super(context);
        this.f34289a = p70Var;
        this.f34290b = l4Var;
        setWillNotDraw(false);
        this.e = new ImageReceiver(this);
        g1 g1Var = new g1(context, p70Var, l4Var, 1);
        this.h = g1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f34292f = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.J = DownloadController.getInstance(((n4) p70Var).U).generateObserverTag();
        addView(g1Var, k7.b6.c(-2.0f, -1));
        this.f34293n = i10;
    }

    private int getIconForCurrentState() {
        int i10 = this.C;
        if (i10 == 0) {
            return 2;
        }
        if (i10 == 1) {
            return 3;
        }
        return 4;
    }

    public final void a(TL_iv.pageBlockPhoto pageblockphoto, TLObject tLObject, boolean z4, boolean z10) {
        this.M = null;
        this.K = pageblockphoto;
        this.L = tLObject;
        this.N = z4;
        this.f34294r = z10;
        this.h.setVisibility(4);
        if (!TextUtils.isEmpty(this.K.url)) {
            this.P = getResources().getDrawable(R.drawable.msg_instant_link);
        }
        TL_iv.pageBlockPhoto pageblockphoto2 = this.K;
        if (pageblockphoto2 != null) {
            TLRPC.Photo d = k4.d(pageblockphoto2.photo_id, this.L);
            if (d != null) {
                this.E = FileLoader.getClosestPhotoSizeWithSize(d.sizes, AndroidUtilities.getPhotoSize());
            } else {
                this.E = null;
            }
        } else {
            this.E = null;
        }
        b(false);
        requestLayout();
    }

    public final void b(boolean z4) {
        boolean z10;
        int i10 = ((n4) this.f34289a).U;
        String attachFileName = FileLoader.getAttachFileName(this.E);
        File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(this.E, true);
        File pathToAttach2 = FileLoader.getInstance(i10).getPathToAttach(this.E, false);
        if (!pathToAttach.exists() && (pathToAttach2 == null || !pathToAttach2.exists())) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.f34292f;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z10) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            this.C = -1;
            radialProgress2.setIcon(getIconForCurrentState(), false, z4);
        } else {
            DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, null, this);
            float f10 = 0.0f;
            if (!this.Q && !FileLoader.getInstance(i10).isLoadingFile(attachFileName)) {
                this.C = 0;
            } else {
                this.C = 1;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                if (fileProgress != null) {
                    f10 = fileProgress.floatValue();
                }
            }
            radialProgress2.setIcon(getIconForCurrentState(), true, z4);
            radialProgress2.o(f10, false);
        }
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f34291c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            arrayList.add(f3Var2);
        }
    }

    public View getChannelCell() {
        return this.h;
    }

    public TL_iv.pageBlockPhoto getCurrentBlock() {
        return this.K;
    }

    public TLObject getCurrentPage() {
        return this.L;
    }

    public ImageReceiver getImageView() {
        return this.e;
    }

    @Override
    public int getObserverTag() {
        return this.J;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e.onAttachedToWindow();
        b(false);
        f3 f3Var = this.f34291c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            f3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.onDetachedFromWindow();
        DownloadController.getInstance(((n4) this.f34289a).U).removeLoadingFileObserver(this);
        f3 f3Var = this.f34291c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            f3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.K == null) {
            return;
        }
        ImageReceiver imageReceiver = this.e;
        if (imageReceiver.hasBitmapImage() && imageReceiver.getCurrentAlpha() == 1.0f) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2(), n4.l1);
        }
        imageReceiver.draw(canvas2);
        if (imageReceiver.getVisible()) {
            this.f34292f.draw(canvas2);
        }
        if (!TextUtils.isEmpty(this.K.url) && !(this.I instanceof org.telegram.ui.web.g2)) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(35.0f);
            int imageY = (int) (imageReceiver.getImageY() + AndroidUtilities.dp(11.0f));
            this.P.setBounds(measuredWidth, imageY, AndroidUtilities.dp(24.0f) + measuredWidth, AndroidUtilities.dp(24.0f) + imageY);
            this.P.draw(canvas2);
        }
        f3 f3Var = this.f34291c;
        p70 p70Var = this.f34289a;
        int i10 = 0;
        if (f3Var != null) {
            canvas2.save();
            canvas2.translate(this.f34295s, this.v);
            n4.v(p70Var, canvas2, this, 0);
            this.f34291c.draw(canvas2, this);
            canvas2.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas2.save();
            canvas2.translate(this.f34295s, this.v + this.f34296w);
            n4.v(p70Var, canvas2, this, i10);
            this.d.draw(canvas2, this);
            canvas2.restore();
        }
        n4.u(canvas2, p70Var, this.K, getMeasuredHeight());
    }

    @Override
    public final void onFailedDownload(String str, boolean z4) {
        b(false);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.AttachPhoto));
        if (this.f34291c != null) {
            sb.append(", ");
            sb.append(this.f34291c.d.getText());
        }
        accessibilityNodeInfo.setText(sb.toString());
    }

    @Override
    public final void onMeasure(int r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g2.onMeasure(int, int):void");
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f34292f.o(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
        if (this.C != 1) {
            b(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f34292f.o(1.0f, true);
        b(true);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setParentBlock(TL_iv.PageBlock pageBlock) {
        TL_iv.pageBlockChannel pageblockchannel;
        this.M = pageBlock;
        l4 l4Var = this.f34290b;
        if (l4Var != null && (pageblockchannel = l4Var.C) != null && (pageBlock instanceof TL_iv.pageBlockCover)) {
            g1 g1Var = this.h;
            g1Var.setBlock(pageblockchannel);
            g1Var.setVisibility(0);
        }
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}
