package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
@SuppressLint({"ViewConstructor"})
public class HashtagHistoryView extends FrameLayout {
    private UniversalAdapter adapter;
    private AnimatorSet animation;
    private int currentAccount;
    private ImageView emptyImage;
    private TextView emptyText;
    public FrameLayout emptyView;
    private ArrayList<String> history;
    private UniversalRecyclerView recyclerView;
    private Theme.ResourcesProvider resourcesProvider;

    protected void onClick(String str) {
        throw null;
    }

    public HashtagHistoryView(Context context, Theme.ResourcesProvider resourcesProvider, int i) {
        super(context);
        this.currentAccount = i;
        this.resourcesProvider = resourcesProvider;
        setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, i, 0, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                HashtagHistoryView.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, new Utilities.Callback5() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                HashtagHistoryView.this.onClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
            }
        }, new Utilities.Callback5Return() {
            @Override
            public final Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                boolean onLongClick;
                onLongClick = HashtagHistoryView.this.onLongClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
                return Boolean.valueOf(onLongClick);
            }
        }, resourcesProvider);
        this.recyclerView = universalRecyclerView;
        this.adapter = (UniversalAdapter) universalRecyclerView.getAdapter();
        addView(this.recyclerView, -1, -1);
        this.emptyView = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        this.emptyImage = imageView;
        int i2 = Theme.key_windowBackgroundWhiteGrayIcon;
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, resourcesProvider), PorterDuff.Mode.MULTIPLY));
        this.emptyImage.setScaleType(ImageView.ScaleType.CENTER);
        this.emptyImage.setImageResource(R.drawable.large_hashtags);
        this.emptyView.addView(this.emptyImage, LayoutHelper.createFrame(56, 56, 49));
        TextView textView = new TextView(context);
        this.emptyText = textView;
        textView.setTextColor(Theme.getColor(i2, resourcesProvider));
        this.emptyText.setText(LocaleController.getString(R.string.HashtagSearchPlaceholder));
        this.emptyText.setGravity(17);
        this.emptyView.addView(this.emptyText, LayoutHelper.createFrame(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(this.emptyView, LayoutHelper.createFrame(210, -2, 17));
        this.recyclerView.setEmptyView(this.emptyView);
    }

    public void show(final boolean z) {
        if (z == isShowing()) {
            return;
        }
        AnimatorSet animatorSet = this.animation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.animation = null;
        }
        if (z) {
            setVisibility(0);
        }
        setTag(z ? 1 : null);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.animation = animatorSet2;
        Animator[] animatorArr = new Animator[1];
        Property property = View.ALPHA;
        float[] fArr = new float[1];
        fArr[0] = z ? 1.0f : 0.0f;
        animatorArr[0] = ObjectAnimator.ofFloat(this, property, fArr);
        animatorSet2.playTogether(animatorArr);
        this.animation.setInterpolator(CubicBezierInterpolator.EASE_IN);
        this.animation.setDuration(180L);
        this.animation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (animator.equals(HashtagHistoryView.this.animation)) {
                    HashtagHistoryView.this.animation = null;
                    if (z) {
                        return;
                    }
                    HashtagHistoryView.this.setVisibility(8);
                }
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                if (animator.equals(HashtagHistoryView.this.animation)) {
                    HashtagHistoryView.this.animation = null;
                }
            }
        });
        this.animation.start();
    }

    public boolean isShowing() {
        return getTag() != null;
    }

    public void update() {
        this.adapter.update(true);
    }

    public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
        ArrayList<String> arrayList2 = new ArrayList<>(0);
        this.history = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(this.currentAccount).history);
        if (this.history.isEmpty()) {
            return;
        }
        int i = 0;
        while (i < this.history.size()) {
            i++;
            arrayList.add(UItem.asButton(i, R.drawable.menu_hashtag, this.history.get(i)));
        }
        arrayList.add(UItem.asButton(0, R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearHistory)));
    }

    public void onClick(UItem uItem, View view, int i, float f, float f2) {
        int i2 = uItem.id;
        if (i2 == 0) {
            HashtagSearchController.getInstance(this.currentAccount).clearHistory();
            update();
            return;
        }
        onClick(this.history.get(i2 - 1));
    }

    public boolean onLongClick(UItem uItem, View view, int i, float f, float f2) {
        int i2 = uItem.id;
        if (i2 != 0) {
            final String str = this.history.get(i2 - 1);
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), this.resourcesProvider);
            builder.setTitle(LocaleController.getString("ClearSearchSingleAlertTitle", R.string.ClearSearchSingleAlertTitle));
            int i3 = R.string.ClearSearchSingleHashtagAlertText;
            builder.setMessage(LocaleController.formatString(i3, "#" + str));
            builder.setPositiveButton(LocaleController.getString("ClearSearchRemove", R.string.ClearSearchRemove), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    HashtagHistoryView.this.lambda$onLongClick$0(str, dialogInterface, i4);
                }
            });
            builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            builder.create().show();
            return true;
        }
        return false;
    }

    public void lambda$onLongClick$0(String str, DialogInterface dialogInterface, int i) {
        HashtagSearchController.getInstance(this.currentAccount).removeHashtagFromHistory(str);
        update();
    }
}
