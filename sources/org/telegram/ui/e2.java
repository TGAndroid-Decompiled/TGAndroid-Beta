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
public final class e2 extends FrameLayout implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.p9 {
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
    public final s70 f33099a;
    public final h4 f33100b;
    public c3 f33101c;
    public c3 d;
    public final ImageReceiver e;
    public final RadialProgress2 f33102f;
    public final e1 h;
    public final int f33103n;
    public boolean f33104r;
    public int f33105s;
    public int v;
    public int f33106w;
    public int f33107x;
    public int f33108y;

    public e2(Context context, s70 s70Var, h4 h4Var, int i10) {
        super(context);
        this.f33099a = s70Var;
        this.f33100b = h4Var;
        setWillNotDraw(false);
        this.e = new ImageReceiver(this);
        e1 e1Var = new e1(context, s70Var, h4Var, 1);
        this.h = e1Var;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f33102f = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.M = DownloadController.getInstance(((j4) s70Var).X).generateObserverTag();
        addView(e1Var, w7.y5.c(-2.0f, -1));
        this.f33103n = i10;
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
        this.f33104r = z11;
        this.h.setVisibility(4);
        if (!TextUtils.isEmpty(this.N.url)) {
            this.S = getResources().getDrawable(R.drawable.msg_instant_link);
        }
        TL_iv.pageBlockPhoto pageblockphoto2 = this.N;
        if (pageblockphoto2 != null) {
            TLRPC.Photo d = g4.d(pageblockphoto2.photo_id, this.O);
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
        int i10 = ((j4) this.f33099a).X;
        String attachFileName = FileLoader.getAttachFileName(this.H);
        File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(this.H, true);
        File pathToAttach2 = FileLoader.getInstance(i10).getPathToAttach(this.H, false);
        if (!pathToAttach.exists() && (pathToAttach2 == null || !pathToAttach2.exists())) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.f33102f;
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
        c3 c3Var = this.f33101c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            arrayList.add(c3Var2);
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
        c3 c3Var = this.f33101c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            c3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.onDetachedFromWindow();
        DownloadController.getInstance(((j4) this.f33099a).X).removeLoadingFileObserver(this);
        c3 c3Var = this.f33101c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            c3Var2.detach(this);
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
            canvas2.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2(), j4.f34595o1);
        }
        imageReceiver.draw(canvas2);
        if (imageReceiver.getVisible()) {
            this.f33102f.draw(canvas2);
        }
        if (!TextUtils.isEmpty(this.N.url) && !(this.L instanceof org.telegram.ui.web.i2)) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(35.0f);
            int imageY = (int) (imageReceiver.getImageY() + AndroidUtilities.dp(11.0f));
            this.S.setBounds(measuredWidth, imageY, AndroidUtilities.dp(24.0f) + measuredWidth, AndroidUtilities.dp(24.0f) + imageY);
            this.S.draw(canvas2);
        }
        c3 c3Var = this.f33101c;
        s70 s70Var = this.f33099a;
        int i10 = 0;
        if (c3Var != null) {
            canvas2.save();
            canvas2.translate(this.f33105s, this.v);
            j4.v(s70Var, canvas2, this, 0);
            this.f33101c.draw(canvas2, this);
            canvas2.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas2.save();
            canvas2.translate(this.f33105s, this.v + this.f33106w);
            j4.v(s70Var, canvas2, this, i10);
            this.d.draw(canvas2, this);
            canvas2.restore();
        }
        j4.u(canvas2, s70Var, this.N, getMeasuredHeight());
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
        if (this.f33101c != null) {
            sb2.append(", ");
            sb2.append(this.f33101c.d.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
    }

    @Override
    public final void onMeasure(int r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e2.onMeasure(int, int):void");
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
        this.f33102f.o(Math.min(1.0f, ((float) j3) / ((float) j10)), true);
        if (this.F != 1) {
            b(true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f33102f.o(1.0f, true);
        b(true);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setParentBlock(TL_iv.PageBlock pageBlock) {
        TL_iv.pageBlockChannel pageblockchannel;
        this.P = pageBlock;
        h4 h4Var = this.f33100b;
        if (h4Var != null && (pageblockchannel = h4Var.F) != null && (pageBlock instanceof TL_iv.pageBlockCover)) {
            e1 e1Var = this.h;
            e1Var.setBlock(pageblockchannel);
            e1Var.setVisibility(0);
        }
    }

    @Override
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
