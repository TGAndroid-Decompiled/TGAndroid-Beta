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
import org.telegram.ui.Components.lp;
public final class z5 extends FrameLayout {
    public org.telegram.ui.Components.p9 f22655a;
    public FrameLayout f22656b;
    public lp f22657c;
    public TextView d;
    public dg.s1 e;
    public int f22658f;
    public int h;

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22657c.b(org.telegram.ui.ActionBar.j6.W9, org.telegram.ui.ActionBar.j6.X9, org.telegram.ui.ActionBar.j6.V9);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f22658f + this.h, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f22658f, 1073741824));
    }

    public void setImage(MediaController.PhotoEntry photoEntry) {
        dg.s1 s1Var = this.e;
        org.telegram.ui.Components.p9 p9Var = this.f22655a;
        Drawable drawable = getResources().getDrawable(R.drawable.nophotos);
        String str = photoEntry.thumbPath;
        if (str != null) {
            p9Var.f(str, null, drawable);
        } else if (photoEntry.path != null) {
            p9Var.p(photoEntry.orientation, photoEntry.invert, true);
            if (photoEntry.isLivePhoto()) {
                s1Var.setVisibility(4);
                setContentDescription(LocaleController.getString(R.string.AttachLivePhoto));
                p9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, drawable);
            } else if (photoEntry.isVideo) {
                s1Var.setVisibility(0);
                this.d.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
                StringBuilder sb = new StringBuilder();
                org.telegram.ui.b.i(R.string.AttachVideo, ", ", sb);
                sb.append(LocaleController.formatDuration(photoEntry.duration));
                setContentDescription(sb.toString());
                p9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, drawable);
            } else {
                s1Var.setVisibility(4);
                setContentDescription(LocaleController.getString(R.string.AttachPhoto));
                p9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, drawable);
            }
        } else {
            p9Var.setImageDrawable(drawable);
        }
    }

    public void setNum(int i10) {
        this.f22657c.setNum(i10);
    }

    public void setImage(MediaController.SearchImage searchImage) {
        org.telegram.ui.Components.p9 p9Var = this.f22655a;
        Drawable drawable = getResources().getDrawable(R.drawable.nophotos);
        TLRPC.PhotoSize photoSize = searchImage.thumbPhotoSize;
        if (photoSize != null) {
            p9Var.h(ImageLocation.getForPhoto(photoSize, searchImage.photo), null, drawable, searchImage);
            return;
        }
        TLRPC.PhotoSize photoSize2 = searchImage.photoSize;
        if (photoSize2 != null) {
            p9Var.h(ImageLocation.getForPhoto(photoSize2, searchImage.photo), "80_80", drawable, searchImage);
            return;
        }
        String str = searchImage.thumbPath;
        if (str != null) {
            p9Var.f(str, null, drawable);
            return;
        }
        String str2 = searchImage.thumbUrl;
        if (str2 != null && str2.length() > 0) {
            p9Var.f(searchImage.thumbUrl, null, drawable);
        } else if (MessageObject.isDocumentHasThumb(searchImage.document)) {
            p9Var.h(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(searchImage.document.thumbs, 320), searchImage.document), null, drawable, searchImage);
        } else {
            p9Var.setImageDrawable(drawable);
        }
    }
}
