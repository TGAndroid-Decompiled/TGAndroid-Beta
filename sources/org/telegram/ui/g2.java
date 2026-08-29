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
public final class g2 extends FrameLayout implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.j9 {
    public boolean A;
    public int B;
    public int C;
    public TLRPC.PhotoSize D;
    public String E;
    public TLRPC.PhotoSize F;
    public String G;
    public TLRPC.Photo H;
    public final int I;
    public TL_iv.pageBlockPhoto J;
    public TLObject K;
    public TL_iv.PageBlock L;
    public boolean M;
    public MessageObject.GroupedMessagePosition N;
    public Drawable O;
    public boolean P;
    public final d70 f38431a;
    public final k4 f38432b;
    public f3 f38433c;
    public f3 d;
    public final ImageReceiver f38434e;
    public final RadialProgress2 f38435f;
    public final g1 h;
    public final int f38436n;
    public boolean f38437r;
    public int f38438s;
    public int v;
    public int f38439w;
    public int f38440x;
    public int f38441y;

    public g2(Context context, d70 d70Var, k4 k4Var, int i10) {
        super(context);
        this.f38431a = d70Var;
        this.f38432b = k4Var;
        setWillNotDraw(false);
        this.f38434e = new ImageReceiver(this);
        g1 g1Var = new g1(context, d70Var, k4Var, 1);
        this.h = g1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f38435f = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.I = DownloadController.getInstance(((m4) d70Var).T).generateObserverTag();
        addView(g1Var, i7.f6.c(-2.0f, -1));
        this.f38436n = i10;
    }

    private int getIconForCurrentState() {
        int i10 = this.B;
        if (i10 == 0) {
            return 2;
        }
        if (i10 == 1) {
            return 3;
        }
        return 4;
    }

    public final void a(TL_iv.pageBlockPhoto pageblockphoto, TLObject tLObject, boolean z10, boolean z11) {
        this.L = null;
        this.J = pageblockphoto;
        this.K = tLObject;
        this.M = z10;
        this.f38437r = z11;
        this.h.setVisibility(4);
        if (!TextUtils.isEmpty(this.J.url)) {
            this.O = getResources().getDrawable(R.drawable.msg_instant_link);
        }
        TL_iv.pageBlockPhoto pageblockphoto2 = this.J;
        if (pageblockphoto2 != null) {
            TLRPC.Photo d = j4.d(pageblockphoto2.photo_id, this.K);
            if (d != null) {
                this.D = FileLoader.getClosestPhotoSizeWithSize(d.sizes, AndroidUtilities.getPhotoSize());
            } else {
                this.D = null;
            }
        } else {
            this.D = null;
        }
        b(false);
        requestLayout();
    }

    public final void b(boolean z10) {
        boolean z11;
        int i10 = ((m4) this.f38431a).T;
        String attachFileName = FileLoader.getAttachFileName(this.D);
        File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(this.D, true);
        File pathToAttach2 = FileLoader.getInstance(i10).getPathToAttach(this.D, false);
        if (!pathToAttach.exists() && (pathToAttach2 == null || !pathToAttach2.exists())) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.f38435f;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z11) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            this.B = -1;
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, null, this);
            float f9 = 0.0f;
            if (!this.P && !FileLoader.getInstance(i10).isLoadingFile(attachFileName)) {
                this.B = 0;
            } else {
                this.B = 1;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                if (fileProgress != null) {
                    f9 = fileProgress.floatValue();
                }
            }
            radialProgress2.setIcon(getIconForCurrentState(), true, z10);
            radialProgress2.o(f9, false);
        }
        invalidate();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f38433c;
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
        return this.J;
    }

    public TLObject getCurrentPage() {
        return this.K;
    }

    public ImageReceiver getImageView() {
        return this.f38434e;
    }

    @Override
    public int getObserverTag() {
        return this.I;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38434e.onAttachedToWindow();
        b(false);
        f3 f3Var = this.f38433c;
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
        this.f38434e.onDetachedFromWindow();
        DownloadController.getInstance(((m4) this.f38431a).T).removeLoadingFileObserver(this);
        f3 f3Var = this.f38433c;
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
        if (this.J == null) {
            return;
        }
        ImageReceiver imageReceiver = this.f38434e;
        if (imageReceiver.hasBitmapImage() && imageReceiver.getCurrentAlpha() == 1.0f) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2(), m4.f40376k1);
        }
        imageReceiver.draw(canvas2);
        if (imageReceiver.getVisible()) {
            this.f38435f.draw(canvas2);
        }
        if (!TextUtils.isEmpty(this.J.url) && !(this.H instanceof org.telegram.ui.web.e2)) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(35.0f);
            int imageY = (int) (imageReceiver.getImageY() + AndroidUtilities.dp(11.0f));
            this.O.setBounds(measuredWidth, imageY, AndroidUtilities.dp(24.0f) + measuredWidth, AndroidUtilities.dp(24.0f) + imageY);
            this.O.draw(canvas2);
        }
        f3 f3Var = this.f38433c;
        d70 d70Var = this.f38431a;
        int i10 = 0;
        if (f3Var != null) {
            canvas2.save();
            canvas2.translate(this.f38438s, this.v);
            m4.v(d70Var, canvas2, this, 0);
            this.f38433c.draw(canvas2, this);
            canvas2.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas2.save();
            canvas2.translate(this.f38438s, this.v + this.f38439w);
            m4.v(d70Var, canvas2, this, i10);
            this.d.draw(canvas2, this);
            canvas2.restore();
        }
        m4.u(canvas2, d70Var, this.J, getMeasuredHeight());
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
        if (this.f38433c != null) {
            sb2.append(", ");
            sb2.append(this.f38433c.d.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
    }

    @Override
    public final void onMeasure(int r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g2.onMeasure(int, int):void");
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.f38435f.o(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
        if (this.B != 1) {
            b(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f38435f.o(1.0f, true);
        b(true);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setParentBlock(TL_iv.PageBlock pageBlock) {
        TL_iv.pageBlockChannel pageblockchannel;
        this.L = pageBlock;
        k4 k4Var = this.f38432b;
        if (k4Var != null && (pageblockchannel = k4Var.B) != null && (pageBlock instanceof TL_iv.pageBlockCover)) {
            g1 g1Var = this.h;
            g1Var.setBlock(pageblockchannel);
            g1Var.setVisibility(0);
        }
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
