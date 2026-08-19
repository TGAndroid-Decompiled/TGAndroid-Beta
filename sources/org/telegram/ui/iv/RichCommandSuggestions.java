package org.telegram.ui.iv;

import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;

public class RichCommandSuggestions {
    private RichTextCell backgroundCell;
    private RichTextCell cell;
    private LinearLayout content;
    private final MenuFactory menuFactory;
    private ItemOptions options;
    private final Theme.ResourcesProvider resourcesProvider;
    private ArrayList shown;

    public interface MenuFactory {
        ItemOptions make(View view);
    }

    public RichCommandSuggestions(MenuFactory menuFactory, Theme.ResourcesProvider resourcesProvider) {
        this.menuFactory = menuFactory;
        this.resourcesProvider = resourcesProvider;
    }

    public void update(RichTextCell richTextCell, String str) {
        ItemOptions itemOptions;
        ItemOptions itemOptions2;
        if (str == null) {
            hide();
            return;
        }
        ArrayList arrayListMatch = RichCommand.match(str);
        if (arrayListMatch.isEmpty()) {
            hide();
            return;
        }
        setBackgroundCell(richTextCell);
        if (this.cell == richTextCell && arrayListMatch.equals(this.shown) && (itemOptions2 = this.options) != null && itemOptions2.isShown()) {
            return;
        }
        if (this.cell == richTextCell && (itemOptions = this.options) != null && itemOptions.isShown() && this.content != null) {
            this.shown = arrayListMatch;
            populate(richTextCell, arrayListMatch);
            this.options.reposition();
        } else {
            hide();
            setBackgroundCell(richTextCell);
            this.cell = richTextCell;
            this.shown = arrayListMatch;
            show(richTextCell, arrayListMatch);
        }
    }

    private void show(RichTextCell richTextCell, ArrayList arrayList) {
        LinearLayout linearLayout = new LinearLayout(richTextCell.getContext());
        this.content = linearLayout;
        linearLayout.setOrientation(1);
        populate(richTextCell, arrayList);
        ItemOptions drawScrim = this.menuFactory.make(richTextCell.getEditText()).dontFocus().setDimAlpha(0).setDrawScrim(false);
        drawScrim.addView(this.content, LayoutHelper.createLinear(220, -2));
        drawScrim.setMaxHeight(AndroidUtilities.dp(240.0f));
        drawScrim.setGravity(3);
        drawScrim.translate(-AndroidUtilities.dp(12.0f), 0.0f);
        drawScrim.setOnDismiss(new Runnable() {
            @Override
            public final void run() {
                RichCommandSuggestions.$r8$lambda$5vSAbotoQ3dRUMmruLrHbQqTo8w(this.f$0);
            }
        });
        drawScrim.followScrimView();
        drawScrim.show();
        this.options = drawScrim;
    }

    public static void $r8$lambda$5vSAbotoQ3dRUMmruLrHbQqTo8w(RichCommandSuggestions richCommandSuggestions) {
        richCommandSuggestions.options = null;
        richCommandSuggestions.content = null;
        richCommandSuggestions.shown = null;
        richCommandSuggestions.cell = null;
        richCommandSuggestions.setBackgroundCell(null);
    }

    private void populate(final RichTextCell richTextCell, ArrayList arrayList) {
        LinearLayout linearLayout = this.content;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            final RichCommand richCommand = (RichCommand) obj;
            RichCommand.View view = new RichCommand.View(richTextCell.getContext(), richCommand, this.resourcesProvider);
            view.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f), 0);
            view.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, this.resourcesProvider), 0, 0));
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    RichCommandSuggestions.$r8$lambda$dRZU8LEifSuuuKNyFqQYSjIYvo0(this.f$0, richTextCell, richCommand, view2);
                }
            });
            this.content.addView(view, LayoutHelper.createLinear(-1, 48));
        }
    }

    public static void $r8$lambda$dRZU8LEifSuuuKNyFqQYSjIYvo0(RichCommandSuggestions richCommandSuggestions, RichTextCell richTextCell, RichCommand richCommand, View view) {
        richCommandSuggestions.hide();
        richTextCell.selectCommand(richCommand);
    }

    public void hide() {
        setBackgroundCell(null);
        ItemOptions itemOptions = this.options;
        if (itemOptions != null) {
            itemOptions.dismiss();
            this.options = null;
        }
        this.content = null;
        this.shown = null;
        this.cell = null;
    }

    private void setBackgroundCell(RichTextCell richTextCell) {
        RichTextCell richTextCell2 = this.backgroundCell;
        if (richTextCell2 == richTextCell) {
            return;
        }
        if (richTextCell2 != null) {
            richTextCell2.setShowCommandBackground(false);
        }
        this.backgroundCell = richTextCell;
        if (richTextCell != null) {
            richTextCell.setShowCommandBackground(true);
        }
    }
}
