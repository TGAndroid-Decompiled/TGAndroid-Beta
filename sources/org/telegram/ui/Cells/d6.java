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
import org.telegram.ui.Components.zp;
public final class d6 extends FrameLayout {
    public org.telegram.ui.Components.y9 f24007a;
    public FrameLayout f24008b;
    public zp f24009c;
    public TextView d;
    public bi.j5 e;
    public int f24010f;
    public int h;

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24009c.b(org.telegram.ui.ActionBar.y6.W9, org.telegram.ui.ActionBar.y6.X9, org.telegram.ui.ActionBar.y6.V9);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f24010f + this.h, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f24010f, 1073741824));
    }

    public void setImage(MediaController.PhotoEntry photoEntry) {
        bi.j5 j5Var = this.e;
        org.telegram.ui.Components.y9 y9Var = this.f24007a;
        Drawable drawable = getResources().getDrawable(R.drawable.nophotos);
        String str = photoEntry.thumbPath;
        if (str != null) {
            y9Var.g(str, null, drawable);
        } else if (photoEntry.path != null) {
            y9Var.p(photoEntry.orientation, photoEntry.invert, true);
            if (photoEntry.isLivePhoto()) {
                j5Var.setVisibility(4);
                setContentDescription(LocaleController.getString(R.string.AttachLivePhoto));
                y9Var.g("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, drawable);
            } else if (photoEntry.isVideo) {
                j5Var.setVisibility(0);
                this.d.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.d3.p(R.string.AttachVideo, ", ", sb2);
                sb2.append(LocaleController.formatDuration(photoEntry.duration));
                setContentDescription(sb2.toString());
                y9Var.g("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, drawable);
            } else {
                j5Var.setVisibility(4);
                setContentDescription(LocaleController.getString(R.string.AttachPhoto));
                y9Var.g("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, drawable);
            }
        } else {
            y9Var.setImageDrawable(drawable);
        }
    }

    public void setNum(int i10) {
        this.f24009c.setNum(i10);
    }

    public void setImage(MediaController.SearchImage searchImage) {
        org.telegram.ui.Components.y9 y9Var = this.f24007a;
        Drawable drawable = getResources().getDrawable(R.drawable.nophotos);
        TLRPC.PhotoSize photoSize = searchImage.thumbPhotoSize;
        if (photoSize != null) {
            y9Var.h(ImageLocation.getForPhoto(photoSize, searchImage.photo), null, drawable, searchImage);
            return;
        }
        TLRPC.PhotoSize photoSize2 = searchImage.photoSize;
        if (photoSize2 != null) {
            y9Var.h(ImageLocation.getForPhoto(photoSize2, searchImage.photo), "80_80", drawable, searchImage);
            return;
        }
        String str = searchImage.thumbPath;
        if (str != null) {
            y9Var.g(str, null, drawable);
            return;
        }
        String str2 = searchImage.thumbUrl;
        if (str2 != null && str2.length() > 0) {
            y9Var.g(searchImage.thumbUrl, null, drawable);
        } else if (MessageObject.isDocumentHasThumb(searchImage.document)) {
            y9Var.h(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(searchImage.document.thumbs, 320), searchImage.document), null, drawable, searchImage);
        } else {
            y9Var.setImageDrawable(drawable);
        }
    }
}
