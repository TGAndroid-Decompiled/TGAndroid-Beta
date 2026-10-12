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
public final class f2 extends FrameLayout implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.n9 {
    public boolean E;
    public int F;
    public int G;
    public TLRPC.PhotoSize H;
    public String I;
    public TLRPC.PhotoSize J;
    public String K;
    public TLRPC.Photo L;
    public final int M;
    public TL_iv.pageBlockPhoto N;
    public TLObject O;
    public TL_iv.PageBlock P;
    public boolean Q;
    public MessageObject.GroupedMessagePosition R;
    public Drawable S;
    public boolean T;
    public final z70 f35712a;
    public final i4 f35713b;
    public d3 f35714c;
    public d3 d;
    public final ImageReceiver e;
    public final RadialProgress2 f35715f;
    public final f1 h;
    public final int f35716n;
    public boolean f35717r;
    public int f35718s;
    public int v;
    public int f35719w;
    public int f35720x;
    public int f35721y;

    public f2(Context context, z70 z70Var, i4 i4Var, int i10) {
        super(context);
        this.f35712a = z70Var;
        this.f35713b = i4Var;
        setWillNotDraw(false);
        this.e = new ImageReceiver(this);
        f1 f1Var = new f1(context, z70Var, i4Var, 1);
        this.h = f1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f35715f = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.M = DownloadController.getInstance(((k4) z70Var).X).generateObserverTag();
        addView(f1Var, w7.a6.d(-2.0f, -1));
        this.f35716n = i10;
    }

    private int getIconForCurrentState() {
        int i10 = this.F;
        if (i10 == 0) {
            return 2;
        }
        if (i10 == 1) {
            return 3;
        }
        return 4;
    }

    public final void a(TL_iv.pageBlockPhoto pageblockphoto, TLObject tLObject, boolean z10, boolean z11) {
        this.P = null;
        this.N = pageblockphoto;
        this.O = tLObject;
        this.Q = z10;
        this.f35717r = z11;
        this.h.setVisibility(4);
        if (!TextUtils.isEmpty(this.N.url)) {
            this.S = getResources().getDrawable(R.drawable.msg_instant_link);
        }
        TL_iv.pageBlockPhoto pageblockphoto2 = this.N;
        if (pageblockphoto2 != null) {
            TLRPC.Photo d = h4.d(pageblockphoto2.photo_id, this.O);
            if (d != null) {
                this.H = FileLoader.getClosestPhotoSizeWithSize(d.sizes, AndroidUtilities.getPhotoSize());
            } else {
                this.H = null;
            }
        } else {
            this.H = null;
        }
        b(false);
        requestLayout();
    }

    public final void b(boolean z10) {
        boolean z11;
        int i10 = ((k4) this.f35712a).X;
        String attachFileName = FileLoader.getAttachFileName(this.H);
        File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(this.H, true);
        File pathToAttach2 = FileLoader.getInstance(i10).getPathToAttach(this.H, false);
        if (!pathToAttach.exists() && (pathToAttach2 == null || !pathToAttach2.exists())) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.f35715f;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z11) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            this.F = -1;
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, null, this);
            float f7 = 0.0f;
            if (!this.T && !FileLoader.getInstance(i10).isLoadingFile(attachFileName)) {
                this.F = 0;
            } else {
                this.F = 1;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                if (fileProgress != null) {
                    f7 = fileProgress.floatValue();
                }
            }
            radialProgress2.setIcon(getIconForCurrentState(), true, z10);
            radialProgress2.o(f7, false);
        }
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f35714c;
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
        return this.N;
    }

    public TLObject getCurrentPage() {
        return this.O;
    }

    public ImageReceiver getImageView() {
        return this.e;
    }

    @Override
    public int getObserverTag() {
        return this.M;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e.onAttachedToWindow();
        b(false);
        d3 d3Var = this.f35714c;
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
        this.e.onDetachedFromWindow();
        DownloadController.getInstance(((k4) this.f35712a).X).removeLoadingFileObserver(this);
        d3 d3Var = this.f35714c;
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
        if (this.N == null) {
            return;
        }
        ImageReceiver imageReceiver = this.e;
        if (imageReceiver.hasBitmapImage() && imageReceiver.getCurrentAlpha() == 1.0f) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2(), k4.f37525o1);
        }
        imageReceiver.draw(canvas2);
        if (imageReceiver.getVisible()) {
            this.f35715f.draw(canvas2);
        }
        if (!TextUtils.isEmpty(this.N.url) && !(this.L instanceof org.telegram.ui.web.g2)) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(35.0f);
            int imageY = (int) (imageReceiver.getImageY() + AndroidUtilities.dp(11.0f));
            this.S.setBounds(measuredWidth, imageY, AndroidUtilities.dp(24.0f) + measuredWidth, AndroidUtilities.dp(24.0f) + imageY);
            this.S.draw(canvas2);
        }
        d3 d3Var = this.f35714c;
        z70 z70Var = this.f35712a;
        int i10 = 0;
        if (d3Var != null) {
            canvas2.save();
            canvas2.translate(this.f35718s, this.v);
            k4.v(z70Var, canvas2, this, 0);
            this.f35714c.draw(canvas2, this);
            canvas2.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas2.save();
            canvas2.translate(this.f35718s, this.v + this.f35719w);
            k4.v(z70Var, canvas2, this, i10);
            this.d.draw(canvas2, this);
            canvas2.restore();
        }
        k4.u(canvas2, z70Var, this.N, getMeasuredHeight());
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        b(false);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AttachPhoto));
        if (this.f35714c != null) {
            sb2.append(", ");
            sb2.append(this.f35714c.d.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
    }

    @Override
    public final void onMeasure(int r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f2.onMeasure(int, int):void");
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f35715f.o(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
        if (this.F != 1) {
            b(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f35715f.o(1.0f, true);
        b(true);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setParentBlock(TL_iv.PageBlock pageBlock) {
        TL_iv.pageBlockChannel pageblockchannel;
        this.P = pageBlock;
        i4 i4Var = this.f35713b;
        if (i4Var != null && (pageblockchannel = i4Var.F) != null && (pageBlock instanceof TL_iv.pageBlockCover)) {
            f1 f1Var = this.h;
            f1Var.setBlock(pageblockchannel);
            f1Var.setVisibility(0);
        }
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
