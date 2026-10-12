package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
public final class ez extends org.telegram.ui.Components.lm0 {
    public final Context f35692c;
    public final hz d;

    public ez(hz hzVar, Context context) {
        this.d = hzVar;
        this.f35692c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f44841f;
        if (i10 == 1 || i10 == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.v;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        hz hzVar = this.d;
        if (i10 == hzVar.h) {
            return 1;
        }
        if (i10 == hzVar.f36990s) {
            return 0;
        }
        return 3;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f44841f;
        View view = b1Var.f44838a;
        boolean z10 = true;
        hz hzVar = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 3) {
                    org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                    Long l4 = (Long) hzVar.e.get(i10 - hzVar.f36988n);
                    long longValue = l4.longValue();
                    if (DialogObject.isUserDialog(longValue)) {
                        TLRPC.User user = hzVar.getMessagesController().getUser(l4);
                        if (i10 == hzVar.f36989r - 1) {
                            z10 = false;
                        }
                        g4Var.e(user, null, null, z10);
                        return;
                    }
                    TLRPC.Chat chat = hzVar.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (i10 == hzVar.f36989r - 1) {
                        z10 = false;
                    }
                    g4Var.e(chat, null, null, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            r8Var.e(-1, org.telegram.ui.ActionBar.g6.q6);
            Context context = this.f35692c;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(x02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20029k7, false), mode));
            org.telegram.ui.Components.cr crVar = new org.telegram.ui.Components.cr(drawable, drawable2);
            String string = LocaleController.getString(R.string.SelectChats);
            if (hzVar.f36988n == -1) {
                z10 = false;
            }
            r8Var.n(string, crVar, z10);
            r8Var.getImageView().setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
            return;
        }
        org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
        if (i10 == hzVar.f36990s) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i12 = hzVar.f36991w;
            if (i12 == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetChatsInfo));
            } else if (i12 == 1) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetContactsInfo));
            }
            if (SharedConfig.passcodeHash.length() > 0) {
                spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.WidgetPasscode2)));
            }
            e9Var.setText(spannableStringBuilder);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        gz gzVar;
        int i11;
        Context context = this.f35692c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    FrameLayout g4Var = new org.telegram.ui.Cells.g4(0, 0, context, false);
                    ImageView imageView = new ImageView(context);
                    imageView.setImageResource(R.drawable.list_reorder);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    g4Var.setTag(R.id.object_tag, imageView);
                    if (LocaleController.isRTL) {
                        i11 = 3;
                    } else {
                        i11 = 5;
                    }
                    g4Var.addView(imageView, w7.a6.a(-1.0f, 10.0f, 0.0f, 10.0f, 0.0f, 40, i11 | 16));
                    imageView.setOnTouchListener(new di.p1(5, this, g4Var));
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19865b9, false), PorterDuff.Mode.MULTIPLY));
                    gzVar = g4Var;
                } else {
                    hz hzVar = this.d;
                    gz gzVar2 = new gz(hzVar, context);
                    hzVar.f36987f = gzVar2;
                    gzVar = gzVar2;
                }
            } else {
                FrameLayout r8Var = new org.telegram.ui.Cells.r8(context);
                r8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
                gzVar = r8Var;
            }
        } else {
            FrameLayout e9Var = new org.telegram.ui.Cells.e9(context);
            e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f19863b7));
            gzVar = e9Var;
        }
        return new s4.b1(gzVar);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        int i10 = b1Var.f44841f;
        if (i10 != 3 && i10 != 1) {
            return;
        }
        b1Var.f44838a.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
    }
}
