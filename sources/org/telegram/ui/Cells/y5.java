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
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mp;
public final class y5 extends FrameLayout {
    public org.telegram.ui.Components.x9 f23563a;
    public FrameLayout f23564b;
    public mp f23565c;
    public TextView d;
    public org.telegram.ui.t5 f23566e;
    public int f23567f;
    public int h;

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f23565c.b(org.telegram.ui.ActionBar.j6.W9, org.telegram.ui.ActionBar.j6.X9, org.telegram.ui.ActionBar.j6.V9);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f23567f + this.h, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f23567f, 1073741824));
    }

    public void setImage(MediaController.PhotoEntry photoEntry) {
        org.telegram.ui.t5 t5Var = this.f23566e;
        org.telegram.ui.Components.x9 x9Var = this.f23563a;
        Drawable drawable = getResources().getDrawable(R.drawable.nophotos);
        String str = photoEntry.thumbPath;
        if (str != null) {
            x9Var.f(str, null, drawable);
        } else if (photoEntry.path != null) {
            x9Var.p(photoEntry.orientation, photoEntry.invert, true);
            if (photoEntry.isLivePhoto()) {
                t5Var.setVisibility(4);
                setContentDescription(LocaleController.getString(R.string.AttachLivePhoto));
                x9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, drawable);
            } else if (photoEntry.isVideo) {
                t5Var.setVisibility(0);
                this.d.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
                StringBuilder sb2 = new StringBuilder();
                wl.l(R.string.AttachVideo, ", ", sb2);
                sb2.append(LocaleController.formatDuration(photoEntry.duration));
                setContentDescription(sb2.toString());
                x9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, drawable);
            } else {
                t5Var.setVisibility(4);
                setContentDescription(LocaleController.getString(R.string.AttachPhoto));
                x9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, drawable);
            }
        } else {
            x9Var.setImageDrawable(drawable);
        }
    }

    public void setNum(int i10) {
        this.f23565c.setNum(i10);
    }

    public void setImage(MediaController.SearchImage searchImage) {
        org.telegram.ui.Components.x9 x9Var = this.f23563a;
        Drawable drawable = getResources().getDrawable(R.drawable.nophotos);
        TLRPC.PhotoSize photoSize = searchImage.thumbPhotoSize;
        if (photoSize != null) {
            x9Var.h(ImageLocation.getForPhoto(photoSize, searchImage.photo), null, drawable, searchImage);
            return;
        }
        TLRPC.PhotoSize photoSize2 = searchImage.photoSize;
        if (photoSize2 != null) {
            x9Var.h(ImageLocation.getForPhoto(photoSize2, searchImage.photo), "80_80", drawable, searchImage);
            return;
        }
        String str = searchImage.thumbPath;
        if (str != null) {
            x9Var.f(str, null, drawable);
            return;
        }
        String str2 = searchImage.thumbUrl;
        if (str2 != null && str2.length() > 0) {
            x9Var.f(searchImage.thumbUrl, null, drawable);
        } else if (MessageObject.isDocumentHasThumb(searchImage.document)) {
            x9Var.h(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(searchImage.document.thumbs, 320), searchImage.document), null, drawable, searchImage);
        } else {
            x9Var.setImageDrawable(drawable);
        }
    }
}
