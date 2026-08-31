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
public final class e2 extends FrameLayout implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.l9 {
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
    public final o70 f36371a;
    public final j4 f36372b;
    public d3 f36373c;
    public d3 d;
    public final ImageReceiver f36374e;
    public final RadialProgress2 f36375f;
    public final e1 h;
    public final int f36376n;
    public boolean f36377r;
    public int f36378s;
    public int v;
    public int f36379w;
    public int f36380x;
    public int f36381y;

    public e2(Context context, o70 o70Var, j4 j4Var, int i10) {
        super(context);
        this.f36371a = o70Var;
        this.f36372b = j4Var;
        setWillNotDraw(false);
        this.f36374e = new ImageReceiver(this);
        e1 e1Var = new e1(context, o70Var, j4Var, 1);
        this.h = e1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f36375f = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.J = DownloadController.getInstance(((l4) o70Var).U).generateObserverTag();
        addView(e1Var, k7.c6.c(-2.0f, -1));
        this.f36376n = i10;
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
        this.f36377r = z10;
        this.h.setVisibility(4);
        if (!TextUtils.isEmpty(this.K.url)) {
            this.P = getResources().getDrawable(R.drawable.msg_instant_link);
        }
        TL_iv.pageBlockPhoto pageblockphoto2 = this.K;
        if (pageblockphoto2 != null) {
            TLRPC.Photo d = i4.d(pageblockphoto2.photo_id, this.L);
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
        int i10 = ((l4) this.f36371a).U;
        String attachFileName = FileLoader.getAttachFileName(this.E);
        File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(this.E, true);
        File pathToAttach2 = FileLoader.getInstance(i10).getPathToAttach(this.E, false);
        if (!pathToAttach.exists() && (pathToAttach2 == null || !pathToAttach2.exists())) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.f36375f;
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
        d3 d3Var = this.f36373c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            arrayList.add(d3Var2);
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
        return this.f36374e;
    }

    @Override
    public int getObserverTag() {
        return this.J;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36374e.onAttachedToWindow();
        b(false);
        d3 d3Var = this.f36373c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            d3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f36374e.onDetachedFromWindow();
        DownloadController.getInstance(((l4) this.f36371a).U).removeLoadingFileObserver(this);
        d3 d3Var = this.f36373c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            d3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.K == null) {
            return;
        }
        ImageReceiver imageReceiver = this.f36374e;
        if (imageReceiver.hasBitmapImage() && imageReceiver.getCurrentAlpha() == 1.0f) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2(), l4.l1);
        }
        imageReceiver.draw(canvas2);
        if (imageReceiver.getVisible()) {
            this.f36375f.draw(canvas2);
        }
        if (!TextUtils.isEmpty(this.K.url) && !(this.I instanceof org.telegram.ui.web.g2)) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(35.0f);
            int imageY = (int) (imageReceiver.getImageY() + AndroidUtilities.dp(11.0f));
            this.P.setBounds(measuredWidth, imageY, AndroidUtilities.dp(24.0f) + measuredWidth, AndroidUtilities.dp(24.0f) + imageY);
            this.P.draw(canvas2);
        }
        d3 d3Var = this.f36373c;
        o70 o70Var = this.f36371a;
        int i10 = 0;
        if (d3Var != null) {
            canvas2.save();
            canvas2.translate(this.f36378s, this.v);
            l4.v(o70Var, canvas2, this, 0);
            this.f36373c.draw(canvas2, this);
            canvas2.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas2.save();
            canvas2.translate(this.f36378s, this.v + this.f36379w);
            l4.v(o70Var, canvas2, this, i10);
            this.d.draw(canvas2, this);
            canvas2.restore();
        }
        l4.u(canvas2, o70Var, this.K, getMeasuredHeight());
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
        if (this.f36373c != null) {
            sb.append(", ");
            sb.append(this.f36373c.d.getText());
        }
        accessibilityNodeInfo.setText(sb.toString());
    }

    @Override
    public final void onMeasure(int r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e2.onMeasure(int, int):void");
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f36375f.o(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
        if (this.C != 1) {
            b(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f36375f.o(1.0f, true);
        b(true);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setParentBlock(TL_iv.PageBlock pageBlock) {
        TL_iv.pageBlockChannel pageblockchannel;
        this.M = pageBlock;
        j4 j4Var = this.f36372b;
        if (j4Var != null && (pageblockchannel = j4Var.C) != null && (pageBlock instanceof TL_iv.pageBlockCover)) {
            e1 e1Var = this.h;
            e1Var.setBlock(pageblockchannel);
            e1Var.setVisibility(0);
        }
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}
