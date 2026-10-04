package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qp;
public final class z5 extends FrameLayout {
    public org.telegram.ui.Components.w9 f23802a;
    public FrameLayout f23803b;
    public qp f23804c;
    public TextView d;
    public org.telegram.ui.u5 f23805e;
    public int f23806f;
    public int h;

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f23804c.b(org.telegram.ui.ActionBar.i6.W9, org.telegram.ui.ActionBar.i6.X9, org.telegram.ui.ActionBar.i6.V9);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f23806f + this.h, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f23806f, 1073741824));
    }

    public void setImage(MediaController.PhotoEntry photoEntry) {
        org.telegram.ui.u5 u5Var = this.f23805e;
        org.telegram.ui.Components.w9 w9Var = this.f23802a;
        Drawable drawable = getResources().getDrawable(R.drawable.nophotos);
        String str = photoEntry.thumbPath;
        if (str != null) {
            w9Var.f(str, null, drawable);
        } else if (photoEntry.path != null) {
            w9Var.p(photoEntry.orientation, photoEntry.invert, true);
            if (photoEntry.isLivePhoto()) {
                u5Var.setVisibility(4);
                setContentDescription(LocaleController.getString(R.string.AttachLivePhoto));
                w9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, drawable);
            } else if (photoEntry.isVideo) {
                u5Var.setVisibility(0);
                this.d.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
                StringBuilder sb2 = new StringBuilder();
                c1.n(R.string.AttachVideo, ", ", sb2);
                sb2.append(LocaleController.formatDuration(photoEntry.duration));
                setContentDescription(sb2.toString());
                w9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, drawable);
            } else {
                u5Var.setVisibility(4);
                setContentDescription(LocaleController.getString(R.string.AttachPhoto));
                w9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, drawable);
            }
        } else {
            w9Var.setImageDrawable(drawable);
        }
    }

    public void setNum(int i10) {
        this.f23804c.setNum(i10);
    }

    public void setImage(MediaController.SearchImage searchImage) {
        org.telegram.ui.Components.w9 w9Var = this.f23802a;
        Drawable drawable = getResources().getDrawable(R.drawable.nophotos);
        TLRPC.PhotoSize photoSize = searchImage.thumbPhotoSize;
        if (photoSize != null) {
            w9Var.h(ImageLocation.getForPhoto(photoSize, searchImage.photo), null, drawable, searchImage);
            return;
        }
        TLRPC.PhotoSize photoSize2 = searchImage.photoSize;
        if (photoSize2 != null) {
            w9Var.h(ImageLocation.getForPhoto(photoSize2, searchImage.photo), "80_80", drawable, searchImage);
            return;
        }
        String str = searchImage.thumbPath;
        if (str != null) {
            w9Var.f(str, null, drawable);
            return;
        }
        String str2 = searchImage.thumbUrl;
        if (str2 != null && str2.length() > 0) {
            w9Var.f(searchImage.thumbUrl, null, drawable);
        } else if (MessageObject.isDocumentHasThumb(searchImage.document)) {
            w9Var.h(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(searchImage.document.thumbs, 320), searchImage.document), null, drawable, searchImage);
        } else {
            w9Var.setImageDrawable(drawable);
        }
    }
}
