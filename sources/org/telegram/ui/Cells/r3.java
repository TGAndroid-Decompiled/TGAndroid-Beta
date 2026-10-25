package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.tl.TL_feed;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
public final class r3 extends s61 {
    public static final int f24958a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        Drawable drawable;
        u3 u3Var = (u3) view;
        s3 s3Var = (s3) t61Var.G;
        ArrayList arrayList = u3Var.d;
        int i10 = 0;
        if (arrayList != null) {
            ArrayList arrayList2 = s3Var.f25386a;
            if (arrayList.equals(arrayList2)) {
                while (i10 < arrayList2.size()) {
                    int i11 = i10 + 1;
                    t3 t3Var = (t3) u3Var.getChildAt(i11);
                    int i12 = ((TL_feed.InterestCategory) arrayList2.get(i10)).f22244id;
                    t3Var.a(s3Var.f25387b.contains(Integer.valueOf(i12)), true);
                    t3Var.setOnClickListener(new ai.w(s3Var, i12, 8));
                    i10 = i11;
                }
                return;
            }
        }
        u3Var.d = new ArrayList(s3Var.f25386a);
        while (u3Var.getChildCount() > 1) {
            u3Var.removeViewAt(u3Var.getChildCount() - 1);
        }
        ArrayList arrayList3 = s3Var.f25386a;
        int size = arrayList3.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList3.get(i13);
            i13++;
            TL_feed.InterestCategory interestCategory = (TL_feed.InterestCategory) obj;
            t3 t3Var2 = new t3(u3Var, u3Var.getContext());
            t3Var2.setTextSize(13.0f);
            t3Var2.setTypeface(AndroidUtilities.bold());
            t3Var2.setIncludeFontPadding(false);
            t3Var2.setGravity(17);
            t3Var2.setText(interestCategory.title);
            t3Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(11.0f), 0);
            if (interestCategory.emoji_document_id != 0) {
                org.telegram.ui.Components.r5 r5Var = new org.telegram.ui.Components.r5(AndroidUtilities.dp(19.0f), t3Var2);
                t3Var2.f25435a = r5Var;
                r5Var.f32099x = Integer.valueOf(u3Var.f25477c);
                t3Var2.f25435a.j(interestCategory.emoji_document_id, false);
                drawable = t3Var2.f25435a;
            } else {
                String str = interestCategory.emoji;
                if (str != null) {
                    drawable = Emoji.getEmojiDrawable(str);
                    if (drawable == null) {
                        drawable = Emoji.getEmojiDrawable(interestCategory.emoji.replace("️", ""));
                    }
                    if (drawable == null) {
                        t3Var2.setText(interestCategory.emoji + " " + interestCategory.title);
                    }
                } else {
                    drawable = null;
                }
            }
            if (drawable != null) {
                drawable.setBounds(0, 0, AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f));
                t3Var2.setCompoundDrawablesRelative(drawable, null, null, null);
                t3Var2.setCompoundDrawablePadding(AndroidUtilities.dp(5.0f));
            }
            t3Var2.a(s3Var.f25387b.contains(Integer.valueOf(interestCategory.f22244id)), false);
            gb1.b(t3Var2);
            t3Var2.setContentDescription(interestCategory.title);
            t3Var2.setOnClickListener(new w2(1, s3Var, interestCategory));
            u3Var.addView(t3Var2);
        }
    }

    @Override
    public final boolean contentsEquals(t61 t61Var, t61 t61Var2) {
        s3 s3Var = (s3) t61Var.G;
        s3 s3Var2 = (s3) t61Var2.G;
        if (s3Var.f25386a.equals(s3Var2.f25386a) && s3Var.f25387b.equals(s3Var2.f25387b)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new u3(context, i10, u6Var);
    }

    @Override
    public final boolean equals(t61 t61Var, t61 t61Var2) {
        return true;
    }
}
